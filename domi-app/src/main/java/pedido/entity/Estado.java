package pedido.entity;

import co.com.sofka.domain.generic.Entity;
import pedido.entity.values.Entregado;
import pedido.entity.values.EstadoId;
import pedido.entity.values.TiempoEstimado;

public class Estado extends Entity<EstadoId> {
    private Entregado entregado;
    private TiempoEstimado tiempoEstimado;

    public Estado(EstadoId entityId, TiempoEstimado tiempoEstimado) {
        super(entityId);
        this.entregado = new Entregado(Entregado.State.NO_ENTREGADO);
        this.tiempoEstimado = tiempoEstimado;
    }

    public Entregado Entregado() {
        return entregado;
    }

    public TiempoEstimado tiempoEstimado() {
        return tiempoEstimado;
    }


    //Comportamientos
    public void pedidoEntregado(){
        this.entregado = new Entregado(Entregado.State.ENTREGADO);
    }

    public void estimarTiempo(TiempoEstimado tEstimado){
        this.tiempoEstimado = tEstimado;
    }
}
