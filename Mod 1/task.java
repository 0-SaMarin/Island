import java.util.Scanner;
public class task {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String pass = scan.nextLine();

        if (pass.equalsIgnoreCase(secret)){
            System.out.println("Acceso permitido");
        }else{
            System.out.println("Acceso denegado");
        }



    }
}