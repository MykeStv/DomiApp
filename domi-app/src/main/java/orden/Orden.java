package orden;

import cliente.values.ClienteId;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import events.FacturaGenerada;
import events.OrdenGenerada;
import orden.entity.Carrito;
import orden.entity.Factura;
import orden.entity.Repartidor;
import orden.entity.value.Direccion;
import orden.entity.value.FacturaId;
import orden.entity.value.Fecha;
import orden.values.OrdenId;
import orden.values.Precio;
import pedido.values.PedidoId;

import java.util.List;

public class Orden extends AggregateEvent<OrdenId> {
    protected ClienteId clienteId;
    protected PedidoId pedidoId;

    protected Repartidor repartidor;
    protected Factura factura;
    protected Precio precio;
    protected Carrito carrito;

    public Orden(OrdenId entityId){
        super(entityId);
        subscribe(new OrdenChange(this));
    }

    public Orden(OrdenId entityId, Precio precio){
        super(entityId);
        appendChange(new OrdenGenerada(precio)).apply();
    }

    public static Orden from(OrdenId ordenId, List<DomainEvent> events){
        var orden = new Orden(ordenId);
        events.forEach(orden::applyEvent);
        return orden;
    }

    //comportamientos
    public void generarFactura(FacturaId facturaId, Direccion direccion, Fecha fecha){
        appendChange(new FacturaGenerada(facturaId,direccion,fecha)).apply();
    }

    public Factura factura() {
        return factura;
    }

    public Precio precio() {
        return precio;
    }

    public ClienteId clienteId() {
        return clienteId;
    }

    public PedidoId pedidoId() {
        return pedidoId;
    }

    public Repartidor repartidor() {
        return repartidor;
    }

    public Carrito carrito() {
        return carrito;
    }
}
