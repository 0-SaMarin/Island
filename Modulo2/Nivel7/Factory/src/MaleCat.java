public class MaleCat extends Cat{
    MaleCat(String name) {
        super(name);
    }

    public String toString() {
        return "I'm " + getName() + ", a cat with a reputation";
    }
}
