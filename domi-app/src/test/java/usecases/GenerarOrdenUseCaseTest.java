package usecases;

import cliente.values.ClienteId;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import command.GenerarOrden;
import events.OrdenGenerada;
import orden.entity.Carrito;
import orden.entity.value.CarritoId;
import orden.entity.value.Platillo;
import orden.values.OrdenId;
import orden.values.Precio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pedido.values.PedidoId;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class GenerarOrdenUseCaseTest {

    @Test
    void crearOrden() {
        //arrange
        var ordenId = OrdenId.of("dddd");
        var precio = new Precio(5000.0);
        var command = new GenerarOrden(ordenId, precio);
        var usecase = new GenerarOrdenUseCase();

        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (OrdenGenerada)events.get(0);
        Assertions.assertEquals("orden.ordengenerada", event.type);
        Assertions.assertEquals("dddd", event.aggregateRootId());
        Assertions.assertEquals(precio.value(), event.getPrecio().value());

    }
}
