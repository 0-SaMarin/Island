import java.util.Random;
import java.util.TreeMap;

public class Tree {
    public static void main(String[] args) {
        TreeMap<Integer, String> map =  new TreeMap<>();

        map.put(0, "Newbie");
        map.put(20000, "Trainee");
        map.put(80000, "Junior developer");
        map.put(85000, "Strong junior developer");
        map.put(95000, "Mid-level developer");
        map.put(105000, "Strong mid-level developer");
        map.put(120000, "Senior developer");

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int salary = random.nextInt(50) * 100;
            String position = getJobTitle(map, salary);
            System.out.printf("A salary of $%d corresponds to the job title \"%s\"%n", salary, position);
        }
    }

    public static String getJobTitle(TreeMap<Integer, String> map, Integer salary){
        return map.floorEntry(salary).getValue();
    }
}