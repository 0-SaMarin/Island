import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Iteration {
    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>(Arrays.asList("Programming is usually taught using examples.".split(" ")));
        print(words);
    }

    public static void print(HashSet<String> words){
        Iterator<String> it = words.iterator();
        while(it.hasNext()){
            String word = it.next();
            System.out.println(it);
        }
    }
}
