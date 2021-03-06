package events;

import cliente.values.ClienteId;
import cliente.values.HistorialDePedidos;
import co.com.sofka.domain.generic.DomainEvent;
import pedido.values.PedidoId;

public class PedidoAĆ±adidoAlHistorial extends DomainEvent {
    private HistorialDePedidos historialDePedidos;
    private final PedidoId pedidoId;
    private final ClienteId clienteId;


    public PedidoAĆ±adidoAlHistorial(HistorialDePedidos historialDePedidos, PedidoId pedidoId, ClienteId clienteId) {
        super("sofka.cliente.pedidorealizado");
        this.pedidoId = pedidoId;
        this.clienteId = clienteId;
    }


    public HistorialDePedidos getHistorialDePedidos() {
        return historialDePedidos;
    }

}
