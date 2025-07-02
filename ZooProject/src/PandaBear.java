import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public  class PandaBear extends Animal{

    public PandaBear(int threat, int weight, String classification, int hunger, boolean isAlive, int maxDistance) {
        super(threat, weight, classification, hunger, isAlive, maxDistance);
    }

    @Override
    void eat(Object food) {
        if (!(food instanceof Plant)) {
            System.out.println("La jirafa solo puede comer plantas");
        }

        Plant plant = (Plant) food;
        System.out.println("el panda comio la planta");
        setEnergy(getEnergy() + plant.getNutrition());
    }

    @Override
    public void reproduce(List<Animal> cellAnimals) {
        long sameSpeciesCount = cellAnimals.stream()
                .filter(a -> a instanceof PandaBear && a.isAlive())
                .count();

        if (sameSpeciesCount >= 2) {
            if (ThreadLocalRandom.current().nextInt(100) < 30) {
                PandaBear baby = new PandaBear();
                baby.setPosition(getRow(), getCol());
                cellAnimals.add(baby);
                Island.addAnimal(baby);
            }
        }
}
