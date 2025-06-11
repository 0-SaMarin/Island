import java.util.Arrays;
import java.util.Scanner;

public class Clase7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] matrizEscalonada = new int[3][];

        for (int i = 0; i < matrizEscalonada.length; i++) {
            System.out.println("Ingrese la longitud de las filas");
            int longFila = scan.nextInt();
            matrizEscalonada[i] =  new int[longFila];
            for (int j = 0; j < matrizEscalonada[i].length; j++) {
                System.out.println("Ingrese el numero de la celda: ");
                int numero = scan.nextInt();
                matrizEscalonada[i][j] = numero;
                }
            }
        System.out.println(Arrays.deepToString(matrizEscalonada));
        }
    }
