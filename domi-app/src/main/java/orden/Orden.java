package orden;

import cliente.values.ClienteId;
import co.com.sofka.domain.generic.AggregateEvent;
import events.FacturaGenerada;
import events.OrdenGenerada;
import orden.entity.Carrito;
import orden.entity.Factura;
import orden.entity.Repartidor;
import orden.values.OrdenId;
import orden.values.Precio;
import pedido.values.PedidoId;

public class Orden extends AggregateEvent<OrdenId> {

    //TODO: conectar con los otros agregados
    protected ClienteId clienteId;
    protected PedidoId pedidoId;

    protected Repartidor repartidor;
    protected Factura factura;
    protected Precio precio;
    protected Carrito carrito;

    public  Orden(OrdenId ordenId, Factura factura){
        super(ordenId);
        appendChange(new FacturaGenerada(ordenId,factura)).apply();
    }
    public Orden(OrdenId ordenId, PedidoId pedidoId, ClienteId clienteId, Carrito carrito) {
        super(ordenId);
        appendChange(new OrdenGenerada(ordenId, pedidoId, clienteId, carrito)).apply();
    }

}
