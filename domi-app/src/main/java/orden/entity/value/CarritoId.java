package orden.entity.value;

import co.com.sofka.domain.generic.Identity;

public class CarritoId extends Identity {
    private CarritoId(String value) {
        super(value);
    }

    public CarritoId() {};

    public static CarritoId of(String value) {
        return new CarritoId(value);
    }
}
