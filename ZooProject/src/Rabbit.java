import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Rabbit extends Animal implements Herbivore{

    public Rabbit(int threat, int weight, String classification, int hunger, boolean isAlive, int maxDistance) {
        super(threat, weight, classification, hunger, isAlive, maxDistance);
    }

    @Override
    void eat(List<Animal> cellAnimals, Island island) {
        Plant plant = island.getPlantAt(getRow(), getCol());
        if (plant != null) {
            System.out.println(getClass().getSimpleName() + " Come una planta en [" + getRow() + "," + getCol() + "]");
            setEnergy(getEnergy() + plant.getEnergy());
            island.removePlantAt(getRow(), getCol());
        } else {
            System.out.println(getClass().getSimpleName() + " No encontro nada en [" + getRow() + "," + getCol() + "]");
        }
    }

    @Override
    public void reproduce(List<Animal> cellAnimals, Island island) {
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
