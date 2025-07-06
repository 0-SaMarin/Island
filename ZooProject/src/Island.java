import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class Island {

    private List<Animal> [][] island;
    private final int rows;
    private final int cols;
    private static List<Animal> allAnimals;
    private  List<Plant>[][] plants;


    public Island(int rows, int cols){
        this.rows = rows;
        this.cols = cols;
        this.island = (List<Animal>[][]) new List[rows][cols];
        this.allAnimals = new ArrayList<>();
        this.plants = new List[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                island[i][j] =  Collections.synchronizedList(new ArrayList<>());
            }
        }
    }

    public static void addAnimal(Animal animal) {
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
                plants[row][col] = Collections.singletonList(new Plant(20, row, col));
            } else {
                i--;
            }
        }
    }

    private Animal createRandomAnimal() {
        int roll = ThreadLocalRandom.current().nextInt(7);
        return switch (roll) {
            case 0 -> new Rabbit(1,3,"hervibore", 100, true, 1);
            case 1 -> new Giraffe(2, 8,"herbivore", 100, true, 2);
            case 2 -> new PandaBear(7, 9, "herbivore", 100, true, 1);
            case 3 -> new Tiger(8, 6, "carnivore", 100, true, 3);
            case 4-> new Lion(9, 8,"carnivore", 100, true, 4);
            case 5-> new Gazelle(4, 6, "herbivore", 100, true, 3);
            default -> new Wolf(8, 5, "carnivore", 100, true, 3);
        };
    }

    public Plant getPlantAt(int row, int col) {
        return (Plant) plants[row][col];
    }

    public void simulateStep() {
        System.out.printf("\n ----Simulando isla-----");

        List<Animal> currentAnimals = new ArrayList<>(allAnimals);

        for (Animal animal : currentAnimals){
            if (animal.isAlive){
                int row = animal.getRow();
                int col = animal.getCol();

                List<Animal> cellAnimals = island[row][col];
                Plant plant = (Plant) plants[row][col];

                System.out.println("\n➡️ " + animal.getClass().getSimpleName() +
                        " esta [" + row + "," + col + "] | Energia: " + animal.getEnergy());

                if (animal instanceof Herbivore) {
                    if (plant != null && plant.getEnergy() > 0) {
                        animal.eat(cellAnimals, this);
                        System.out.println("🌿 " + animal.getClass().getSimpleName() + " Se comio la planta en [" + row + "," + col + "]");
                        plants[row][col] = null;
                    } else {
                        System.out.println("🌿 No se encontro la planta.");
                    }
                } else if (animal instanceof Carnivore) {
                    animal.eat(cellAnimals,this);
                }

                animal.reproduce(cellAnimals, this);


                animal.move(this);


                animal.setEnergy(animal.getEnergy() - 10);
                if (animal.getEnergy() <= 0) {
                    animal.setAlive(false);
                    System.out.println("💀 " + animal.getClass().getSimpleName() + " murio de hambre.");
                }

            }
        }
    }

    public int getRows() {
        return rows;
    }



    public int getCols() {
        return cols;
    }

    public void removePlantAt(int row, int col) {
        List<Plant> cellPlants = plants[row][col];
        if (!cellPlants.isEmpty()) {
            cellPlants.removeFirst();
        }

    }
}
