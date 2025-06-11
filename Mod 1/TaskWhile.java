import java.util.Scanner;
public class TaskWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        for (int counter = 1000; counter > number ; counter--) {
            System.out.println(counter);
        }

    }
}