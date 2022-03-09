package usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import command.GenerarFactura;
import command.GenerarOrden;
import orden.Orden;
import orden.entity.Factura;

public class GenerarFacturaUseCase extends UseCase<RequestCommand<GenerarFactura>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<GenerarFactura> input) {
        var command = input.getCommand();
        var orden = new Orden(
                command.getOrdenId(),
                command.getFactura()
        );
        emit().onResponse(new ResponseEvents(orden.getUncommittedChanges()));
    }
}
