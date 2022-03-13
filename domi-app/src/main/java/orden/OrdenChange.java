package orden;

import co.com.sofka.domain.generic.EventChange;
import events.FacturaGenerada;
import events.OrdenGenerada;
import events.RepartidorAsigando;
import orden.entity.Factura;
import orden.entity.Repartidor;

public class OrdenChange extends EventChange {

    public OrdenChange(Orden orden){
        apply((OrdenGenerada event) ->{
            orden.precio = event.getPrecio();
        });

        apply((FacturaGenerada event) ->{
            orden.factura = new Factura(event.getFacturaId(), event.getDireccion(), event.getFecha());
        });

        apply((RepartidorAsigando event) ->{
            orden.repartidor = new Repartidor(event.getRepartidorId(),event.getDatosPersonales());
        });
    }
}
