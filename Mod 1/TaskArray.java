public class TaskArray {

    public static int[] array = new int[]{-1, 2, 3, -4, -5};

    public static void main(String[] args) {
        for(int counter = 0; counter < 5; counter++){
            if (array[counter] % 2 == 0){
                array[counter] = array[counter] * -1;
            }
        }
    }
}
