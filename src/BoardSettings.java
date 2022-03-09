public class BoardSettings {
    private int rows;
    private int columns;
    private double bombsPercentage;

    public BoardSettings() {
        this.rows = 9;
        this.columns = 9;
        this.bombsPercentage = 0.12;
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public double getBombsPercentage() {
        return bombsPercentage;
    }

    public void setBombsPercentage(double bombsPercentage) {
        this.bombsPercentage = bombsPercentage;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }
}
