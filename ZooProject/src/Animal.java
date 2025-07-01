public abstract class Animal {

    protected int row;
    protected int col;
    private int weight;
    private int threat;
    private String classification;
    private int energy;
    protected boolean isAlive;

    public Animal(int threat, int weight, String classification, int energy, boolean isAlive) {
        this.threat = threat;
        this.weight = weight;
        this.classification = classification;
        this.energy = energy;
        this.isAlive = isAlive;
    }



    abstract void eat(Object object);

    abstract void move();

    abstract void reproduce();

    public void setPosition(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getThreat() {
        return threat;
    }

    public void setThreat(int threat) {
        this.threat = threat;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

}
