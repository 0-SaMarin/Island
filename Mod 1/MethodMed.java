public class MethodMed {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,0};
        printArray(array);
        reverseArray(array);
    }

    public static void reverseArray(int[] array){
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
