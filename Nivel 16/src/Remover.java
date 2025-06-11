import java.util.ArrayList;

public class Remover {

    public static void main(String[] args) {
        ArrayList<String> glasses = initList();
        print(glasses);

        removeGlassesReverse(glasses);
        print(glasses);
    }

    private static ArrayList<String> initList() {
        String topLayer = "       🍷       ";
        String secondLayer = "      🍷🍷      ";
        String thirdLayer = "     🍷🍷🍷     ";
        String fourthLayer = "    🍷🍷🍷🍷    ";
        String fifthLayer = "   🍷🍷🍷🍷🍷   ";
        String sixthLayer = "  🍷🍷🍷🍷🍷🍷  ";
        String seventhLayer = " 🍷🍷🍷🍷🍷🍷🍷 ";
        String eighthLayer = "🍷🍷🍷🍷🍷🍷🍷🍷";
        ArrayList<String> list = new ArrayList<>();
        list.add(eighthLayer);
        list.add(seventhLayer);
        list.add(sixthLayer);
        list.add(fifthLayer);
        list.add(fourthLayer);
        list.add(thirdLayer);
        list.add(secondLayer);
        list.add(topLayer);
        return list;
    }

    public static void print(ArrayList<String> glasses) {
        for(int i = glasses.size() - 1; i >= 0; i--) {
            System.out.println(glasses.get(i));
        }
    }

    public static void removeGlassesReverse(ArrayList<String> glasses) {
        System.out.println("Starting to disassemble the tower...");

        for (int i = glasses.size() - 1; i >= 0; i--) {
            glasses.remove(i);
        }

        if(glasses.size() == 0) {
            System.out.println("The tower is disassembled!");
        }
    }
}
