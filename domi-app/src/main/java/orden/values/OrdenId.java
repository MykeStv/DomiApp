package orden.values;

import co.com.sofka.domain.generic.Identity;
import pedido.values.PedidoId;

public class OrdenId extends Identity {
    private OrdenId(String valor) {
        super(valor);
    }

    public OrdenId() {};

    public static OrdenId of(String valor) {
        return new OrdenId(valor);
    }
}
