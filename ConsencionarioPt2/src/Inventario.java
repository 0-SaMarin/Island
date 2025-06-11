import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Vehiculo> ventas = new ArrayList<>();
    private List<Vehiculo> vehiculos = new ArrayList<>();

    private Inventario (){

    }
     private final Inventario INSTANCE = new Inventario();

    public Inventario getInstance(){
        return INSTANCE;
    }

    public void agregar(Vehiculo vehiculo){

    }

    public void vender(Vehiculo vehiculo){

    }

    public void mostrarVentas(){

    }

    public List<Vehiculo> buscarVehiculos(String marca) {
        return vehiculos;
    }

}
