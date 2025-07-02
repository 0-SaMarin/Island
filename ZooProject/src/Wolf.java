import java.util.concurrent.ThreadLocalRandom;

public class Wolf extends Animal{

    public Wolf(int threat, int weight, String classification, int hunger, boolean isAlive, int maxDistance) {
        super(threat, weight, classification, hunger, isAlive, maxDistance);
    }

    @Override
    void eat( Object food ) {
        if (!(food instanceof Animal)){
            System.out.println("El lobo solo puede comer otros Animales");
        }

        Animal prey = (Animal) food;

        if (this.getThreat() > prey.getThreat()) {
            System.out.println("El lobo se come a el/la " + prey.getClass());
            setEnergy(getEnergy() + prey.getEnergy());
            prey.setAlive(false);
        } else {
            System.out.println("el lobo no puede comerse a el/la " + prey.getClass());
        }

    }

    @Override
    void reproduce() {

    }
}
