package events;

import co.com.sofka.domain.generic.DomainEvent;
import pedido.entity.values.TiempoEstimado;
import pedido.values.PedidoId;

public class PedidoCreado extends DomainEvent{
//    private final TiempoEstimado tiempoEstimado;
    private final PedidoId pedidoId;

    public PedidoCreado(PedidoId pedidoId){
        super("pedido.pedidoCreado");
        this.pedidoId = pedidoId;
    }

    public PedidoId getPedidoId() {
        return this.pedidoId;
    }

    /*public TiempoEstimado getTiempoEstimado() {
        return tiempoEstimado;
    }*/
}
