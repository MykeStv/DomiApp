package orden.entity.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Date;

public class Fecha implements ValueObject<Date> {

    private final Date value;

    public Fecha(Date value) {
        //TODO: validar fecha
        this.value = value;
    }
    //Constructor para crear una fecha actual
    public Fecha() {
        this(new Date());
    }

    @Override
    public Date value() {
        return value;
    }
}
