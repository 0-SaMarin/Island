import java.util.Scanner;

public class NormalTry {
    public static void main(String[] args) {
        Scanner scan = null;

        try{
           scan = new Scanner(System.in);
           String line = scan.nextLine();
            System.out.println(line.toUpperCase());
        }catch (Exception e){
            System.out.println("Algo salió mal : " + e);
        } finally {
            if(scan != null ){
                scan.close();
            }
        }
    }
}
