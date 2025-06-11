import java.util.HashMap;

public class MappingV3 {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        printStudentsInfo();
    }

    public static void addStudents(){
        grades.put("Walt Whitman", 4.3d);
        grades.put("Emily Dickenson", 4.1d);
        grades.put("William Shakespeare", 4.9d);
        grades.put("Maya Angelou", 3.7d);
        grades.put("Shel Silverstein", 3.2d);
    }

    public static void printStudentsInfo(){
        double totalScore = 0;
        for (double grades: grades.values()){
            totalScore = totalScore + grades;
        }
        double average = totalScore / grades.size();

        for (String names:grades.keySet()){
            System.out.println(names + ": " + average);
        }
    }
}
