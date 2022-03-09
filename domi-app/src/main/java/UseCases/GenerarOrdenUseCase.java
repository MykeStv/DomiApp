package UseCases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import command.GenerarOrden;

public class GenerarOrdenUseCase extends UseCase<RequestCommand<GenerarOrden>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<GenerarOrden> input) {
        var command = input.getCommand();
    }
}
