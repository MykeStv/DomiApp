package usecases;


import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import command.GenerarFactura;
import events.FacturaGenerada;
import events.OrdenGenerada;
import orden.entity.value.Direccion;
import orden.entity.value.FacturaId;
import orden.entity.value.Fecha;
import orden.values.OrdenId;
import orden.values.Precio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Date;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class GenerarFacturaUseCaseTest {

    @Mock
    private DomainEventRepository repository;

    @Test
    void generarFactura(){
        //arrange
        var ordenId = OrdenId.of("dddd");
        var facturaId = FacturaId.of("gggg");
        var direccion = new Direccion("Carrera 2", "Medellin");
        var fecha = new Fecha(new Date());
        var command = new GenerarFactura(ordenId, facturaId, direccion, fecha);

        var usecase = new GenerarFacturaUseCase();
        Mockito.when(repository.getEventsBy("dddd")).thenReturn(history());
        usecase.addRepository(repository);

        //act
        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(ordenId.value())
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        //assert
        var event = (FacturaGenerada)events.get(0);
        Assertions.assertEquals("orden.facturagenerada", event.type);
        Assertions.assertEquals("gggg", event.getFacturaId().value());
        Assertions.assertEquals(direccion, event.getDireccion());
        Assertions.assertEquals(fecha, event.getFecha());
    }

    private List<DomainEvent> history(){
        return List.of(
                new OrdenGenerada(new Precio(5000.0)),
                new FacturaGenerada(FacturaId.of("1"), new Direccion("Calle 15","Laureles"), new Fecha(new Date()))
        );
    }
}
