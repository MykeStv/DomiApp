package orden.values;

import co.com.sofka.domain.generic.Identity;

public class OrdenId extends Identity {
    private OrdenId(String valor) {
        super(valor);
    }

    public OrdenId() {};
}
