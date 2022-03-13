package usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import command.GenerarFactura;
import orden.Orden;

public class GenerarFacturaUseCase extends UseCase<RequestCommand<GenerarFactura>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<GenerarFactura> input) {
        var command = input.getCommand();
        var orden = Orden.from(command.getOrdenId(), retrieveEvents());
        orden.generarFactura(command.getFacturaId(), command.getDireccion(), command.getFecha());
        emit().onResponse(new ResponseEvents(orden.getUncommittedChanges()));
    }
}
