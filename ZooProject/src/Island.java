import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Island {

    private List<Animal> [][] island;
    private int rows;
    private int cols;
    private List<Animal> allAnimals;
    private Plant[][] plants;


    public Island(int row, int coll){
        this.rows = rows;
        this.cols = cols;
        this.island =  new ArrayList[rows][cols];
        this.allAnimals = new ArrayList<>();
        this.plants = new Plant[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                island[i][j] =  Collections.synchronizedList(new ArrayList<>());
            }
        }
    }

    public void addAnimal(Animal animal, int row, int col) {
        allAnimals.add(animal);
        island[row][col].add(animal);
        animal.setPosition(row, col);
    }

    public boolean isCellEmpty(int row, int col) {
        return island[row][col] == null;
    }

    public void placeAnimal(Animal animal, int row, int col) {
        island[row][col] = Collections.singletonList(animal);
        animal.setPosition(row, col);
    }

    private boolean isInBounds(int row, int col) {
        return row >= 0 && row < rows && col >= 0 && col < cols;
    }

    public void moveAnimal(Animal animal, int fromRow, int fromCol, int toRow, int toCol) {
        List<Animal> fromCell = island[fromRow][fromCol];
        List<Animal> toCell = island[toRow][toCol];

        synchronized (fromCell) {
            fromCell.remove(animal);
        }
        synchronized (toCell) {
            toCell.add(animal);
        }

        animal.setPosition(toRow, toCol);
    }

    public void simulateStep() {
        allAnimals.parallelStream().forEach(animal -> {
            if (!animal.isAlive()) return;

            int row = animal.getRow();
            int col = animal.getCol();

            List<Animal> cellAnimals = island[row][col];
            Plant plant = plants[row][col];


            synchronized (cellAnimals) {
                animal.eat(cellAnimals, plant);
                animal.reproduce(cellAnimals);
            }

            synchronized (animal) {
                animal.move(this);
            }
        });
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getCols() {
        return cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }
}
