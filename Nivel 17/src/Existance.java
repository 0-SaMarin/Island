import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class Existance {
    public static Set<String> words = new HashSet<>(Arrays.asList("If they asked me to choose a language to replace Java I wouldn't choose".split(" ")));

    public static void main(String[] args) {
        checkWords("JavaScript");
        checkWords("Java");
    }

    public static void checkWords(String word){
        if(words.contains(word)){
            System.out.println("La palabra " + word + " esta en el conjunto");
        }else{
            System.out.println("La palabra " + word  + " no esta en el conjunto");
        }
    }
}
