public class Cat {
    private String name;

    protected Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "I'm " + getName() + ", a street cat";
    }
}
