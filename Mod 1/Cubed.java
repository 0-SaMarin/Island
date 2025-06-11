public class Cubed {
    public static void main(String[] args) {
        int num = 3;
        int power = 3;
        cube(num, power);

    }

    public static void cube(int num,int power){
        int cubed = 0;
        for (int i = 0; i < power; i++) {
            cubed = num * num;

        }
        System.out.println(cubed);
    }
}
