import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Lion extends Animal implements Carnivore{

    public Lion(int threat, int weight, String classification, int energy, boolean isAlive, int maxDistance) {
        super(threat, weight, classification, energy, isAlive, maxDistance);
    }

    @Override
    void eat(List<Animal> cellAnimals, Island island) {
        boolean ate = false;

        for (Animal prey : cellAnimals) {
            if (prey != this && prey.isAlive()) {
                if (this.getThreat() > prey.getThreat()) {
                    System.out.println("El leon se come a el/la " + prey.getClass().getSimpleName());
                    setEnergy(getEnergy() + prey.getEnergy());
                    prey.setAlive(false);
                    ate = true;
                    break;
                } else {
                    System.out.println("El leon no puede comerse a el/la " + prey.getClass().getSimpleName());
                }
            }
        }
        if(!ate){
            System.out.println("El leon no encontró presa adecuada para comer.");
        }
    }

    @Override
    public void reproduce(List<Animal> cellAnimals, Island island) {
        long sameSpeciesCount = cellAnimals.stream()
                .filter(a -> a instanceof Lion && a.isAlive())
                .count();

        if (sameSpeciesCount >= 2) {
            if (ThreadLocalRandom.current().nextInt(100) < 30) {
                Lion cub = new Lion(8, 5, "carnivore", 100, true, 3);
                cub.setPosition(getRow(), getCol());
                cellAnimals.add(cub);
                Island.addAnimal(cub);
            }
        }
    }
}
