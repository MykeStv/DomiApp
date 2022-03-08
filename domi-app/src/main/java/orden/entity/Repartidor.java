package orden.entity;

import co.com.sofka.domain.generic.Entity;
import orden.entity.value.DatosPersonales;
import orden.entity.value.RepartidorId;

public class Repartidor extends Entity<RepartidorId> {

    private DatosPersonales datosPersonales;

    //CONSTRUCTOR
    public Repartidor(RepartidorId entityId, DatosPersonales datosPersonales) {
        super(entityId);
        this.datosPersonales = datosPersonales;
    }

    //BEHAVIORS
    public void despedirRepartidor() {
        //metodo para eliminar el repartidor
        //TODO: realizar el despido bien
        this.datosPersonales = null;
    }
    public void cambiarDatos(DatosPersonales datosPersonales) {
        this.datosPersonales = datosPersonales;
    }

    //Object properties
    public DatosPersonales datosPersonales() {
        return datosPersonales;
    }

}
