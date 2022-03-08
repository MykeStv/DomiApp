package pedido;

import co.com.sofka.domain.generic.AggregateEvent;
import pedido.entity.Estado;
import pedido.values.PedidoId;
import pedido.values.PreparacionesId;

public class Pedido extends AggregateEvent<PedidoId>{
    protected PreparacionesId preparacion;
    protected Estado estado;

    public Pedido(PedidoId entityId) {
        super(entityId);
    }

}
