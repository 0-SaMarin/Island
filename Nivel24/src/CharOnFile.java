import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CharOnFile {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             FileWriter writer = new FileWriter(scanner.nextLine())) {
            char[] chars = new char[]{'j', 'a', 'v', 'a'};
            writer.write(chars,0,chars.length);

        } catch (IOException e) {
            System.out.println("Algo salió mal : " + e);
        }
    }
}
