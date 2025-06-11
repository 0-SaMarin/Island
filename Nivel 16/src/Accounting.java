import java.util.ArrayList;
public class Accounting {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Doc");
        waitingEmployees.add("Grumpy");
        waitingEmployees.add("Happy");
        waitingEmployees.add("Sleepy");
        waitingEmployees.add("Bashful");
        waitingEmployees.add("Sneezy");
        waitingEmployees.add("Dopey");
    }

    public static void main(String[] args) {
        initEmployees();

    }

    public static void paySalary(String name) {
        for (int i = 0; i < waitingEmployees.size(); i++) {
            if (waitingEmployees.get(i).contains(name) && !alreadyGotSalaryEmployees.contains(name)) {
                alreadyGotSalaryEmployees.add(name);
            } else if (waitingEmployees.get(i).equals(name) && alreadyGotSalaryEmployees.equals(name)) {
                waitingEmployees.set(i,null);
            }
        }
    }
}
