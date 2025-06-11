import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CatchingExceptionsPt2 {
    public static final String PROMPT_STRING = "Enter a student number, or 'exit' to exit: ";
    public static final String EXIT = "exit";
    public static final String ANSWERING = "The question will be answered by ";
    public static final String NOT_EXIST = "A student with this number does not exist";
    public static final String INTEGER_REQUIRED = "You must enter an integer";

    static List<String> studentsJournal = new ArrayList<>();

    public static void main(String[] args) {
        Collections.addAll(studentsJournal,
                "Hugh Jass"
                , "Rita Booke"
                , "Justin Case"
                , "Robin Banks"
                , "Manny Kinn"
                , "Harry Pitts"
                , "Marty Graw"
                , "Shanda Lear"
                , "Rusty Dorr"
                , "Otto Graph");

        Scanner scan = new Scanner(System.in);


        while (true) {
            System.out.print(PROMPT_STRING);
            String input = scan.nextLine();
            if (input.toLowerCase().equals(EXIT)) {
                System.out.println("You have exited the program, goodbye.");
                break;
            }

            int studentId;
            try {
                studentId = Integer.parseInt(input);
            }catch (NumberFormatException NumberFormat){
                System.out.println(INTEGER_REQUIRED);
                continue;
            }
            try {
                System.out.println(ANSWERING + studentsJournal.get(studentId));
            }catch (IndexOutOfBoundsException IndexoutOfBounds) {
                System.out.println(NOT_EXIST);
            }
        }
    }
}
