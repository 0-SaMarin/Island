import java.util.ArrayList;
import java.util.Iterator;

public class Neutralize {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Hello world!");
        words.add("Amigo");
        words.add("Elly");
        words.add("Kerry");
        words.add("Bug");
        words.add("bug");
        words.add("Easy ug");
        words.add("Risha");

        ArrayList<String> wordsFirstCopy = new ArrayList<>(words);
        ArrayList<String> wordsSecondCopy = new ArrayList<>(words);
        ArrayList<String> wordsThirdCopy = new ArrayList<>(words);

        removeBugWithForI(wordsFirstCopy);
        removeBugWithWhile(wordsSecondCopy);
        removeBugWithCopy(wordsThirdCopy);

        wordsFirstCopy.forEach(System.out::println);
        String line = "_________________________";
        System.out.println(line);
        wordsSecondCopy.forEach(System.out::println);
        System.out.println(line);
        wordsThirdCopy.forEach(System.out::println);
        System.out.println(line);
    }

    public static void removeBugWithForI(ArrayList<String> list){
        for (int i = 0; i < list.size(); i++) {
            String string = list.get(i);
            if(string.equalsIgnoreCase("bug")){
                list.remove(string);
                i--;
            }
        }
    }

    public static void removeBugWithWhile(ArrayList<String> list){
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String string = iterator.next();
            if (string.equalsIgnoreCase("bug")){
                iterator.remove();
            }
        }
    }

    public static void removeBugWithCopy(ArrayList<String> list){
        ArrayList<String> copy = new ArrayList<>(list);
        for(String string : copy){
            if (string.equalsIgnoreCase("bug")){
                list.remove(string);
            }
        }
    }
}
