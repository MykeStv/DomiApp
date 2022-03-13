package cliente.entity.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class PQR implements ValueObject<String> {
    private final String pqr;

    public PQR(String pqr) {
        this.pqr = Objects.requireNonNull(pqr, "La PQR no debe ser nula");
    }

    @Override
    public String value() {
        return pqr;
    }
}
