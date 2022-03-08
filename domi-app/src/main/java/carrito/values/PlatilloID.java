package carrito.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class PlatilloID implements ValueObject<PlatilloID.Props> {
    private final Long idPlatillo;
    private final String nombre;
    private final String descripcion;

    public PlatilloID(Long idPlatillo, String nombre, String descripcion) {
        this.idPlatillo = Objects.requireNonNull(idPlatillo);
        this.nombre = Objects.requireNonNull(nombre);
        this.descripcion = Objects.requireNonNull(descripcion);
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public Long idPlatillo() {
                return idPlatillo;
            }

            @Override
            public String nombre() {
                return nombre;
            }

            @Override
            public String descripcion() {
                return descripcion;
            }
        };
    }

    public interface Props {
        Long idPlatillo();
        String nombre();
        String descripcion();

    }
}
