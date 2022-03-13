package usecases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import command.AsignarRepartidor;
import events.FacturaGenerada;
import events.OrdenGenerada;
import events.RepartidorAsigando;
import orden.entity.value.*;
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
public class AsignarRepartidorUseCaseTest {

    @Mock
    private DomainEventRepository repository;

    @Test
    void asignarRepartidor(){
        //arrange
        var ordenId = OrdenId.of("dddd");
        var repartiforId = RepartidorId.of("ffff");
        var datos = new DatosPersonales("Pedro", "Perez", "45242355");
        var command = new AsignarRepartidor(ordenId,repartiforId,datos);

        var usecase = new AsignarRepartidorUseCase();
        Mockito.when(repository.getEventsBy("dddd")).thenReturn(history());
        usecase.addRepository(repository);

        //act
        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(ordenId.value())
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (RepartidorAsigando)events.get(0);
        Assertions.assertEquals("orden.asignarrepartidor", event.type);
        Assertions.assertEquals("ffff", event.getRepartidorId().value());
        Assertions.assertEquals(datos, event.getDatosPersonales());
    }

    private List<DomainEvent> history(){
        return List.of(
                new OrdenGenerada(new Precio(5000.0)),
                new FacturaGenerada(FacturaId.of("1"),
                        new Direccion("Calle 15","Laureles"),
                        new Fecha(new Date())),
                new RepartidorAsigando(RepartidorId.of("3"),
                        new DatosPersonales("Juan", "Perez", "677787822"))
        );
    }
}
