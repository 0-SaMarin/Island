import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Germanshepard extends Animal{

    public Germanshepard(int threat, int weight, String classification, int energy, boolean isAlive, int maxDistance) {
        super(threat, weight, classification, energy,isAlive,maxDistance );
    }

    @Override
    void eat(Object food) {
        if (!(food instanceof Animal)){
            System.out.println("El Pastor Aleman solo puede comer otros Animales");
        }

        Animal prey = (Animal) food;

        if (this.getThreat() > prey.getThreat()) {
            System.out.println("El Pastor Aleman se come a el/la " + prey.getClass());
            setEnergy(getEnergy() + prey.getEnergy());
            prey.setAlive(false);
        } else {
            System.out.println("el Pastor Aleman no puede comerse a el/la " + prey.getClass());
        }
    }

    @Override
    public void reproduce(List<Animal> cellAnimals) {
        long sameSpeciesCount = cellAnimals.stream()
                .filter(a -> a instanceof Germanshepard && a.isAlive())
                .count();

        if (sameSpeciesCount >= 2) {
            if (ThreadLocalRandom.current().nextInt(100) < 30) { // 30% chance
                Germanshepard puppy = new Germanshepard(8, 6, "carnivore", 100, true, 3);
                puppy.setPosition(getRow(), getCol());
                cellAnimals.add(puppy);
                Island.addAnimal(puppy);
            }
        }
    }
}
