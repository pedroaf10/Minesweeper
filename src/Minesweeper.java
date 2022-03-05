import java.io.IOException;

public class Minesweeper {

    public static void main(String[] args) throws IOException {
        Board board = new Board(6,6);
        board.generateBoard();
        board.printBoard();
        board.showBoard();
        board.playCell(6,6);
        board.printBoard();
        board.showBoard();
    }
}

