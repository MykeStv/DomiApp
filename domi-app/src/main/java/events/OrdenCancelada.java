package events;


import java.util.Optional;

import co.com.sofka.domain.generic.DomainEvent;
import orden.values.OrdenId;

public class OrdenCancelada extends DomainEvent{
    private final OrdenId ordenid;

    public OrdenCancelada(OrdenId ordenid) {
        super("orden.ordenGenerada");
        this.ordenid = ordenid;
    }


    public OrdenId getOrdenid() {
        return ordenid;
    }
}
