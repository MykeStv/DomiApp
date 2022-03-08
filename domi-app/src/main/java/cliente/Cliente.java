package cliente;


import cliente.entity.values.AtencionClienteId;
import cliente.entity.values.PQR;
import cliente.entity.values.Telefono;
import cliente.entity.values.Whatsapp;
import cliente.events.PedidoAñadidoAlHistorial;
import cliente.events.PedidoRealizado;
import cliente.events.ServicioAlClienteSolicitado;
import cliente.values.ClienteId;
import cliente.values.Cupones;
import cliente.values.DatosPersonales;
import cliente.values.HistorialDePedidos;
import co.com.sofka.domain.generic.AggregateEvent;
import java.util.List;


public class Cliente extends AggregateEvent<ClienteId> {

    protected DatosPersonales datosPersonales;
    public Cupones cupones;
    public List<HistorialDePedidos> pedidos;

    public Cliente(ClienteId entityId, HistorialDePedidos historialDePedidos) {
        super(entityId);
        appendChange(new PedidoRealizado(historialDePedidos)).apply();
    }

    public void realizarPedido(HistorialDePedidos historialDePedidos){
        appendChange(new PedidoRealizado(historialDePedidos)).apply();
    }

    /*public void solicitarAtencionAlCLiente(AtencionClienteId entityId, Whatsapp whatsapp, Telefono telefono, PQR pqr){
        appendChange(new ServicioAlClienteSolicitado(entityId, whatsapp, telefono, pqr)).apply();
    }*/

    public void añadirPedidoHistorial(HistorialDePedidos historialDePedidos){
        appendChange(new PedidoAñadidoAlHistorial(historialDePedidos)).apply();
    }

    public DatosPersonales datosPersonales() {
        return datosPersonales;
    }

    public Cupones cupones() {
        return cupones;
    }

    public List<HistorialDePedidos> pedidos() {
        return pedidos;
    }
}
