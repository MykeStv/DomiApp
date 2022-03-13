package command;

import cliente.values.ClienteId;
import cliente.values.DatosPersonalesCliente;
import co.com.sofka.domain.generic.Command;

public class AgregarCliente extends Command {
    private final ClienteId clienteId;
    private final DatosPersonalesCliente datosPersonales;

    public AgregarCliente(ClienteId clienteId, DatosPersonalesCliente datosPersonales) {
        this.clienteId = clienteId;
        this.datosPersonales = datosPersonales;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public DatosPersonalesCliente getDatosPersonales() {
        return datosPersonales;
    }
}
