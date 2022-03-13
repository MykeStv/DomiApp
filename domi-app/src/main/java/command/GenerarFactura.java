package command;

import co.com.sofka.domain.generic.Command;
import orden.entity.value.Direccion;
import orden.entity.value.FacturaId;
import orden.entity.value.Fecha;
import orden.values.OrdenId;

public class GenerarFactura extends Command {
    private final OrdenId ordenId;
    private final FacturaId facturaId;
    private final Direccion direccion;
    private final Fecha fecha;

    public GenerarFactura(OrdenId ordenId, FacturaId facturaId, Direccion direccion, Fecha fecha) {
        this.ordenId = ordenId;
        this.facturaId = facturaId;
        this.direccion = direccion;
        this.fecha = fecha;
    }

    public OrdenId getOrdenId() {
        return ordenId;
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
