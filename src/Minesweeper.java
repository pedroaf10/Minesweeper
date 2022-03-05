import java.io.IOException;

public class Minesweeper {

    public static void main(String[] args) throws IOException {
        Board board = new Board(6,6);
        board.generateBoard();
        board.printBoard();
        board.setFLAG(1,1);
        board.playCell(2,2);
        board.printBoard();
        board.setFLAG(3,3);
        board.printBoard();
        board.setFLAG(1,1);
        board.printBoard();
        board.showBoard();
    }
}

