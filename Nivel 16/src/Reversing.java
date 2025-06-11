import java.util.ArrayList;

public class Reversing {
    public static ArrayList<Integer> numbers = new ArrayList<Integer>();

    public static void main(String[] args) {
        fill();
        print();
        System.out.println("");
        reverse();
        print();
    }

    public static void fill(){
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
    }

    public static void reverse(){
        int temp = 0;
        for (int i = 0; i < numbers.size() / 2; i++) {
            temp = numbers.get(i);
            numbers.set(i, numbers.get(numbers.size() - i - 1));
            numbers.set(numbers.size() - i - 1, temp);
        }
    }

    public static void print(){
        System.out.println(numbers);
    }
}
