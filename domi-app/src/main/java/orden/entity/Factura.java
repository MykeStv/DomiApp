package orden.entity;

import co.com.sofka.domain.generic.Entity;
import orden.entity.value.Direccion;
import orden.entity.value.FacturaId;
import orden.entity.value.Fecha;

public class Factura extends Entity<FacturaId> {
    private Direccion direccion;
    private Fecha fecha;

    //CONSTRUCTOR -- GenerarFactura
    public Factura(FacturaId entityId, Direccion direccion, Fecha fecha) {
        super(entityId);
        this.direccion = direccion;
        this.fecha = fecha;
    }

    //OBBJETS GETTERS
    public Direccion direccion() {
        return direccion;
    }

    public Fecha fecha() {
        return fecha;
    }

}
