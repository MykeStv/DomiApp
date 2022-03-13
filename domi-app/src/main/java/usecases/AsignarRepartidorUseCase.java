package usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import command.AsignarRepartidor;
import orden.Orden;

public class AsignarRepartidorUseCase extends UseCase<RequestCommand<AsignarRepartidor>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AsignarRepartidor> input) {
        var command = input.getCommand();
        var orden = Orden.from(command.getOrdenId(), retrieveEvents());
        orden.asignarRepartidor(command.getRepartidorId(), command.getDatosPersonales());
        emit().onResponse(new ResponseEvents(orden.getUncommittedChanges()));

    }
}
