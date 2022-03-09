package pedido.values;

import co.com.sofka.domain.generic.Identity;

public class PedidoId extends Identity{

    private PedidoId(String valor){
        super(valor);
    }

    public PedidoId () {};
}
