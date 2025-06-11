public class Array {

    public static void main(String[] args) {
        int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        int[] resultArray = new int[firstArray.length + secondArray.length];

        for (int i = 0; i < firstArray.length; i++) {
            resultArray[i] = firstArray[i];
            System.out.print(resultArray[i] + ", ");
        }

        int cont = firstArray.length;
        for (int i = 0; i < secondArray.length; i++) {
             resultArray[cont] = secondArray[i];
            System.out.print(resultArray[cont] + ", ");
            cont++;
        }

    }
}
