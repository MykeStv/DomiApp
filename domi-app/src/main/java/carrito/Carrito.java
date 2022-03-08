package carrito;

import carrito.values.CarritoId;
import carrito.values.PlatilloID;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.List;

public class Carrito extends AggregateEvent<CarritoId> {
    protected List<PlatilloID> platillos;

    public Carrito(CarritoId carritoId) {
        super(carritoId);
    }
}
