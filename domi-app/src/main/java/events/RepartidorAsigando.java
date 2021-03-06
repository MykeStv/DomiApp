package events;

import co.com.sofka.domain.generic.DomainEvent;
import orden.entity.value.DatosPersonales;
import orden.entity.value.RepartidorId;

public class RepartidorAsigando extends DomainEvent{
    private final RepartidorId repartidorId;
    private final DatosPersonales datosPersonales;

    public RepartidorAsigando(RepartidorId repartidorId, DatosPersonales datosPersonales){
        super("orden.asignarrepartidor");
        this.repartidorId = repartidorId;
        this.datosPersonales = datosPersonales;
    }

    public RepartidorId getRepartidorId() {
        return repartidorId;
    }

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }
}
