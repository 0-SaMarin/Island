import java.util.Scanner;

public class ForMed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int start = scan.nextInt();
        int end = scan.nextInt();
        int multiple = scan.nextInt();

        int sum = 0;
        for (int counter = start; counter < end ; counter++) {
            if(counter % multiple == 0){
                sum = sum + counter;
            }
        }
        System.out.println(sum);

    }
}
