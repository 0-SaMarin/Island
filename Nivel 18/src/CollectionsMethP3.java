import java.util.ArrayList;
import java.util.Collections;

public class CollectionsMethP3 {
    public static Integer min(ArrayList<Integer> list) {
        return  Collections.min(list);
    }

    public static Integer max(ArrayList<Integer> list) {
        return Collections.max(list);
    }

    public static int frequency(ArrayList<Integer> list, Integer element) {
        return Collections.frequency(list, element);
    }

    public static int binarySearch(ArrayList<Integer> list, Integer key) {
        return Collections.binarySearch(list, key);
    }
}
