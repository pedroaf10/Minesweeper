import java.io.IOException;
import java.util.Arrays;

public class Minesweeper {

    public static void main(String[] args) throws IOException, InterruptedException {
        int rows = 9;
        int columns = 9;
        double bombsPercentage = 0.12;
        int option;
        boolean exit = false;
        Board board = new Board(15,14);
        Menu.showStartMenu();

        do {
            option = Menu.showMainMenu();
            switch (option) {
                case (1):
                    board.printBoard();
                    break;

                case (2):
                    Menu.showOptions();
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
