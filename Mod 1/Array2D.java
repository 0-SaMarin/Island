import java.util.Scanner;
public class Array2D {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor ingrese la cantidad de filas para la columna 0: ");
        int numRows = scan.nextInt();
        if (numRows > 0){
            int[][] arrays = new int[numRows][];
            for (int i = 0; i < numRows; i++) {
                System.out.println("Por favor ingrese la cantidad de celdas para la fila: " + i);
                int line = scan.nextInt();
                arrays[i] = new int[line];
            }
        }
    }
}
