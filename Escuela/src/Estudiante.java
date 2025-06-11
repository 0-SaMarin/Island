import java.util.UUID;

public class Estudiante extends Persona{


    public Estudiante(String nombre, int edad ){
        super(nombre, edad);

    }

    @Override
    public void imprimirSaludo(String saludo){
        System.out.println(String.format("%s Soy un estudiante!", saludo));
    }


}
