import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {
        CustomArraylist arraylist = new CustomArraylist();
        for (int i = 0; i < 25; i++) {
            arraylist.add("contar" + i);
        }
    }
}