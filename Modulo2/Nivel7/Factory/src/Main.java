import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String key;

        while (true) {
            try {
                if (!!(key = reader.readLine()).equals("")) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Cat cat = CatFactory.getCatByKey(key);
            System.out.println(cat.toString());
        }
    }
}