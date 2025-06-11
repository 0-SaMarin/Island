import java.util.ArrayList;

public class BInarySearch {
    public static void main(String[] args) {

    }
    public static int binarySearch(ArrayList<Integer> list, Integer key) {
        int low = 0;
        int high = list.size() - 1;
        int mid = (low + high) / 2;
        int index = -1;
        while (low <= high) {
            if (list.get(mid) < key) {
                low = mid + 1;
            } else if (list.get(mid).equals(key)) {
                index = mid;
                break;
            } else {
                high = mid - 1;
            }
            mid = (low + high) / 2;
        }
        return index;
    }
}
