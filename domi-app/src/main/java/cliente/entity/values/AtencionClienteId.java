package cliente.entity.values;

import co.com.sofka.domain.generic.Identity;

public class AtencionClienteId extends Identity {
    private AtencionClienteId(String valor){
        super(valor);
    }

    public AtencionClienteId () {};

    public static AtencionClienteId of(String valor) {
        return new AtencionClienteId(valor);
    }
}
