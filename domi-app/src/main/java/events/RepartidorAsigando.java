package events;

import co.com.sofka.domain.generic.DomainEvent;
import orden.entity.value.RepartidorId;
import orden.values.OrdenId;

public class RepartidorAsigando extends DomainEvent{
    private final OrdenId ordenId;
    private final RepartidorId repartidorId;

    public RepartidorAsigando(OrdenId ordenId, RepartidorId repartidorId){
        super("orden.asignarrepartidor");
        this.ordenId = ordenId;
        this.repartidorId = repartidorId;
    }

    public OrdenId getOrdenId() {
        return ordenId;
    }

    public RepartidorId getRepartidorId() {
        return repartidorId;
    }

}
