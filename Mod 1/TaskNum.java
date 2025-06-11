import java.util.Scanner;
public class TaskNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();


        if(num1 == num2 ){
            System.out.println(num1 +" " + num2);
        } else if (num2 == num3 && num1 != num2 ) {
            System.out.println(num2 + " " + num3 );
        } else if (num1 == num2 && num2 == num3) {
            System.out.println(num1 + " " + num2 + " " + num3 );
        }else{

        }
    }
}
