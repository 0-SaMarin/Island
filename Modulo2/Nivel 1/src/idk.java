import javax.xml.namespace.QName;

public class idk {
    public static void main(String[] args) {
        Man man = new Man();
        Woman woman = new Woman();

        printName(man);
        printName(woman);
    }

    public static void printName(Human human) {

    }

    public static class Human {
        private String name;

        public Human() {
            this.name = name;
        }
    }

    public static class Man extends Human{

    }

    public static class Woman extends Human {
    }
}
