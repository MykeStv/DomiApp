package pedido;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import events.EstadoGenerado;
import events.OrdenGenerada;
import events.PedidoCreado;
import orden.Orden;
import orden.OrdenChange;
import orden.values.OrdenId;
import orden.values.Precio;
import pedido.entity.Estado;
import pedido.entity.values.Entregado;
import pedido.entity.values.EstadoId;
import pedido.entity.values.TiempoEstimado;
import pedido.values.PedidoId;
import pedido.values.PreparacionesId;

import java.util.List;

public class Pedido extends AggregateEvent<PedidoId>{
    protected PreparacionesId preparacionId;
    protected Estado estado;

    public Pedido(PedidoId entityId){
        super(entityId);
        subscribe(new PedidoChange(this));
    }

    public Pedido(PedidoId entityId, PreparacionesId preparacionId){
        super(entityId);
        appendChange(new PedidoCreado(preparacionId)).apply();
    }

    public static Pedido from(PedidoId pedidoId, List<DomainEvent> events){
        var pedido = new Pedido(pedidoId);
        events.forEach(pedido::applyEvent);
        return pedido;
    }

    //comportamiento
    public void generarEstado(EstadoId estadoId, TiempoEstimado tiempoEstimado){
        appendChange(new EstadoGenerado(estadoId, tiempoEstimado)).apply();
    }

    public PreparacionesId preparacionId() {
        return preparacionId;
    }

    public Estado estado() {
        return estado;
    }
}
