import java.util.Scanner;
public class ArrayString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String compareNum;
        String[] strings = new String[6];

        for (int counter = 0; counter < strings.length; counter++) {
            String entryWords = scan.nextLine();
            strings[counter] = entryWords;
            System.out.print(strings[counter] + ", ");


        }
    }
}
