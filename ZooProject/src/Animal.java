import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Animal {

    protected int row;
    protected int col;
    private int weight;
    private int threat;
    private String classification;
    private int energy;
    protected boolean isAlive;
    private int maxDistance;

    public Animal(int threat, int weight, String classification, int energy, boolean isAlive, int maxDistance) {
        this.threat = threat;
        this.weight = weight;
        this.classification = classification;
        this.energy = energy;
        this.isAlive = isAlive;
    }

    abstract void eat(Object object);

    public final void move(Island island) {
        if (maxDistance != 0) {
            int dRow = ThreadLocalRandom.current().nextInt(-maxDistance, maxDistance + 1);
            int dCol = ThreadLocalRandom.current().nextInt(-maxDistance, maxDistance + 1);

            int newRow = Math.max(0, Math.min(island.getRows() - 1, row + dRow));
            int newCol = Math.max(0, Math.min(island.getCols() - 1, col + dCol));

            island.moveAnimal(this, row, col, newRow, newCol);
        }
    }

    public abstract void reproduce(List<Animal> cellAnimals);

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

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

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

}
