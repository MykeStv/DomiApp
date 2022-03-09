package events;

import cliente.values.HistorialDePedidos;
import co.com.sofka.domain.generic.DomainEvent;

public class PedidoRealizado extends DomainEvent {

    private HistorialDePedidos historialDePedidos;

    public PedidoRealizado(HistorialDePedidos historialDePedidos) {
        super("sofka.cliente.pedidorealizado");
    }

    public HistorialDePedidos getHistorialDePedidos() {
        return historialDePedidos;
    }
}
