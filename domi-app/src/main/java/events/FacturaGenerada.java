package events;

import co.com.sofka.domain.generic.DomainEvent;
import orden.entity.Factura;
import orden.entity.value.FacturaId;
import orden.values.OrdenId;

public class FacturaGenerada extends DomainEvent {
    private final Factura factura;
    //private final OrdenId ordenId;

    public FacturaGenerada(OrdenId ordenId, Factura factura) {
        super("factura.facturaGenerada");
        //this.ordenId = ordenId;
        this.factura = factura;
    }

    public Factura getFactura() {
        return factura;
    }

    /*public OrdenId getOrdenId() {
        return ordenId;
    }*/
}
