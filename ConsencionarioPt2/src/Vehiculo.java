public class Vehiculo {
    private String modelo;
    private String marca;
    private String anioFabricacion;
    private double precio;

    public Vehiculo(String modelo, String marca, String anioFabricacion, double precio) {
        this.modelo = modelo;
        this.marca = marca;
        this.anioFabricacion = anioFabricacion;
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(String anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double calcularImpuesto(){
        return 0.0;
    }

    public void mostrarInfo(){
        System.out.println("la marca de este vehiculo es: " + getMarca() + ", " + "Año: " + getAnioFabricacion() + ", " + "Precio: " + getPrecio() + ", "  + "Modelo: " + getModelo());
    }
}
