public class Rabbit extends Animal{

    public Rabbit(int threat, int weight, String classification, int hunger, boolean isAlive, int maxDistance) {
        super(threat, weight, classification, hunger, isAlive, maxDistance );
    }

    @Override
    void eat(Object food) {
        if (!(food instanceof Plant)) {
            System.out.println("La jirafa solo puede comer plantas");
        }

        Plant plant = (Plant) food;
        System.out.println("el conejo comio la planta");
        setEnergy(getEnergy() + plant.getNutrition());
    }

    @Override
    void reproduce() {

    }


}
