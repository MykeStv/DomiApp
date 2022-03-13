package command;

import co.com.sofka.domain.generic.Command;
import pedido.entity.values.TiempoEstimado;
import pedido.values.PedidoId;

public class GenerarEstado extends Command {
    private final PedidoId pedidoId;
    private final TiempoEstimado tiempoEstimado;

    public GenerarEstado(PedidoId pedidoId, TiempoEstimado tiempoEstimado) {
        this.pedidoId = pedidoId;
        this.tiempoEstimado = tiempoEstimado;
    }

    public PedidoId getPedidoId() {
        return pedidoId;
    }

    public TiempoEstimado getTiempoEstimado() {
        return tiempoEstimado;
    }
}
