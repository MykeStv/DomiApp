package pedido;

import co.com.sofka.domain.generic.EventChange;
import events.EstadoGenerado;
import events.PedidoCreado;
import pedido.entity.Estado;

public class PedidoChange extends EventChange {

    public PedidoChange(Pedido pedido){
        apply((PedidoCreado event) ->{
            pedido.preparacionId = event.getPreparacionId();
        });

        apply((EstadoGenerado event) ->{
            pedido.estado = new Estado(event.getEstadoId(), event.getTiempoEstimado());
        });

    }
}
