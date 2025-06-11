import java.util.Scanner;
public class SignIn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor ingrese su nombre de usuario.");
        System.out.println("Si no esta registrado Por favor ingrese el nombre de user");
        String username = scan.nextLine();
        signIn(username);

    }

    public static void  signIn(String username){
        if (username.equals("user")){
            return;
        }else {
            System.out.println("Welcome, " + username);
            System.out.println("We've really missed you, " + username);
        }
    }
}
