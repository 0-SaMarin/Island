import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ForE {
    public static void main(String[] args) {
        String[] wordArray = "I think this will be a new feature. Just don't tell anyone that it was an accident.".split(" ");
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList(wordArray));
        HashSet<String> wordSet = new HashSet<>(wordList);
        printList(wordList);
        System.out.println("__________________________________");
        printSet(wordSet);
    }

    public static void printList(ArrayList<String> wordList){
        for(String word : wordList){
            System.out.println(word);
        }
    }

    public static void printSet(HashSet<String> wordSet){
        for(String word : wordSet){
            System.out.println(word);
        }
    }
}
