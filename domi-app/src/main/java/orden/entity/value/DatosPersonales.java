package orden.entity.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class DatosPersonales implements ValueObject<DatosPersonales.Props> {
    //ATTRIBUTES
    private final String nombre;
    private final String apellido;
    private final String celular;

    //CONSTRUCTOR
    public DatosPersonales(String nombre, String apellido, String celular) {
        this.nombre = Objects.requireNonNull(nombre);
        this.apellido = Objects.requireNonNull(apellido);
        this.celular = Objects.requireNonNull(celular);
    }

    //Calls the interface props to encapsulate data
    @Override
    public Props value() {
        return new Props() {
            @Override
            public String nombre() {
                return nombre;
            }

            @Override
            public String apellido() {
                return apellido;
            }

            @Override
            public String celular() {
                return celular;
            }
        };
    }

    public interface Props {
        String nombre();
        String apellido();
        String celular();
    }
}
