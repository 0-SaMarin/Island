import java.util.Scanner;
import java.nio.file.Path;

public class ToAbsolute {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Porfavor introduzca una ruta");
        String str = scan.nextLine();
        Path path = Path.of(str);
        if (path.isAbsolute()){
            System.out.println(path);
        }else {
            path.toAbsolutePath();
            System.out.println(path);
        }
    }
}

