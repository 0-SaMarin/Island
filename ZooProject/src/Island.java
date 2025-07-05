import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Island {

    private List<Animal> [][] island;
    private final int rows;
    private final int cols;
    private List<Animal> allAnimals;
    private Plant[][] plants;


    public Island(int rows, int cols){
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

    public void addAnimal(Animal animal) {
        allAnimals.add(animal);
    }

    public boolean isCellEmpty(int row, int col) {
        return island[row][col].isEmpty();
    }

    public void placeAnimal(Animal animal, int row, int col) {
        if (!isInBounds(row, col)) {
            island[row][col].add(animal);
            animal.setPosition(row, col);
            allAnimals.add(animal);
        }
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

    public void populateIsland(int count){
        for (int i = 0; i < count; i++) {
            Animal animal = createRandomAnimal();

            int row = ThreadLocalRandom.current().nextInt(rows);
            int col = ThreadLocalRandom.current().nextInt(cols);

            placeAnimal(animal,row, col);

            System.out.println("Posicionado " + animal.getClass().getSimpleName() +
                    " at [" + row + "," + col + "]");
        }
    }

    public void populatePlants(int count) {
        for (int i = 0; i < count; i++) {
            int row = ThreadLocalRandom.current().nextInt(rows);
            int col = ThreadLocalRandom.current().nextInt(cols);

            if (plants[row][col] == null) {
                plants[row][col] = new Plant(20);
            } else {

                i--;
            }
        }
    }

    private Animal createRandomAnimal() {
        int roll = ThreadLocalRandom.current().nextInt(5);
        return switch (roll) {
            case 0 -> new Rabbit(1,3,"hervibore", 100, true, 1);
            case 1 -> new Giraffe(2, 8,"herbivore", 100, true, 2);
            case 2 -> new PandaBear(7, 9, "herbivore", 100, true, 1);
            case 3 -> new Tiger(8, 6, "carnivore", 100, true, 3);
            default -> new Wolf(8, 5, "carnivore", 100, true, 3);
        };
    }

    public Plant getPlantAt(int row, int col) {
        return plants[row][col];
    }

    public void simulateStep() {
        allAnimals.parallelStream().forEach(animal -> {
            if (!animal.isAlive()) return;

            int row = animal.getRow();
            int col = animal.getCol();

            List<Animal> cellAnimals = island[row][col];
            Plant plant = plants[row][col];


            synchronized (cellAnimals) {
                animal.eat(cellAnimals);
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
