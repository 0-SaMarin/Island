public class Wolf extends Animal{

    public Wolf(int threat, int weight, String classification, int hunger, boolean isAlive) {
        super(threat, weight, classification, hunger, isAlive);
    }

    @Override
    void eat( Object food ) {
        if (!(food instanceof Animal)){
            System.out.println("El lobo solo puede comer otros Animales");
        }

        Animal prey = (Animal) food;

        if (!(prey.isAlive)){
            System.out.println();
        }
    }

    @Override
    void move() {

    }

    @Override
    void reproduce() {

    }
}
