package cliente.values;

import co.com.sofka.domain.generic.ValueObject;

public class DatosPersonalesCliente implements ValueObject<DatosPersonalesCliente.Props> {
    private final String nombre;
    private final String apellido;
    private final String celular;

    public DatosPersonalesCliente(String nombre, String apellido, String celular) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
    }

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

    public interface Props{
        String nombre();
        String apellido();
        String celular();
    }
}
