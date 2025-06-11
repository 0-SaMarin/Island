import java.util.*;

public class ListToCollection {
    public static ArrayList<String> listOfWords = new ArrayList<>(Arrays.asList("A new series of Java programming books has been released: \"Java for Beginners\", \"Java for Professionals\", \"Java for Graduates\""
            .split(" ")));

    public static void main(String[] args) {
        System.out.println("The number of words in the list is: " + listOfWords.size());
        HashSet<String> setOfWords = listToCollection(listOfWords);
        System.out.println("The number of woerds in the set is: " + setOfWords.size());
    }

    public static HashSet<String> listToCollection(ArrayList<String> listOfWords) {
        HashSet<String> result = new HashSet<>();
        for (int i = 0; i < listOfWords.size(); i++) {
            result.add(listOfWords.get(i));
        }

        return result;
    }
}
