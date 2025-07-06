//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int rows = 100;
        int cols = 20;
        int initialAnimals = 100;
        int initialPlants = 200;
        int steps = 100;

        Island island = new Island(rows, cols);

        island.populateIsland(initialAnimals);
        island.populatePlants(initialPlants);

        for (int i = 0; i < steps; i++) {
            island.simulateStep();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}