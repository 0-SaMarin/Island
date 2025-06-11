import java.util.ArrayList;

import static java.awt.AWTEventMulticaster.add;

public class Faculty {
    public static void main(String[] args) {
        var students = new ArrayList<>();
        students.add(new Student("Samuel", 17));
        students.add(new Student("Juan", 17));

    }

    public static void printStudentNames(ArrayList<Student> students){
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getName());
        }
    }
}