public class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    private double precio;

    public Vehiculo(String marca, String modelo, int anio, double precio){
        this.anio = anio;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getAnio() {
        return anio;
    }

    public void setMarca(){
        this.marca = marca;
    }

    public String getMarca(){
        return marca;
    }

    public void setModelo(){
        this.modelo = modelo;
    }

    public String getModelo(){
        return modelo;
    }

    public void setPrecio(){
         this.precio = precio;
    }

    public double getPrecio(){
        return precio;
    }
}
