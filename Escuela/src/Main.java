import java.util.ArrayList;
import java.util.List;

import static java.awt.AWTEventMulticaster.add;

public class Main {
    public static void main(String[] args){
        //Si el sistema pasa a manejar mas de una escuela
        //TODO: refactor escuela a singleton.

        Escuela escuelaDeProgramacion = new Escuela();
        List<Curso> misCursosDeProgramacion = new ArrayList<>();
        misCursosDeProgramacion.add(new Curso("Programacion Frontend con React", 15));
        misCursosDeProgramacion.add(new Curso("Programacion BackEnd con java ", 20));
        misCursosDeProgramacion.add(new Curso("Testing basico con Insomnia", 30));

        Curso peluqueria = new Curso("Colorimetria", 20);

        for (Curso curso: misCursosDeProgramacion){
            escuelaDeProgramacion.addCurso(curso);
        }

        misCursosDeProgramacion.forEach(curso -> escuelaDeProgramacion.addCurso(curso));

        ArrayList<Profe> profesDeProgramacion = new ArrayList<>();{{
          add(new Pro)
        }};
    }
}