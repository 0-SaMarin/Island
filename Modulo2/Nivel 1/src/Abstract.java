public class Abstract {
    public static void main(String[] args) {

    }

    public static abstract class Animal {
        public abstract String getName();
    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet {
        @Override
        public String getName(){
            return"";
        }
        @Override
        public Pet getChild(){
            Pet pet = null;
            return pet;
        }

    }

    public static class Dog extends Pet {

        @Override
        public String getName() {
            return "";
        }

        @Override
        public Pet getChild() {
            return null;
        }
    }
}
