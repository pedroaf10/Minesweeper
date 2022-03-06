import java.io.IOException;
import java.util.Arrays;

public class Minesweeper {

    public static void main(String[] args) throws IOException {
        Board board = new Board(15,14);
        Arrays.stream(Menu.top).forEach(System.out::println);
        Arrays.stream(Menu.minesweeper).forEach(System.out::println);
        Arrays.stream(Menu.bot).forEach(System.out::println);

        Arrays.stream(Menu.top).forEach(System.out::println);
        Arrays.stream(Menu.minesweeperMenu).forEach(System.out::println);
        Arrays.stream(Menu.bot).forEach(System.out::println);

        Arrays.stream(Menu.top).forEach(System.out::println);
        Arrays.stream(Menu.options).forEach(System.out::println);
        Arrays.stream(Menu.bot).forEach(System.out::println);

/*        board.generateBoard();
        board.printBoard();
        board.showBoard();
        board.playCell(6,6);
        board.printBoard();
        board.showBoard();*/
    }
}

