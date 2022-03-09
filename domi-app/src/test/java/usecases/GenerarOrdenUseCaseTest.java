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
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pedido.values.PedidoId;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class GenerarOrdenUseCaseTest {

    @Test
    void crearOrden() {
        System.out.println("Test!");
        List<Platillo> platillos = new ArrayList<>();
        Platillo platillo1 = new Platillo(1L, "BandejaPaisa", "Frijoles, carnita, maduro, huevito");
        Platillo platillo2 = new Platillo(2L, "Sancocho", "De todo");
        platillos.add(platillo1);
        platillos.add(platillo2);

        //arrange
        OrdenId ordenId = new OrdenId();
        PedidoId pedidoId = new PedidoId();
        ClienteId clienteId = ClienteId.of("xxxxxx");
        Carrito carrito = new Carrito(CarritoId.of("xxxc001"), platillos);

        var command = new GenerarOrden(ordenId, pedidoId, clienteId, carrito);
        var usecase = new GenerarOrdenUseCase();

        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (OrdenGenerada)events.get(0);
        Assertions.assertEquals("orden.ordenGenerada", event.type);
        Assertions.assertEquals(ordenId.value(), event.aggregateRootId());
        Assertions.assertEquals(clienteId.value(), event.aggregateRootId());
        Assertions.assertEquals("xxxxxx", event.getClienteId().value());
//        Assertions.assertEquals("xxxc001", event.getCarrito().identity().value());

    }
}
