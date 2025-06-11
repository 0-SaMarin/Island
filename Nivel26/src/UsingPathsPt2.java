import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class UsingPathsPt2 {
    public static void main(String[] args) {
        System.out.println(joinToPath(Arrays.asList("d:/", "study/", "codegym/", "useful_code_fragments.txt")));
    }

    public static Path joinToPath(List<String> partsList) {
        String[] partsArray = new String[partsList.size() - 1];
        System.arraycopy(partsList.toArray(), 1, partsArray, 0, partsArray.length);
        return Paths.get(partsList.get(0), partsArray);
    }
}
