package pedido.entity.values;

import co.com.sofka.domain.generic.ValueObject;

public class Entregado implements ValueObject<Entregado.State> {
    private final State value;

    public Entregado(State value) {
        this.value = value;
    }

    @Override
    public State value() {
        return value;
    }

    public enum State {
        ENTREGADO, NO_ENTREGADO
    }
}
