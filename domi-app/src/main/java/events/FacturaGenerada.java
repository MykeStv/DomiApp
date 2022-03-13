package events;

import co.com.sofka.domain.generic.DomainEvent;
import orden.entity.value.Direccion;
import orden.entity.value.FacturaId;
import orden.entity.value.Fecha;

public class FacturaGenerada extends DomainEvent {
    private final FacturaId facturaId;
    private final Direccion direccion;
    private final Fecha fecha;

    public FacturaGenerada(FacturaId facturaId, Direccion direccion, Fecha fecha) {
        super("orden.facturagenerada");
        this.facturaId = facturaId;
        this.direccion = direccion;
        this.fecha = fecha;
    }

    public FacturaId getFacturaId() {
        return facturaId;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
