public class Receipts {
    public static Integer balance = Integer.MAX_VALUE;

    public static void main(String[] args) {
        String bill = "1234567890";

        System.out.println("Saldo actual: " + balance);
        processPayment(bill);
        System.out.println("Saldo actual: " + balance);

    }

    public static void processPayment(String bill) {
       balance = balance - Integer.parseInt(bill);


    }
}
