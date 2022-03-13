package command;

import cliente.entity.values.AtencionClienteId;
import cliente.entity.values.PQR;
import cliente.entity.values.Telefono;
import cliente.entity.values.Whatsapp;
import cliente.values.ClienteId;
import co.com.sofka.domain.generic.Command;

public class SolicitarAtencionAlCliente extends Command {
    private final ClienteId clienteId;
    private final AtencionClienteId atencionClienteId;
    private final Whatsapp whatsapp;
    private final Telefono telefono;
    private final PQR pqr;

    public SolicitarAtencionAlCliente(ClienteId clienteId, AtencionClienteId atencionClienteId, Whatsapp whatsapp, Telefono telefono, PQR pqr) {
        this.clienteId = clienteId;
        this.atencionClienteId = atencionClienteId;
        this.whatsapp = whatsapp;
        this.telefono = telefono;
        this.pqr = pqr;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public AtencionClienteId getAtencionClienteId() {
        return atencionClienteId;
    }

    public Whatsapp getWhatsapp() {
        return whatsapp;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public PQR getPqr() {
        return pqr;
    }
}
