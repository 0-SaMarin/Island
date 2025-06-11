public class Camion extends Vehiculo {

    private double capacidadDeCarga;

    public Camion(String modelo, String marca, String anioFabricacion, double precio, double capacidadDeCarga) {
        super(modelo, marca, anioFabricacion, precio);
        this.capacidadDeCarga = capacidadDeCarga;
    }

    public double getCapacidadDeCarga() {
        return capacidadDeCarga;
    }

    public void setCapacidadDeCarga(double capacidadDeCarga) {
        this.capacidadDeCarga = capacidadDeCarga;
    }

    @Override
    public double calcularImpuesto(){
        return capacidadDeCarga >5 ? getPrecio() * 0.08 : getPrecio() * 0.06;
    }
}
