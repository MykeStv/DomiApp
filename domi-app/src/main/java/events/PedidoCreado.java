package events;

import co.com.sofka.domain.generic.DomainEvent;
import pedido.entity.values.TiempoEstimado;
import pedido.values.PedidoId;
import pedido.values.PreparacionesId;

public class PedidoCreado extends DomainEvent{
    private final PreparacionesId preparacionId;

    public PedidoCreado(PreparacionesId preparacionId) {
        super("pedido.pedidocreado");
        this.preparacionId = preparacionId;
    }

    public PreparacionesId getPreparacionId() {
        return preparacionId;
    }
}
