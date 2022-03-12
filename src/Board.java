import java.util.Objects;

import static java.lang.Math.sqrt;

public class Board {
    private int rows;
    private int columns;
    private double bombsPercentage;
    private final Cell[][] board;

    public Board() {
        this.rows = 9;
        this.columns = 9;
        this.bombsPercentage = 0.12;
        this.board = new Cell[rows][columns];

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                Cell c = new Cell();
                this.board[i][j] = c;
            }
        }
    }

    public Board(int rows, int columns, double bombsPercentage) {
        this.rows = rows;
        this.columns = columns;
        this.bombsPercentage = bombsPercentage;
        this.board = new Cell[rows][columns];

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                Cell c = new Cell();
                this.board[i][j] = c;
            }
        }
    }

    public int getRows() {
        return this.rows;
    }

    public int getColumns() {
        return this.columns;
    }

    public double getBombsPercentage() {
        return this.bombsPercentage;
    }

    public String getCellType(int i, int j){
        return  this.board[i][j].getType();
    }

    public void getBoard() {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                System.out.println(this.board[i][j].toString());
            }
        }
    }

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public boolean isCellHidden(int i, int j){
        return this.board[i][j].isHidden();
    }

    public boolean isCellFlag(int i, int j){
        return this.board[i][j].isFlag();
    }

    public void setCellType(int row, int column, String type) {
        this.board[row][column].setType(type);
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public void setBombsPercentage(double bombsPercentage) {
        this.bombsPercentage = bombsPercentage;
    }


    public void generateBombs() {
        int bombs = (int) (this.rows * this.columns * this.bombsPercentage);
        while (bombs > 0) {
            plantBomb();
            bombs--;
        }
    }

    public void clearGeneration() {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                setCellType(i, j, "EMPTY");
            }
        }
    }

    private void plantBomb() {
        int row = getRandomNumber(0, this.rows - 1);
        int column = getRandomNumber(0, this.columns - 1);

        if (this.board[row][column].getType().equals("EMPTY")) {
            setCellType(row, column, "BOMB");
        } else {
            plantBomb();
        }
    }


    public void generateNumbers() {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                int bombs = 0;
                if (this.board[i][j].getType().equals("EMPTY")) {
                    bombs = countBombs(i, j);
                    switch (bombs) {
                        case (1) -> setCellType(i, j, "ONE");
                        case (2) -> setCellType(i, j, "TWO");
                        case (3) -> setCellType(i, j, "THREE");
                        case (4) -> setCellType(i, j, "FOUR");
                        case (5) -> setCellType(i, j, "FIVE");
                        case (6) -> setCellType(i, j, "SIX");
                        case (7) -> setCellType(i, j, "SEVEN");
                        case (8) -> setCellType(i, j, "EIGHT");
                        default -> {
                        }
                    }
                }

            }
        }
    }

    public int countBombs(int row, int column) {
        int bombs = 0;
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                if (distance(row, column, i, j) < 2 && distance(row, column, i, j) > 0) {
                    if (this.board[i][j].getType().equals("BOMB")) bombs++;
                }
            }
        }
        return bombs;
    }

    public boolean boardHasType(String type) {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                if (this.board[i][j].getType().equals(type)) return true;
            }
        }
        return false;
    }

    public boolean boardHasHigherThan3() {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                if (this.board[i][j].getType().equals("FOUR")
                        || this.board[i][j].getType().equals("FIVE")
                        || this.board[i][j].getType().equals("SIX")
                        || this.board[i][j].getType().equals("SEVEN")
                        || this.board[i][j].getType().equals("EIGHT")) return true;
            }
        }
        return false;
    }

    public void generateBoard() {
        boolean loop = true;
        while (loop) {
            generateBombs();
            generateNumbers();
            loop = boardHasHigherThan3();
            if (loop) {
                clearGeneration();
            }
        }
    }

    public void placeFlag(int row, int column) {
        row--;
        column--;
        this.board[row][column].setFlag(!this.board[row][column].isFlag());
    }

    public boolean playCell(int row, int column) {
        row--;
        column--;
        this.board[row][column].setHidden(false);
        if (Objects.equals(this.board[row][column].getType(), "BOMB")) return true;
        if (Objects.equals(this.board[row][column].getType(), "EMPTY")) {
            revealAllEmptys();
        }
        return false;
    }

    public void revealAllEmptys() {
        int exit = 1;
        while (exit > 0){
            exit = 0;
            for (int i = 0; i < this.rows; i++) {
                for (int j = 0; j < this.columns; j++) {
                    if(!(this.board[i][j].getType().equals("BOMB")) && this.board[i][j].isHidden() && emptyNeighboursRevealed(i,j)) {
                        this.board[i][j].setHidden(false);
                        exit++;
                    }
                }
            }
        }
    }


    public boolean emptyNeighboursRevealed(int row, int column) {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                if (distance(row, column, i, j) == 1 && this.board[i][j].getType().equals("EMPTY") && !(this.board[i][j].isHidden())) {
                   return true;
                }
            }
        }
        return false;
    }

    private double distance(int x1, int y1, int x2, int y2) {
        return sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
    }

}
