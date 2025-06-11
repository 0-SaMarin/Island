public class Camion extends Vehiculo{

    private double capacidadDeCarga;

    public Camion(String marca, String modelo, int anio, double precio, double capacidadDeCarga) {
        super(marca, modelo, anio, precio);
    }

    public void setCapacidadDeCarga(){
        this.capacidadDeCarga = capacidadDeCarga;
    }

    public double getCapacidadDeCarga(){
        return capacidadDeCarga;
    }


}
