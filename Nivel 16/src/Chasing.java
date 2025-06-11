import java.util.ArrayList;
public class Chasing {
    public static void main(String[] args) {
        var elements = new ArrayList<>();
        elements.add("Hola");
        elements.add(10);
        elements.add(new Integer[15]);
        elements.add(new LinkageError());

        checkElementsType(elements);
    }

    public static void checkElementsType(ArrayList<Object> elements) {
        for (int i = 0; i < elements.size(); i++) {
            if(elements.get(i) instanceof String){
                printString();
            } else if (elements.get(i) instanceof Integer) {
                printInteger();
            } else if (elements.get(i) instanceof  Integer[]) {
                printIntegerArray();
            }else{
                printUnknown();
            }
        }
    }

    public static void printString() {
        System.out.println("String");
    }

    public static void printInteger() {
        System.out.println("Integer");
    }

    public static void printIntegerArray() {
        System.out.println("Array de enteros");
    }

    public static void printUnknown() {
        System.out.println("Otro tipo de datos");
    }
}
