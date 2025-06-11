import java.util.Scanner;
import java.io.*;

public class ScanAndBuffered {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String path = scan.nextLine();
        try(FileReader in = new FileReader(path)){
            BufferedReader reader = new BufferedReader(in);
            int count = 0;
            while(reader.ready()){
                String line = reader.readLine();
                if(count % 2 == 0){
                    System.out.println(line );
                }
                count++;
            }
        }catch (IOException e ){
            System.out.println("Algo salio mal " + e.getMessage());
        }
    }
}
