import java.nio.file.Path;
import java.util.Scanner;

public class FindingThePath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Porfavor introduzca la ruta del archivo");
        String str = scanner.nextLine();
        Path path = Path.of(str).getRoot();
        System.out.println(path);
    }
}