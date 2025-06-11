public class VerifiedExceptions {
    public static String errorMessage = "Unlucky!";

    public static void main(String[] args) {
        try {
            generateLuckyNumber();
        }catch(Exception unlucky){
            System.out.println(errorMessage);
        }
    }

    static void generateLuckyNumber() throws Exception {
        boolean check = false;
        while(!check){
            int luckyNumber = (int) (Math.random() * 100);
            System.out.println("Your lucky number: " + luckyNumber);

            if (luckyNumber == 13) {
                throw new Exception();
            }
            check = false;
        }

    }
}
