package orden.entity.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Direccion implements ValueObject<Direccion.Props> {

    private final String direccionDomiciliar;
    private final String barrio;

    //CONSTRUCTOR
    public Direccion(String direccionDomiciliar, String barrio) {
        this.direccionDomiciliar = Objects.requireNonNull(direccionDomiciliar);
        this.barrio = Objects.requireNonNull(barrio);
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public String direccionDomiciliar() {
                return direccionDomiciliar;
            }

            @Override
            public String barrio() {
                return barrio;
            }
        };
    }

    public interface Props {
        String direccionDomiciliar();
        String barrio();
    }
}
