package cliente.entity.values;

import co.com.sofka.domain.generic.ValueObject;

public class Whatsapp implements ValueObject<String> {
    private final String whatsapp;

    public Whatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    @Override
    public String value() {
        return whatsapp;
    }
}
