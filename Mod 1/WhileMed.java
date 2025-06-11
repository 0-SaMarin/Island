import java.util.Scanner;
public class WhileMed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true){
            String phrase = scan.next();
            if(phrase.equals("basta")){
                break;
            }
            System.out.println(phrase);
        }
    }
}
