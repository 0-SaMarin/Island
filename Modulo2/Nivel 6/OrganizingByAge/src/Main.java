import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Collections.addAll(students,
                new Student("Jhon", 15),
                new Student("Marina", 17 ),
                new Student("Nine", 18)
        );

        Collections.sort(students, new AgeComparator());

        for (Student student : students){
            System.out.println(student);
        }
    }
}