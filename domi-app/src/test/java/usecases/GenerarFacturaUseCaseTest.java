package usecases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import command.GenerarFactura;
import events.FacturaGenerada;
import events.OrdenGenerada;
import orden.entity.Factura;
import orden.entity.value.Direccion;
import orden.entity.value.FacturaId;
import orden.values.OrdenId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GenerarFacturaUseCaseTest {

    @Test
    public void generarfactura(){
        //arrange
        //FacturaId facturaId = new FacturaId();

        OrdenId ordenId = new OrdenId();
        Direccion direccion = new Direccion("Calle 70","Laureles");
        Factura factura = new Factura(FacturaId.of("uuuu"), direccion);

        var command = new GenerarFactura(ordenId,factura);
        var usecase = new GenerarFacturaUseCase();

        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (FacturaGenerada)events.get(0);
        Assertions.assertEquals("factura.facturaGenerada", event.type);
        Assertions.assertEquals(ordenId.value(), event.aggregateRootId());
        Assertions.assertEquals(factura.identity().value(), event.getFactura().identity().value());
        //Assertions.assertEquals(direccion.value(), event.get);
    }
}
