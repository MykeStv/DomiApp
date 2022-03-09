package usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import command.GenerarOrden;
import orden.Orden;

public class GenerarOrdenUseCase extends UseCase<RequestCommand<GenerarOrden>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<GenerarOrden> input) {
        var command = input.getCommand();

        var orden = new Orden(
                command.getOrdenId(),
                command.getPedidoId(),
                command.getClienteId(),
                command.getCarrito()
        );
        emit().onResponse(new ResponseEvents(orden.getUncommittedChanges()));
    }
}
