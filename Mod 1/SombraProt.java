import java.util.Scanner;
public class SombraProt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Bienvenido, por favor ingrese un numero: ");
        int sizeNum = scan.nextInt();
        int[] numArray = new int[sizeNum];


        if(sizeNum > 0) {
            for(int counter = 0; counter < sizeNum; counter++){
                System.out.println("Por favor ingrese un numero para llenar el arrglo");
                int entryNum = scan.nextInt();
                numArray[counter] = entryNum;
            }

            if (sizeNum % 2 == 0){
                for (int i = numArray.length - 1; i >= 0; i--) {
                    System.out.println(numArray[i]);
                }
            }else{
                for (int i = 0;  i < numArray.length; i++) {
                    System.out.println(numArray[i]);
                }
            }
        }else {
            System.out.println("Numero invalido");
        }
    }
}
