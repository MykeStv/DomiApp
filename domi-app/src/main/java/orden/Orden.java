package orden;

import co.com.sofka.domain.generic.AggregateEvent;
import orden.entity.Factura;
import orden.entity.Repartidor;
import orden.values.OrdenId;
import orden.values.Precio;

public class Orden extends AggregateEvent<OrdenId> {

    //TODO: conectar con los otros agregados
    protected ClienteId clienteId;
    protected PedidoId pedidoId;
    protected CarritoId carritoId;

    protected Repartidor repartidor;
    protected Factura factura;
    protected Precio precio;

    public Orden(OrdenId ordenId) {
        super(ordenId);
    }
}
