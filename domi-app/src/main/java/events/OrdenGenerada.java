package events;

import co.com.sofka.domain.generic.DomainEvent;
import orden.values.Precio;

public class OrdenGenerada extends DomainEvent {
    private final Precio precio;

    public OrdenGenerada(Precio precio) {
        super("orden.ordengenerada");
        this.precio = precio;
    }

    public Precio getPrecio() {
        return precio;
    }
}
