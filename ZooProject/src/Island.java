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
                island[i][j] = new ArrayList<>();
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

    public Animal getAnimalAt(int rows, int cols) {
        return (Animal) island[rows][cols];
    }

    public void placeAnimal(Animal animal, int row, int col) {
        island[row][col] = Collections.singletonList(animal);
        animal.setPosition(row, col);
    }

    private boolean isInBounds(int row, int col) {
        return row >= 0 && row < rows && col >= 0 && col < cols;
    }
}
