import java.io.IOException;
import java.util.Arrays;

public class Minesweeper {

    public static void main(String[] args) throws IOException {
        Board board = new Board(15,14);
        Arrays.stream(Menu.minesweeper).forEach(System.out::println);

        System.out.println("  ..  ..  ..  ..  ..  ..  ..  ..  ..  ..  ..  ..  ..  ..  ..  ..  ..  ..  ..  ..\n" +
                "..  ..  ..  ..  ..  ..  ..  ..  ..  ..  ..  ..  ..  ..  ..  ..  ..,@..  ..  ..  \n" +
                "  ..  ..  ..  ..  ..  ..  ..  ..  ..  ..  ..  ..  ..  ..@@@@@@(%%%%@@@@.  ..  ..\n" +
                "..  ..  ..  ..  ..  ..  ..  ..  ..  ..  ..  ..  ..  @@@*******%%%%%@@.  ..  ..  \n" +
                "..  ..  ..  ..  ..  ..  ..  ..  ..  ..  .. @@@@@@@@@*%******(@@@@@@@@/  ..  ..  \n" +
                "  ..  ..  ..  ..  ..  ..  .. @@@@@@@@@@@@@@%####%@#*****@@@@  ..  .@  ..  ..  ..\n" +
                "..  ..  ..  ..  ..  .. @@@@############&@@&&###@@**%**@@@@, ..  ..  ..  ..  ..  \n" +
                "  ..  ..  ..  ..  ./@@@##############&&&@&&&&&&##@@@@@####@@  ..  ..  ..  ..  ..\n" +
                "  ..  ..  ..  .. @@@#&################&&&@&&&&&###&######@@@  ..  ..  ..  ..  ..\n" +
                "..  ..  ..  .. @@#&&&###################&&&@@####&&%####@@@ ..  ..  ..  ..  ..  \n" +
                "  ..  ..  .. @@%&&&&########################&&@@@@####@@###@@ ..  ..  ..  ..  ..\n" +
                "..  ..  ..  @@#&&&&&###########################(     #######@@  ..  ..  ..  ..  \n" +
                "..  ..  .. @@#&&&&&&##########################          #####@@ ..  ..  ..  ..  \n" +
                "  ..  ..  @@#&&&&&&%##########################           #####@@  ..  ..  ..  ..\n" +
                "..  ..  ..@@&&&&&&&&##########################.           ####@@..  ..  ..  ..  \n" +
                "  ..  .. (@#&&&&&&&&############################         ######@. ..  ..  ..  ..\n" +
                "  ..  .. /@#&&&&&&&&&##########################################@, ..  ..  ..  ..\n" +
                "..  ..  ..@&&&&&&&&&&%##########################      ########@@..  ..  ..  ..  \n" +
                "  ..  ..  @@#&&&&&&&&&&#########################       #######@@  ..  ..  ..  ..\n" +
                "..  ..  .. @@#&&&&&&&&&&###########################   #######@@ ..  ..  ..  ..  \n" +
                "..  ..  ..  @@#&&&&&&&&&&&##################################@@  ..  ..  ..  ..  \n" +
                "  ..  ..  .. @@#&&&&&&&&&&&&###############################@@ ..  ..  ..  ..  ..\n" +
                "..  ..  ..  .. @@#&&&&&&&&&&&&###########################@@ ..  ..  ..  ..  ..  \n" +
                "  ..  ..  ..  .. @@#%&&&&&&&&&&&&&####################%@@ ..  ..  ..  ..  ..  ..\n" +
                "  ..  ..  ..  ..  .@@@##&&&&&&&&&&&&&&&############%@@&.  ..  ..  ..  ..  ..  ..\n" +
                "..  ..  ..  ..  ..  .. @@@@##&&&&&&&&&&&&&&&%##@@@@ ..  ..  ..  ..  ..  ..  ..  \n" +
                "  ..  ..  ..  ..  ..  ..  ..,@@@@@@@@@@@@@@@@ ..  ..  ..  ..  ..  ..  ..  ..  ..\n" +
                "..  ..  ..  ..  ..  ..  ..  ..  ..  ..  ..  ..  ..  ..  ..  ..  ..  ..  ..  .. ");


/*        board.generateBoard();
        board.printBoard();
        board.showBoard();
        board.playCell(6,6);
        board.printBoard();
        board.showBoard();*/
    }
}

