import java.util.Objects;

import static java.lang.Math.sqrt;

public class Board {
    private final int rows;
    private final int columns;
    private final Cell[][] board;
    String ONE = "  1  ║";
    String TWO = "  2  ║";
    String THREE = "  3  ║";
    String FOUR = "  4  ║";
    String FIVE = "  5  ║";
    String SIX = "  6  ║";
    String SEVEN = "  7  ║";
    String EIGHT = "  8  ║";
    String FLAG = " ░█░ ║";
    String FLAGTNT = "█TNT█║";
    String FLAGEMPTY = "  █  ║";
    String EMPTY = "     ║";
    String HIDDEN = " ░░░ ║";
    String BOMB = " TNT ║";

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.board = new Cell[rows][columns];

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                Cell c = new Cell();
                this.board[i][j] = c;
            }
        }
    }

    public void getBoard() {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                System.out.println(this.board[i][j].toString());
            }
        }
    }

    public void setCellType(int row, int column, String type) {
        this.board[row][column].setType(type);
    }

    public String getCellType(int row, int column) {
        return this.board[row][column].getType();
    }

    public void printTop() {
        System.out.print("╔═════╦═════");
        for (int j = 1; j < this.columns; j++) {
            System.out.print("╦═════");
        }
        System.out.print("╗");
        System.out.println();
        System.out.print("║ R\\C ║");
        for (int j = 1; j < this.columns + 1; j++) {
            if (j < 10) {
                System.out.print("##" + j + "##");
                System.out.print("║");
            } else {
                System.out.print("##" + j + "#");
                System.out.print("║");
            }
        }
        System.out.println();
        System.out.print("╠═════╬═════");
        for (int j = 1; j < this.columns; j++) {
            System.out.print("╬═════");
        }
        System.out.print("╣");
        System.out.println();
    }


    public void printBot() {
        System.out.print("╚═════");
        for (int j = 1; j < this.columns; j++) {
            System.out.print("╩═════");
        }
        System.out.print("╩═════╝");
        System.out.println();
    }


    public void printBoard() {
        printTop();
        for (int i = 0; i < this.rows; i++) {

            if (i < 9) {
                System.out.print("║##" + (i + 1) + "##║");
            } else {
                System.out.print("║#" + (i + 1) + "##║");
            }

            for (int j = 0; j < this.columns; j++) {
                if (board[i][j].isHidden()) {
                    if (board[i][j].isFlag()) {
                        System.out.print(FLAG);
                    } else {
                        System.out.print(HIDDEN);
                    }
                } else {
                    printVisibleCell(i, j);
                }
            }
            System.out.println();
            if (i + 1 < this.rows) {
                System.out.print("╠═════");
                for (int j = 1; j < this.columns; j++) {
                    System.out.print("╬═════");
                }
                System.out.print("╬═════╣");
                System.out.println();
            } else {
                printBot();
            }
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void showBoard() {
        //clearConsole();
        printTop();
        for (int i = 0; i < this.rows; i++) {

            if (i < 9) {
                System.out.print("║##" + (i + 1) + "##║");
            } else {
                System.out.print("║#" + (i + 1) + "##║");
            }
            for (int j = 0; j < this.columns; j++) {

                if (board[i][j].isFlag() && Objects.equals(board[i][j].getType(), "BOMB")) System.out.print(FLAGTNT);
                else {
                    if (board[i][j].isFlag()) {
                        System.out.print(FLAGEMPTY);
                    } else {
                        printVisibleCell(i, j);
                    }
                }
            }
            System.out.println();
            if (i + 1 < this.rows) {
                System.out.print("╠═════");
                for (int j = 1; j < this.columns; j++) {
                    System.out.print("╬═════");
                }
                System.out.print("╬═════╣");
                System.out.println();
            } else {
                printBot();
            }
        }
    }

    private void printVisibleCell(int i, int j) {
        switch (board[i][j].getType()) {
            case ("ONE") -> System.out.print(ONE);
            case ("TWO") -> System.out.print(TWO);
            case ("THREE") -> System.out.print(THREE);
            case ("FOUR") -> System.out.print(FOUR);
            case ("FIVE") -> System.out.print(FIVE);
            case ("SIX") -> System.out.print(SIX);
            case ("SEVEN") -> System.out.print(SEVEN);
            case ("EIGHT") -> System.out.print(EIGHT);
            case ("BOMB") -> System.out.print(BOMB);
            case ("EMPTY") -> System.out.print(EMPTY);
            default -> throw new IllegalStateException("Unexpected value: " + board[i][j].getType());
        }
    }

    private void clearConsole() {
        System.out.println(System.lineSeparator().repeat(100));
    }

    public void generateBombs(double percentage) {
        int bombs = (int) (this.rows * this.columns * percentage);
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


    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
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
            generateBombs(0.12);
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
