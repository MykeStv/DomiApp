package cliente.events;

import cliente.values.HistorialDePedidos;
import co.com.sofka.domain.generic.DomainEvent;

public class PedidoAñadidoAlHistorial extends DomainEvent {
    private HistorialDePedidos historialDePedidos;

    public PedidoAñadidoAlHistorial(HistorialDePedidos historialDePedidos) {
        super("sofka.cliente.pedidorealizado");
    }

    public HistorialDePedidos getHistorialDePedidos() {
        return historialDePedidos;
    }

}
