package cliente.entity;

import cliente.entity.values.AtencionClienteId;
import cliente.entity.values.PQR;
import cliente.entity.values.Telefono;
import cliente.entity.values.Whatsapp;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;


public class AtencionAlCliente extends Entity<AtencionClienteId> {

    private Whatsapp whatsapp;
    private Telefono telefono;
    private PQR pqr;

    //Constructor
    public AtencionAlCliente(AtencionClienteId entityId, Whatsapp whatsapp, Telefono telefono, PQR pqr) {
        super(entityId);
        this.whatsapp = whatsapp;
        this.telefono = telefono;
        this.pqr = pqr;
    }

    //Comportamientos

    public void escribirAWhatsapp(Whatsapp whatsapp) {
        this.whatsapp = Objects.requireNonNull(whatsapp);
    }
    public void llamarRestaurante(Telefono telefono) {
        this.telefono = Objects.requireNonNull(telefono);
    }
    public void escribirPQR(PQR pqr) {
        this.pqr = Objects.requireNonNull(pqr);
    }


    public Whatsapp whatsapp() {
        return whatsapp;
    }

    public Telefono telefono() {
        return telefono;
    }

    public PQR pqr() {
        return pqr;
    }
}
