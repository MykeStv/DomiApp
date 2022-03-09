package events;

import cliente.values.ClienteId;
import co.com.sofka.domain.generic.DomainEvent;
import orden.entity.Carrito;
import orden.values.OrdenId;
import pedido.values.PedidoId;

public class OrdenGenerada extends DomainEvent {
    private final OrdenId ordenid;
    private final PedidoId pedidoId;
    private final ClienteId clienteId;
    private final Carrito carrito;

    public OrdenGenerada(OrdenId ordenid, PedidoId pedidoId, ClienteId clienteId, Carrito carrito) {
        super("orden.ordenGenerada");
        this.ordenid = ordenid;
        this.pedidoId = pedidoId;
        this.clienteId = clienteId;
        this.carrito = carrito;
    }

    public OrdenId getOrdenid() {
        return ordenid;
    }

    public PedidoId getPedidoId() {
        return pedidoId;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Carrito getCarrito() {
        return carrito;
    }

}
