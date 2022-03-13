package command;

import co.com.sofka.domain.generic.Command;
import orden.entity.value.DatosPersonales;
import orden.entity.value.RepartidorId;
import orden.values.OrdenId;

public class AsignarRepartidor extends Command {
    private final OrdenId ordenId;
    private final RepartidorId repartidorId;
    private final DatosPersonales datosPersonales;

    public AsignarRepartidor(OrdenId ordenId, RepartidorId repartidorId, DatosPersonales datosPersonales) {
        this.ordenId = ordenId;
        this.repartidorId = repartidorId;
        this.datosPersonales = datosPersonales;
    }

    public OrdenId getOrdenId() {
        return ordenId;
    }

    public RepartidorId getRepartidorId() {
        return repartidorId;
    }

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }
}
