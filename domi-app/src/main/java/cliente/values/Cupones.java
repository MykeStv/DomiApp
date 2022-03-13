package cliente.values;

import co.com.sofka.domain.generic.ValueObject;

public class Cupones implements ValueObject<Cupones.Props> {
    private final String valorDescuento;
    private final String fechaValida;

    public Cupones(String valorDescuento, String fechaValida) {
        this.valorDescuento = valorDescuento;
        this.fechaValida = fechaValida;
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public String valorDescuento() {
                return valorDescuento;
            }
            @Override
            public String fechaValida() {
                return fechaValida;
            }
        };
    }


    public interface Props {
        String valorDescuento();
        String fechaValida();
    }
}
