public class Moto extends Vehiculo{
    private TipoMotor motor;

    public Moto(String modelo, String marca, String anioFabricacion, double precio, TipoMotor motor) {
        super(modelo, marca, anioFabricacion, precio);
        this.motor = motor;
    }

    public TipoMotor getMotor() {
        return motor;
    }

    public void setMotor(TipoMotor motor) {
        this.motor = motor;
    }

    @Override
    public double calcularImpuesto(){
        return motor.equals(TipoMotor.QUATRO_TIEMPOS ) ? this.getPrecio() * 0.03 : getPrecio() * 0.04 ;
    }

    @Override
    public void mostrarInfo(){
        System.out.println("la marca de esta Moto es: " + getMarca() + ", " + "Año: " + getAnioFabricacion() + ", " + "Precio: " + getPrecio() + ", "  + "Modelo: " + getModelo());
    }
}
