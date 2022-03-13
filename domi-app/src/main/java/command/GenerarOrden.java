package command;

import co.com.sofka.domain.generic.Command;
import orden.values.OrdenId;
import orden.values.Precio;

public class GenerarOrden extends Command {
    private final OrdenId ordenId;
    private final Precio precio;

    public GenerarOrden(OrdenId ordenId, Precio precio) {
        this.ordenId = ordenId;
        this.precio = precio;
    }

    public OrdenId getOrdenId() {
        return ordenId;
    }

    public Precio getPrecio() {
        return precio;
    }
}
