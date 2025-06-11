import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.io.*;

public class BufferdToScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String answer = scan.nextLine();
        try (FileReader in = new FileReader(answer);
             BufferedReader buff = new BufferedReader(in)) {
            String line = buff.readLine();
            char[] chars = line.toCharArray();
            Set<Character> characters = new HashSet<>();
            for (char aChar : chars) {
                if (Character.isAlphabetic(aChar)) {
                    characters.add(Character.toLowerCase(aChar));
                }
            }
            System.out.println(characters);
        } catch (IOException e) {
            System.out.println("Algo salió mal : " + e);
        }
    }
}
