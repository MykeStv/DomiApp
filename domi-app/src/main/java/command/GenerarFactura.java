package command;

import co.com.sofka.domain.generic.Command;
import orden.entity.Factura;
import orden.entity.value.Direccion;
import orden.entity.value.FacturaId;
import orden.values.OrdenId;

public class GenerarFactura extends Command {
    private final OrdenId ordenId;
    private final Factura factura;
    //private final Direccion direccion;
    //private final Fecha fecha;

    public GenerarFactura(OrdenId ordenId, Factura factura) {
        this.ordenId =  ordenId;
        this.factura = factura;
        //this.direccion = direccion;
    }

    public Factura getFactura() {
        return factura;
    }

    /*public Direccion getDireccion() {
        return direccion;
    }*/

    public OrdenId getOrdenId() {
        return ordenId;
    }
}
