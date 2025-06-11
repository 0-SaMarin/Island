import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static final String INPUT_NAME = "\nIngresa un nombre: ";
    public static final String INPUT_AGE = "Ingrese la edad del usuario '%s': ";

    public static final String CANNOT_BE_NULL = "El nombre no puede ser nulo.";
    public static final String CANNOT_BE_EMPTY = "El nombre no puede estar vacío.";
    public static final String CANNOT_CONTAIN_DIGIT = "El nombre no puede contener números.";
    public static final String CANNOT_BE_NEGATIVE = "La edad no puede ser menor que 0.";
    public static final String CANNOT_BE_TOO_BIG = "La edad no puede ser mayor que 150.";
    public static final String UNKNOWN_ERROR = "Error desconocido.";

    public static final String FOUND = "\nNo se encontró el usuario '%s' en el índice %d.\n";
    public static final String NOT_FOUND = "\nNo se encontró el usuario '%s'.\n";

    static List<User> users = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            addUser(new User());
        }

        User userToSearch = new User();
        userToSearch.setName("Raphael");

        findUserIndex(userToSearch);
    }

    static void addUser(User user) {
        System.out.print(INPUT_NAME);
        String name = scanner.nextLine();

        System.out.printf(INPUT_AGE, name);
        int age = Integer.parseInt(scanner.nextLine());

        int returnUser = user.setName(name);
        if(returnUser == -1){
            System.out.println(CANNOT_BE_NULL);
        }else if (returnUser == -2){
            System.out.println(CANNOT_BE_EMPTY);
        } else if (returnUser == -3) {
            System.out.println(CANNOT_CONTAIN_DIGIT);
        } else if (returnUser != 0 ) {
            System.out.println(UNKNOWN_ERROR);
        }

        int returnAge = user.setAge(age);
        if(returnAge == -1){
            System.out.println(CANNOT_BE_NEGATIVE);
        }else if (returnAge == -2){
            System.out.println(CANNOT_BE_TOO_BIG);
        } else if (returnAge != 0 ) {
            System.out.println(UNKNOWN_ERROR);
        }

        users.add(user);
    }

    static void findUserIndex(User user) {
        int returnUser = users.indexOf(user);
        if (returnUser >= 0){
            System.out.printf(FOUND, user.getName(), users.indexOf(user));
        }else {
            System.out.printf(NOT_FOUND, user.getName());
        }
    }
}