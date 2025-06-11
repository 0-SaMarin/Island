public class Carro extends Vehiculo{

    private int numPuertas;

    public Carro(String modelo, String marca, int anio, double precio, int numPuertas){
        super(modelo, marca, anio, precio);
    }

    public void setNumPuertas(){
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas(){
        return numPuertas;
    }

}
