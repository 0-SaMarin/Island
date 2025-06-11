public class Moto extends Vehiculo{

    private String motor;

    public Moto(String marca, String modelo, int anio, double precio, String motor) {
        super(marca, modelo, anio, precio);
    }

    public void setMotor(){
        this.motor = motor;
    }

    public String getMotor(){
        return motor;
    }


}
