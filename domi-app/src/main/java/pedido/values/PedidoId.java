package pedido.values;

import cliente.values.ClienteId;
import co.com.sofka.domain.generic.Identity;

public class PedidoId extends Identity{

    private PedidoId(String valor){
        super(valor);
    }

    public PedidoId () {};

    public static PedidoId of(String valor) {
        return new PedidoId(valor);
    }
}
