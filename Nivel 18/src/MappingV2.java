import java.util.HashMap;

public class MappingV2 {
    public static HashMap<String,Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        printStudents();
        System.out.println("La media de notas es: " + getAverageMark());
    }

    public static void addStudents(){
        grades.put("Wade Wilson",3.0d);
        grades.put("Peter Parker", 5.0d);
        grades.put("Wanda Maximof",3.8d );
        grades.put("Pietro Maximof",4.1d);
        grades.put("Anthony Stark", 5.0d);
    }

    public static void printStudents(){
        for (String name: grades.keySet() ){
            System.out.println(name);
        }
    }

    public static Double getAverageMark(){
        double sum = 0;
        for (double notas:grades.values()){
            sum = sum + notas;
        }
        double average = sum / grades.size();
        return  average;
    }
}
