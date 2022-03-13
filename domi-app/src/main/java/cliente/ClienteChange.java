package cliente;

import cliente.entity.AtencionAlCliente;
import co.com.sofka.domain.generic.EventChange;
import events.AtencionAlClienteSolicitada;
import events.ClienteAgregado;

public class ClienteChange extends EventChange {
    public ClienteChange(Cliente cliente){
        apply((ClienteAgregado event) ->{
            cliente.datosPersonales = event.getDatosPersonales();
        });

        apply((AtencionAlClienteSolicitada event) ->{
            cliente.atencionAlCliente = new AtencionAlCliente(event.getAtencionClienteId(),event.getWhatsapp(), event.getTelefono(), event.getPqr());
        });
    }
}
