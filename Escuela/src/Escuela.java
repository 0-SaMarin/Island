import java.util.ArrayList;
import java.util.List;

public class Escuela {

    private List<Curso> cursos = new ArrayList<>();
    private List<Profe> profes = new ArrayList<>();



    public List<Curso> getCursos(){
        return cursos;
    }

    public void addCurso(Curso cursos){
        cursos.addCurso(cursos);
    }

    public List<Profe> getProfe(){
        return profes;
    }

    public void AddProfes(Profe profe){
        profe.addProfes(profe);
    }

    public void asignarA(Profe profe, Curso curso){
        if(!profes.contains(profe)){
            System.out.println("Este profesor no existe ");
            return;
        }

        if (!cursos.contains(curso)){
            System.out.println("Este curso no existe ");
            return;
        }

        if (cursos.contains(profe)){
            System.out.println("este curso ya tiene este profesor");
            return;
        }

    }

    //TODO: Como agrego un estudiante a un grupo ?


}