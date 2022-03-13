package orden;

import co.com.sofka.domain.generic.EventChange;
import events.FacturaGenerada;
import events.OrdenGenerada;
import orden.entity.Factura;

public class OrdenChange extends EventChange {

    public OrdenChange(Orden orden){
        apply((OrdenGenerada event) ->{
            orden.precio = event.getPrecio();
        });

        apply((FacturaGenerada event) ->{
            orden.factura = new Factura(event.getFacturaId(), event.getDireccion(), event.getFecha());
        });
    }
}
