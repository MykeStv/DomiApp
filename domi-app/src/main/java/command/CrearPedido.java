package command;

import co.com.sofka.domain.generic.Command;
import pedido.values.PedidoId;
import pedido.values.PreparacionesId;

public class CrearPedido extends Command {
    private final PedidoId pedidoId;
    private final PreparacionesId preparacionesId;

    public CrearPedido(PedidoId pedidoId, PreparacionesId preparacionesId) {
        this.pedidoId = pedidoId;
        this.preparacionesId = preparacionesId;
    }

    public PedidoId getPedidoId() {
        return pedidoId;
    }

    public PreparacionesId getPreparacionesId() {
        return preparacionesId;
    }
}
