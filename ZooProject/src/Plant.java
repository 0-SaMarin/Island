public class Plant implements Food {
    private int energy;

    public Plant (int energy){
        this.energy = energy;

    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }



    @Override
    public int getNutrition() {
        return this.energy;
    }
}
