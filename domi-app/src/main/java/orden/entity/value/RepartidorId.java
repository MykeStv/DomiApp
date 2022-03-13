package orden.entity.value;

import co.com.sofka.domain.generic.Identity;
import orden.values.OrdenId;

public class RepartidorId extends Identity {
    private RepartidorId(String valor) {
        super(valor);
    }

    public RepartidorId() {};

    public static RepartidorId of(String valor) {
        return new RepartidorId(valor);
    }
}
