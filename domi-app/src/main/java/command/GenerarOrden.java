package command;

import cliente.values.ClienteId;
import co.com.sofka.domain.generic.Command;
import orden.entity.Carrito;
import orden.entity.Factura;
import orden.entity.Repartidor;
import orden.values.OrdenId;
import orden.values.Precio;
import pedido.values.PedidoId;

public class GenerarOrden extends Command {
    private final OrdenId ordenId;
    private final ClienteId clienteId;
    private final PedidoId pedidoId;
    private final Carrito carrito;
    private final Precio precio;
    private final Factura factura;
    private final Repartidor repartidor;


    public GenerarOrden(OrdenId ordenId, ClienteId clienteId, PedidoId pedidoId, Carrito carrito, Precio precio,
            Factura factura, Repartidor repartidor) {
        this.ordenId = ordenId;
        this.clienteId = clienteId;
        this.pedidoId = pedidoId;
        this.carrito = carrito;
        this.precio = precio;
        this.factura = factura;
        this.repartidor = repartidor;
    }


    public OrdenId getOrdenId() {
        return ordenId;
    }


    public ClienteId getClienteId() {
        return clienteId;
    }


    public PedidoId getPedidoId() {
        return pedidoId;
    }


    public Carrito getCarrito() {
        return carrito;
    }


    public Precio getPrecio() {
        return precio;
    }


    public Factura getFactura() {
        return factura;
    }


    public Repartidor getRepartidor() {
        return repartidor;
    }

}
