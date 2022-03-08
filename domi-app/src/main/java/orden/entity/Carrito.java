package orden.entity;

import co.com.sofka.domain.generic.Entity;
import orden.entity.value.CarritoId;
import orden.entity.value.Platillo;

import java.util.List;

public class Carrito extends Entity<CarritoId> {
    private List<Platillo> platillos;

    //CONSTRUCTOR
    public Carrito(CarritoId carritoId, List<Platillo> platillo) {
        super(carritoId);
        this.platillos = platillo;
    }

    //BEHAVIOURS
    public void agregarPlatillo(Platillo platillo) {
        this.platillos.add(platillo);
    }
    public void eliminarPlatillo(Long idPlatillo) {
        this.platillos.stream().filter(platillo -> platillo.value().idPlatillo() != idPlatillo);
    }
    public void cambiarCantidadPlatillo(Long idPlatillo, Integer cantidad) {
        this.platillos.stream().map(platillo -> {
           if (platillo.value().idPlatillo().equals(idPlatillo)) {
               platillo.cambiarCantidad(cantidad);
           }
            return platillo;
        });
    }

    //Object getter
    public List<Platillo> platillos() {
        return platillos;
    }
}
