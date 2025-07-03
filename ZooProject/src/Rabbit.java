import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Rabbit extends Animal{

    public Rabbit(int threat, int weight, String classification, int hunger, boolean isAlive, int maxDistance) {
        super(threat, weight, classification, hunger, isAlive, maxDistance);
    }

    @Override
    void eat(Object food) {
        if (!(food instanceof Plant)) {
            System.out.println("el conejo solo puede comer plantas");
        }

        Plant plant = (Plant) food;
        System.out.println("el conejo comio la planta");
        setEnergy(getEnergy() + plant.getNutrition());
    }

    @Override
    public void reproduce(List<Animal> cellAnimals) {
        long sameSpeciesCount = cellAnimals.stream()
                .filter(a -> a instanceof Rabbit && a.isAlive())
                .count();

        if (sameSpeciesCount >= 2) {
            if (ThreadLocalRandom.current().nextInt(100) < 30) {
                Rabbit baby = new Rabbit(3,5, "herbivore", 100, true, 1);
                baby.setPosition(getRow(), getCol());
                cellAnimals.add(baby);
                Island.addAnimal(baby);
            }
        }
    }


}
