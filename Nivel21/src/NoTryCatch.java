public class NoTryCatch {
    public static void main(String[] args) throws Exception {
        generateLuckyNumber();
    }

    static void generateLuckyNumber() throws Exception {
        int luckyNumber = (int) (Math.random() * 100);
        if (luckyNumber == 13) {
            throw new Exception("Unlucky!");
        }
        System.out.println("Your lucky number: " + luckyNumber);
    }
}
