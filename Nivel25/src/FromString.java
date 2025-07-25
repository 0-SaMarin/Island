import java.io.*;
import java.util.Base64;

public class FromString {
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            String string = toString(new MyClass("The quick brown fox jumps over the lazy dog."));
            System.out.printf("Object as a string: %s\n", string);

            MyClass myClass = (MyClass) fromString(string);
            System.out.println("Recovered object: " + myClass);

            System.out.println();
            fromString("");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String toString(Serializable o) throws IOException {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
             ObjectOutputStream oos = new ObjectOutputStream(baos)) {
            oos.writeObject(o);
            return Base64.getEncoder().encodeToString(baos.toByteArray());
        }
    }

    public static Object fromString(String s) throws IOException, ClassNotFoundException {
        byte[] data = Base64.getDecoder().decode(s);
        MyStream ms = new MyStream(data);
        try (ObjectInputStream ois = new ObjectInputStream(ms)) {
            Object o = ois.readObject();
            return o;
        }
    }
}
