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

    public void moveAnimal(int fromRow, int fromCol, int toRow, int toCol) {
        if (isInBounds(toRow, toCol)) {
            Animal movingAnimal = island[fromRow][fromCol];
            Animal targetAnimal = island[toRow][toCol];

            if (targetAnimal != null && movingAnimal != null) {
                movingAnimal.eat(targetAnimal, movingAnimal);
            }

            island[toRow][toCol] = movingAnimal;
            island[fromRow][fromCol] = null;
            movingAnimal.setPosition(toRow, toCol);
        }
    }

    private boolean isInBounds(int row, int col) {
        return row >= 0 && row < rows && col >= 0 && col < cols;
    }
}
