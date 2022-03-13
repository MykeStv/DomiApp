package events;

import cliente.entity.values.AtencionClienteId;
import cliente.entity.values.PQR;
import cliente.entity.values.Telefono;
import cliente.entity.values.Whatsapp;
import co.com.sofka.domain.generic.DomainEvent;

public class AtencionAlClienteSolicitada extends DomainEvent {
    private final AtencionClienteId atencionClienteId;
    private final Whatsapp whatsapp;
    private final Telefono telefono;
    private final PQR pqr;

    public AtencionAlClienteSolicitada(AtencionClienteId atencionClienteId, Whatsapp whatsapp, Telefono telefono, PQR pqr) {
        super("cliente.atencionalclientesolicitada");
        this.atencionClienteId = atencionClienteId;
        this.whatsapp = whatsapp;
        this.telefono = telefono;
        this.pqr = pqr;
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
