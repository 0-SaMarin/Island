import java.io.*;
import java.util.Scanner;

public class ReadingBytes {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.println("Porfavor introduzca la ruta del primer archivo");
            String src = scan.nextLine();
            FileInputStream file1 = new FileInputStream(src);
            System.out.println("Porfavor introduzca la ruta del segundo archivo");
            String dest = scan.nextLine();
            FileInputStream file2 = new FileInputStream(dest);
            byte[] bytesIn = file1.readAllBytes();
            byte[] bytesOut = new byte[bytesIn.length];
            byte temp;
            for (int i = 0; i < bytesIn.length; i++) {


            }

        }catch(IOException e){

        }

    }
}