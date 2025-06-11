public class Auto  extends Vehiculo{

    private int numPuertas;

    public Auto(String modelo, String marca, String anioFabricacion, double precio, int numPuertas) {
        super(modelo, marca, anioFabricacion, precio);
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override
    public double calcularImpuesto() {
        return this.getPrecio() * 0.05;
    }

    @Override
    public void mostrarInfo(){
        System.out.println("la marca de este Auto es: " + getMarca() + ", " + "Año: " + getAnioFabricacion() + ", " + "Precio: " + getPrecio() + ", "  + "Modelo: " + getModelo());
    }
}
