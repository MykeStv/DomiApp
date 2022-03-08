package orden;

import co.com.sofka.domain.generic.AggregateEvent;
import orden.values.OrdenId;

public class Orden extends AggregateEvent<OrdenId> {

    public Orden(OrdenId entityId) {
        super(entityId);
    }
}
