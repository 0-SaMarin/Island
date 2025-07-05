import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Giraffe extends Animal{

    public Giraffe(int threat, int weight, String classification, int energy, boolean isAlive,int maxDistance) {
        super(threat, weight, classification, energy, isAlive,maxDistance);
    }


    @Override
    void eat(Object food) {
            if (!(food instanceof Plant)) {
                System.out.println("La jirafa solo puede comer plantas");
            }

            Plant plant = (Plant) food;
            System.out.println("la jirafa comio la planta");
            setEnergy(getEnergy() + plant.getNutrition());
    }

    @Override
    public void reproduce(List<Animal> cellAnimals) {
        long sameSpeciesCount = cellAnimals.stream()
                .filter(a -> a instanceof Giraffe && a.isAlive())
                .count();

        if (sameSpeciesCount >= 2) {
            if (ThreadLocalRandom.current().nextInt(100) < 30) {
                Giraffe baby = new Giraffe(2, 8,"herbivore", 100, true, 2);
                baby.setPosition(getRow(), getCol());
                cellAnimals.add(baby);
                Island.addAnimal(baby);
            }
        }

    }
}
