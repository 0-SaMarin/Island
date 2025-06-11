import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class IntroToLambdaExpresions {
    public static void main(String[] args) {
        var numbers = new ArrayList<Integer>();

        Collections.addAll(numbers,123, -6, 12, 0, 44, 5678, -350);

        sortNumbers(numbers);

        for(Integer integer :numbers){
            System.out.println(integer);
        }
    }

    public static void sortNumbers(ArrayList<Integer> numbers){
        Comparator<Integer> comparator = ((o1, o2) -> o1 -o2);

         Collections.sort(numbers, comparator);
    }
}
