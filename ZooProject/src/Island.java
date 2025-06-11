public class Island {

    private Animal[][] island;
    private int rows;
    private int cols;

    public Island(int row, int coll){
        this.rows = rows;
        this.cols = cols;
        island = new Animal[rows][cols];
    }

    public boolean isCellEmpty(int row, int col) {
        return island[row][col] == null;
    }

    public Animal getAnimalAt(int row, int col) {
        return island[row][col];
    }

    public void placeAnimal(Animal animal, int row, int col) {
        island[row][col] = animal;
        animal.setPosition(row, col);
    }

    private boolean isInBounds(int row, int col) {
        return row >= 0 && row < rows && col >= 0 && col < cols;
    }
}
