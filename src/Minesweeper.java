import java.io.IOException;
import java.util.Arrays;

public class Minesweeper {

    public static void main(String[] args) throws IOException {
        int rows = 9;
        int columns = 9;
        double bombsPercentage = 0.12;
        Board board = new Board(15,14);
        Menu.showStartMenu();

/*        board.generateBoard();
        board.printBoard();
        board.showBoard();
        board.playCell(6,6);
        board.printBoard();
        board.showBoard();*/
    }
}

