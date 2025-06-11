import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String asignatura;
    private List<Estudiante> estudiantesInscritos = new ArrayList<>();
    private int cupo;
    private Profe profeTitular;

    public Curso(String asignatura, int cupo){
        this.asignatura = asignatura;
        this.cupo = cupo;
    }

    public String getAsignatura(){
       return asignatura;
    }

    public void addEstudiante(Estudiante estudiante){
        if(estudiantesInscritos.size() >= cupo){
            System.out.println("El cupo esta completo, no podemos aceptar mas estudiantes");
            return;
        }
        this.estudiantesInscritos.add(estudiante);
    }

    public void addCurso(Curso cursos){
        this.addCurso(cursos);
    }

    public Profe setProfeTitular(){
        return profeTitular;
    }

    public void getProfeTitular(Profe profeTitular){
        this.getProfeTitular(profeTitular);
    }

}
