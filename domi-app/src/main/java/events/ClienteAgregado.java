package events;

import cliente.values.DatosPersonalesCliente;
import co.com.sofka.domain.generic.DomainEvent;

public class ClienteAgregado extends DomainEvent {
    private final DatosPersonalesCliente datosPersonales;

    public ClienteAgregado(DatosPersonalesCliente datosPersonales) {
        super("cliente.clienteagregado");
        this.datosPersonales = datosPersonales;
    }

    public DatosPersonalesCliente getDatosPersonales() {
        return datosPersonales;
    }
}
