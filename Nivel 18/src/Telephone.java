import java.util.Map;
import java.util.NavigableSet;
import java.util.TreeMap;

public class Telephone {
    public static void main(String[] args) {
        TreeMap<String,String> phoneBook = new TreeMap<>();

        phoneBook.put("Valentino Douglas", "555-5566");
        phoneBook.put("Burn Penny", "950-4466");
        phoneBook.put("Ventura Blake", "554-5566");
        phoneBook.put("Allen Ally", "505-2266");
        phoneBook.put("McCall Max", "550-5533");
        phoneBook.put("Adams Andrew", "555-555555");
        phoneBook.put("Elliot George", "558-2066");
        phoneBook.put("Redfern John", "455-6566");
        phoneBook.put("Alton Allison", "500-8766");
        phoneBook.put("Grimes Victor", "355-5986");

        TreeMap<String, String> contactsByFirstLetter = getContactsStartsWith(phoneBook, "Al");

        if (contactsByFirstLetter.isEmpty()) {
            System.out.println("No se han encontrado resultados.");
        } else {
            for (Map.Entry<String, String> entry : contactsByFirstLetter.entrySet()) {
                System.out.printf("%s, %s%n", entry.getKey(), entry.getValue());
            }
        }
    }

    public static TreeMap<String, String> getContactsStartsWith(TreeMap<String, String> map, String startsWith) {
        TreeMap<String, String> result = new TreeMap<>();
        NavigableSet<String> keys = map.navigableKeySet();
        for (String key : keys) {
            if (key.toLowerCase().startsWith(startsWith.toLowerCase())) {
                result.put(key, map.get(key));
            }
        }
        return result;
    }
}

