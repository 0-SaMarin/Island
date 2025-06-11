public class Calculator {
    public static final String EQUAL = " = ";

    public static void main(String[] args) {
        int a = 45;
        int b = 15;
        Calculator.Calculadora.add(a,b);
        Calculator.Calculadora.substract(a,b);
        Calculator.Calculadora.multiply(a,b);
        Calculator.Calculadora.divide(a,b);
    }

    static class Calculadora{
        public static void add(int a, int b){
            System.out.println(a + " + " + b + EQUAL + (a + b) );
        }

        public static void substract(int a, int b){
            System.out.println(a + " - " + b + EQUAL + (a - b) );
        }

        public static void multiply(int a, int b){
            System.out.println(a + " * " + b + EQUAL + (a * b) );
        }

        public static void divide(int a, int b){
            System.out.println(a + " / " + b + EQUAL + (a / b) );
        }
    }
}
