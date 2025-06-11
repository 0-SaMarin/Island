import java.nio.file.Path;
import java.util.Scanner;

public class Relative {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Porfavor introduzca la ruta 1:");
        String str1 = scan.nextLine();
        Path path1 = Path.of(str1);
        System.out.println("Porfavor introduzca otra ruta 2:");
        String str2 = scan.nextLine();
        Path path2 = Path.of(str2);

        if(!path1.isAbsolute()){
            System.out.println(path1.relativize(path2));
        }else if (!path2.isAbsolute()){
            System.out.println(path2.relativize(path1));
        }

    }
}
