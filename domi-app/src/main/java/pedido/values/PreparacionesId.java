package pedido.values;

import co.com.sofka.domain.generic.ValueObject;

public class PreparacionesId implements ValueObject<PreparacionesId.State> {
    private final State value;

    public PreparacionesId(State value) {
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
