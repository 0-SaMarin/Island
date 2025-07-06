public class Plant {
    private int energy;
    int row;
    int col;

    public Plant (int energy, int row, int col){
        this.energy = energy;
        this.row = row;
        this.col = col;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

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
}
