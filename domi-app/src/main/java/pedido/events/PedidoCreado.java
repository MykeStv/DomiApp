package pedido.events;

import co.com.sofka.domain.generic.DomainEvent;
import pedido.entity.values.TiempoEstimado;

public class PedidoCreado extends DomainEvent{
    private final TiempoEstimado tiempoEstimado;

    public PedidoCreado(TiempoEstimado tiempoEstimado){
        super("pedido.pedidoCreado");
        this.tiempoEstimado = tiempoEstimado;
    }

    public TiempoEstimado getTiempoEstimado() {
        return tiempoEstimado;
    }
}
