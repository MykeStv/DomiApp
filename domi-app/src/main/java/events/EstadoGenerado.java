package events;

import co.com.sofka.domain.generic.DomainEvent;
import pedido.entity.values.EstadoId;
import pedido.entity.values.TiempoEstimado;

public class EstadoGenerado extends DomainEvent {
    private final EstadoId estadoId;
    private final TiempoEstimado tiempoEstimado;

    public EstadoGenerado(EstadoId estadoId, TiempoEstimado tiempoEstimado) {
        super("pedido.estadogenerado");
        this.estadoId = estadoId;
        this.tiempoEstimado = tiempoEstimado;
    }

    public EstadoId getEstadoId() {
        return estadoId;
    }

    public TiempoEstimado getTiempoEstimado() {
        return tiempoEstimado;
    }
}
