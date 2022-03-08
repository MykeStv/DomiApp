package orden.entity.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Platillo implements ValueObject<Platillo.Props> {
    private final Long idPlatillo;
    private final String nombre;
    private final String descripcion;
    private Integer cantidad;

    public Platillo(Long idPlatillo, String nombre, String descripcion) {
        this.idPlatillo = Objects.requireNonNull(idPlatillo);
        this.nombre = Objects.requireNonNull(nombre);
        this.descripcion = Objects.requireNonNull(descripcion);
        this.cantidad = 1;
        if (this.cantidad <= 0) {
            throw new IllegalArgumentException("Se requiere al menos 1 platillo");
        }
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

            @Override
            public Integer cantidad() {
                return cantidad;
            }
        };
    }

    public void cambiarCantidad(Integer cantidad) {
        if (cantidad > 0 ) {
            this.cantidad = cantidad;
        } else {
            throw new IllegalArgumentException("Cantidad no valida");
        }
    }

    public interface Props {
        Long idPlatillo();
        String nombre();
        String descripcion();
        Integer cantidad();
    }


}
