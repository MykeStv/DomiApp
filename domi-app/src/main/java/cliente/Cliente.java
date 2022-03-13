package cliente;


import cliente.entity.AtencionAlCliente;
import cliente.entity.values.AtencionClienteId;
import cliente.entity.values.PQR;
import cliente.entity.values.Telefono;
import cliente.entity.values.Whatsapp;
import co.com.sofka.domain.generic.DomainEvent;
import events.AtencionAlClienteSolicitada;
import events.ClienteAgregado;
import events.PedidoRealizado;
import cliente.values.ClienteId;
import cliente.values.Cupones;
import cliente.values.DatosPersonalesCliente;
import cliente.values.HistorialDePedidos;
import co.com.sofka.domain.generic.AggregateEvent;
import pedido.Pedido;
import pedido.PedidoChange;
import pedido.values.PedidoId;

import java.util.List;


public class Cliente extends AggregateEvent<ClienteId> {
    protected DatosPersonalesCliente datosPersonales;
    protected Cupones cupones;
    protected HistorialDePedidos pedidos;
    protected AtencionAlCliente atencionAlCliente;

    public Cliente(ClienteId entityId){
        super(entityId);
        subscribe(new ClienteChange(this));
    }

    public Cliente(ClienteId entityId, DatosPersonalesCliente datosPersonales){
        super(entityId);
        appendChange(new ClienteAgregado(datosPersonales)).apply();
    }

    public static Cliente from(ClienteId clienteId, List<DomainEvent> events){
        var cliente = new Cliente(clienteId);
        events.forEach(cliente::applyEvent);
        return cliente;
    }

    //comportamiento
    public void solicitarAtencionALCliente(AtencionClienteId atencionClienteId, Whatsapp whatsapp, Telefono telefono, PQR pqr){
        appendChange(new AtencionAlClienteSolicitada(atencionClienteId, whatsapp, telefono, pqr)).apply();
    }

    public DatosPersonalesCliente datosPersonales() {
        return datosPersonales;
    }

    public Cupones cupones() {
        return cupones;
    }

    public HistorialDePedidos pedidos() {
        return pedidos;
    }

    public AtencionAlCliente atencionAlCliente() {
        return atencionAlCliente;
    }
}
