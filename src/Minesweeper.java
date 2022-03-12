import java.io.IOException;
import java.util.Arrays;

public class Minesweeper {

    public static void main(String[] args) throws IOException, InterruptedException {
        int option;
        boolean exit = false;
        Menu menu = new Menu()
                ;
        Board board = new Board();
        Menu.showStartMenu();

        do {
            option = Menu.showMainMenu();
            switch (option) {
                case (1):
                    board.generateBoard();
                    menu.printBoard(board);
                    break;

                case (2):
                    board = Menu.showOptions(board);

                    break;

                case (3):
                    exit = true;
                    break;

                default:
                    System.out.println("Invalide input");
                    break;
            }
        } while (!exit);
    }
}
