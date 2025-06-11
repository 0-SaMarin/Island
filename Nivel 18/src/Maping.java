import java.util.HashMap;

public class Maping {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents(){
        grades.put("Jose Martinez", 4.3d);
        grades.put("Maria Lopez", 4.1d);
        grades.put("Ana De Santos", 4.9d);
        grades.put("Pedro Garcia", 3.7d);
        grades.put("Hector Torres", 3.2d);
    }
}