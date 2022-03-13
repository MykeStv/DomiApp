package cliente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.List;

public class HistorialDePedidos implements ValueObject<List<String>> {
    private final List<String> historial;

    public HistorialDePedidos(List<String> historial) {
        this.historial = historial;
    }

    @Override
    public List<String> value() {
        return historial;
    }
}
