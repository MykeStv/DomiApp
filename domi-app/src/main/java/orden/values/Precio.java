package orden.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Precio implements ValueObject<Double> {

    private final Double precio;

    //CONSTRUCTOR
    public Precio(Double precio) {
        this.precio = Objects.requireNonNull(precio);
        if (this.precio < 0) {
            throw new IllegalArgumentException("No puedes tener un precio negativo");
        }
    }

    @Override
    public Double value() {
        return precio;
    }
}
