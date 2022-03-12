import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Menu {

    String ONE =  Terminal.Colors.ANSI_BLUE + "  1  " +  Terminal.Colors.ANSI_YELLOW + "║" + Terminal.Colors.ANSI_RESET;
    String TWO = Terminal.Colors.ANSI_GREEN + "  2  " +  Terminal.Colors.ANSI_YELLOW + "║" + Terminal.Colors.ANSI_RESET;
    String THREE = Terminal.Colors.ANSI_PURPLE + "  3  " +  Terminal.Colors.ANSI_YELLOW + "║" + Terminal.Colors.ANSI_RESET;
    String FOUR = "  4  ║";
    String FIVE = "  5  ║";
    String SIX = "  6  ║";
    String SEVEN = "  7  ║";
    String EIGHT = "  8  ║";
    String FLAG =  Terminal.Colors.ANSI_WHITE + " ░█░ " + Terminal.Colors.ANSI_YELLOW + "║" +  Terminal.Colors.ANSI_RESET;
    String FLAGTNT =  Terminal.Colors.ANSI_WHITE + "█"+ Terminal.Colors.ANSI_RED+"TNT"+ Terminal.Colors.ANSI_WHITE + "█"+  Terminal.Colors.ANSI_YELLOW + "║" + Terminal.Colors.ANSI_RESET;
    String FLAGEMPTY = Terminal.Colors.ANSI_WHITE +"  █  " + Terminal.Colors.ANSI_YELLOW + "║" +  Terminal.Colors.ANSI_RESET;
    String EMPTY = "     " + Terminal.Colors.ANSI_YELLOW + "║" +  Terminal.Colors.ANSI_RESET;;
    String HIDDEN = Terminal.Colors.ANSI_YELLOW +" ░░░ " + Terminal.Colors.ANSI_YELLOW + "║" +  Terminal.Colors.ANSI_RESET;;
    String BOMB = Terminal.Colors.ANSI_RED + " TNT " + Terminal.Colors.ANSI_YELLOW + "║" +  Terminal.Colors.ANSI_RESET;;

    public Menu() {
    }

    public static final String invalidInput = Terminal.Colors.ANSI_RED + "                                                ╔════════════════════════╗\n" +
            "                                                ║     INVALID INPUT      ║ \n" +
            "                                                ╚════════════════════════╝" + Terminal.Colors.ANSI_RESET;
    public static final String[] minesweeper = {
            Terminal.Colors.ANSI_YELLOW,
            "       ███╗   ███╗ ██╗ ███╗  ██╗ ███████╗  ██████╗  ██╗       ██╗ ███████╗ ███████╗ ██████╗  ███████╗ ██████╗ ",
            "       ████╗ ████║ ██║ ████╗ ██║ ██╔════╝ ██╔════╝  ██║  ██╗  ██║ ██╔════╝ ██╔════╝ ██╔══██╗ ██╔════╝ ██╔══██╗",
            "       ██╔████╔██║ ██║ ██╔██╗██║ █████╗   ╚█████╗   ╚██╗████╗██╔╝ █████╗   █████╗   ██████╔╝ █████╗   ██████╔╝",
            "       ██║╚██╔╝██║ ██║ ██║╚████║ ██╔══╝    ╚═══██╗   ████╔═████║  ██╔══╝   ██╔══╝   ██╔═══╝  ██╔══╝   ██╔══██╗",
            "       ██║ ╚═╝ ██║ ██║ ██║ ╚███║ ███████╗ ██████╔╝   ╚██╔╝ ╚██╔╝  ███████╗ ███████╗ ██║      ███████╗ ██║  ██║",
            "       ╚═╝     ╚═╝ ╚═╝ ╚═╝  ╚══╝ ╚══════╝ ╚═════╝     ╚═╝   ╚═╝   ╚══════╝ ╚══════╝ ╚═╝      ╚══════╝ ╚═╝  ╚═╝",
            "                                        " + Terminal.Colors.ANSI_YELLOW,
            "                                                                     ╔═══█▓    ",
            "                                                               ╔═════╝     " + Terminal.Colors.ANSI_WHITE,
            "                                                    ▓▓██████░░██▓░▓▓           ",
            "                                                 ▓█████████░▓░░░█████▓          ",
            "                                               ▓█░████████████░▓░████▓▓         ",
            "                                              ▓░░░█████████████     ███▓        ",
            "                                             ▓░░░░█████████████      ██▓        ",
            "                                             ▓░░░░████████████████  ████▓       ",
            "                                             ▓█░░░░█████████████    ███▓        ",
            "                                              ▓░░░░░░█████████████████▓▓        ",
            "                                               ▓█░░░░░░██████████████▓          ",
            "                                                 ▓▓░░░░░░░█████████▓            ",
            "                                                     ▓▓▓██████▓▓                ",
            "                                        " + Terminal.Colors.ANSI_YELLOW,
            "                                        ",
            "                                                  ╔═══════════════╗                       ",
            "                                                  ║  PRESS ENTER  ║             ",
            "                                                  ╚═══════════════╝                       " + Terminal.Colors.ANSI_RESET
    };
    public static final String[] options = {
            Terminal.Colors.ANSI_YELLOW,
            "                               ██████╗  ██████╗  ████████╗ ██╗  ██████╗  ███╗   ██╗ ███████╗",
            "                              ██╔═══██╗ ██╔══██╗ ╚══██╔══╝ ██║ ██╔═══██╗ ████╗  ██║ ██╔════╝",
            "                              ██║   ██║ ██████╔╝    ██║    ██║ ██║   ██║ ██╔██╗ ██║ ███████╗",
            "                              ██║   ██║ ██╔═══╝     ██║    ██║ ██║   ██║ ██║╚██╗██║ ╚════██║",
            "                              ╚██████╔╝ ██║         ██║    ██║ ╚██████╔╝ ██║ ╚████║ ███████║",
            "                               ╚═════╝  ╚═╝         ╚═╝    ╚═╝  ╚═════╝  ╚═╝  ╚═══╝ ╚══════╝",
            "                                        " + Terminal.Colors.ANSI_YELLOW,
            "                                          ",
            "                                               ╔════════════════════════╗                       ",
            "                                               ║ (1) CHANGE BOARD SIZE  ║             ",
            "                                               ╚════════════════════════╝                       ",
            "                                               ╔════════════════════════╗                       ",
            "                                               ║ (2) CHANGE BOMB NUMBER ║             ",
            "                                               ╚════════════════════════╝                       ",
            "                                               ╔════════════════════════╗                       ",
            "                                               ║ (3)      BACK          ║             ",
            "                                               ╚════════════════════════╝                       ",
    };
    public static final String[] minesweeperMenu = {
            Terminal.Colors.ANSI_YELLOW,
            "       ███╗   ███╗ ██╗ ███╗  ██╗ ███████╗  ██████╗  ██╗       ██╗ ███████╗ ███████╗ ██████╗  ███████╗ ██████╗ ",
            "       ████╗ ████║ ██║ ████╗ ██║ ██╔════╝ ██╔════╝  ██║  ██╗  ██║ ██╔════╝ ██╔════╝ ██╔══██╗ ██╔════╝ ██╔══██╗",
            "       ██╔████╔██║ ██║ ██╔██╗██║ █████╗   ╚█████╗   ╚██╗████╗██╔╝ █████╗   █████╗   ██████╔╝ █████╗   ██████╔╝",
            "       ██║╚██╔╝██║ ██║ ██║╚████║ ██╔══╝    ╚═══██╗   ████╔═████║  ██╔══╝   ██╔══╝   ██╔═══╝  ██╔══╝   ██╔══██╗",
            "       ██║ ╚═╝ ██║ ██║ ██║ ╚███║ ███████╗ ██████╔╝   ╚██╔╝ ╚██╔╝  ███████╗ ███████╗ ██║      ███████╗ ██║  ██║",
            "       ╚═╝     ╚═╝ ╚═╝ ╚═╝  ╚══╝ ╚══════╝ ╚═════╝     ╚═╝   ╚═╝   ╚══════╝ ╚══════╝ ╚═╝      ╚══════╝ ╚═╝  ╚═╝",
            "                                        " + Terminal.Colors.ANSI_YELLOW,
            "                                          ",
            "                                               ╔════════════════════════╗                       ",
            "                                               ║ (1)    START GAME      ║             ",
            "                                               ╚════════════════════════╝                       ",
            "                                               ╔════════════════════════╗                       ",
            "                                               ║ (2)     OPTIONS        ║             ",
            "                                               ╚════════════════════════╝                       ",
            "                                               ╔════════════════════════╗                       ",
            "                                               ║ (3)      QUIT          ║             ",
            "                                               ╚════════════════════════╝                       ",
    };

    public static final String[] top = {
            Terminal.Colors.ANSI_CYAN,
            " ██████████████████████████████████████████████████████████████████████████████████████████████████████████████████",
            " ██╔════════════════════════════════════════════════════════════════════════════════════════════════════════════╗██",
            " ╚═╝                                                                                                            ╚═╝" + Terminal.Colors.ANSI_RESET,
    };

    public String[] topBorder(int n) {
        String line1 = "██████";
        String line2 = "██╔═══";
        String line3 = "╚═╝   ";

        for (int i = 0; i < n ; i ++) {
            line1 += "██████";
            line2 += "══════";
            line3 += "      ";
        }

        line1 += "███████████████";
        line2 += "════════════╗██";
        line3 += "            ╚═╝";

        String [] res = {
                Terminal.Colors.ANSI_CYAN,
                line1,
                line2,
                line3 + Terminal.Colors.ANSI_RESET
        };

        return res;
    }

    public static final String[] bot = {
            Terminal.Colors.ANSI_CYAN,
            " ╔═╗                                                                                                            ╔═╗",
            " ██╚════════════════════════════════════════════════════════════════════════════════════════════════════════════╝██",
            " ██████████████████████████████████████████████████████████████████████████████████████████████████████████████████",
            Terminal.Colors.ANSI_RESET,
    };

    public String[] botBorder(int n) {
        String line1 = "╔═╗   ";
        String line2 = "██╚═══";
        String line3 = "██████";

        for (int i = 0; i < n ; i ++) {
            line3 += "██████";
            line2 += "══════";
            line1 += "      ";
        }

        line3 += "███████████████";
        line2 += "════════════╝██";
        line1 += "            ╔═╗";

        String [] res = {
                Terminal.Colors.ANSI_CYAN,
                line1,
                line2,
                line3 + Terminal.Colors.ANSI_RESET
        };

        return res;
    }


    public static void clearConsole() {
        System.out.println(System.lineSeparator().repeat(100));
    }


    public static void showStartMenu() {
        Arrays.stream(Menu.top).forEach(System.out::println);
        Arrays.stream(Menu.minesweeper).forEach(System.out::println);
        Arrays.stream(Menu.bot).forEach(System.out::println);
        Scanner in = new Scanner(System.in);
        in.nextLine();
        clearConsole();
    }


    public static int showMainMenu() throws InterruptedException {
        boolean valid = false;
        Scanner in = new Scanner(System.in);
        Integer option = 0;
        clearConsole();

        do {
            Arrays.stream(Menu.top).forEach(System.out::println);
            Arrays.stream(Menu.minesweeperMenu).forEach(System.out::println);
            Arrays.stream(Menu.bot).forEach(System.out::println);
            String test = in.nextLine();

            if (!isInteger(test) || Integer.parseInt(test) > 3) {
                invalidInput();

            } else {
                valid = true;
                option = Integer.parseInt(test);
            }
        } while (!valid);

        return option;
    }

    public static Board showOptions(Board board) throws InterruptedException {
        boolean valid = false;
        Integer rows = board.getRows();
        Integer columns = board.getColumns();
        Double bombsPercentage = board.getBombsPercentage();
        Scanner in = new Scanner(System.in);
        Integer option = 0;
        clearConsole();

        do {
            Arrays.stream(Menu.top).forEach(System.out::println);
            Arrays.stream(Menu.options).forEach(System.out::println);
            Arrays.stream(Menu.bot).forEach(System.out::println);
            String test = in.nextLine();


            if (!isInteger(test) || Integer.parseInt(test) > 3) {
                invalidInput();

            } else {
                option = Integer.parseInt(test);

                switch (option) {
                    case (1):
                        valid = false;

                        do {
                            System.out.println("Insert the number of rows, maximum up to 20(default = 9)!"+ Terminal.Colors.ANSI_RESET);
                            test = in.nextLine();
                            if (!isInteger(test) || Integer.parseInt(test) > 20) {
                                invalidInput();

                                Arrays.stream(Menu.top).forEach(System.out::println);
                                Arrays.stream(Menu.options).forEach(System.out::println);
                                Arrays.stream(Menu.bot).forEach(System.out::println);

                            } else {
                                valid = true;
                                rows = Integer.parseInt(test);
                            }
                        } while (!valid);

                        valid = false;

                        do {
                            System.out.println("Insert the number of columns, maximum up to 20 (default = 9)!"+ Terminal.Colors.ANSI_RESET);
                            test = in.nextLine();
                            if (!isInteger(test) || Integer.parseInt(test) > 20) {
                                invalidInput();

                                Arrays.stream(Menu.top).forEach(System.out::println);
                                Arrays.stream(Menu.options).forEach(System.out::println);
                                Arrays.stream(Menu.bot).forEach(System.out::println);

                            } else {
                                columns = Integer.parseInt(test);
                                valid = true;
                            }
                        } while (!valid);


                        System.out.println("New board size rows(" + rows + ") columns(" + columns + ") !"+ Terminal.Colors.ANSI_RESET);
                        sleep(1000);
                        valid = false;
                        break;

                    case(2):
                        do {
                            System.out.println("Insert the percentage of bombs (between 5 and 40, default = 12) !"+ Terminal.Colors.ANSI_RESET);
                            test = in.nextLine();
                            if (!isInteger(test) || Integer.parseInt(test) > 40 | Integer.parseInt(test) < 5) {
                                invalidInput();
                                Arrays.stream(Menu.top).forEach(System.out::println);
                                Arrays.stream(Menu.options).forEach(System.out::println);
                                Arrays.stream(Menu.bot).forEach(System.out::println);

                            } else {
                                bombsPercentage = (double) Integer.parseInt(test)/100;
                                System.out.println(bombsPercentage);
                                valid = true;
                            }
                        } while (!valid);
                        break;

                    case (3):
                        valid = true;
                        break;

                    default:
                        break;
                }
            }

        } while (!valid);

        return new Board(rows, columns, bombsPercentage);
    }

    public static void invalidInput() throws InterruptedException {
        System.out.println(invalidInput);
        sleep(1000);
        clearConsole();
    }

    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public void showBoard(Board board) {

        Arrays.stream(topBorder(board.getColumns())).forEach(System.out::println);

        printTop(board);
        for (int i = 0; i < board.getRows(); i++) {

            if (i < 9) {
                System.out.print(Terminal.Colors.ANSI_ORANGE + "       ║  " + (i + 1) + "  ║"+ Terminal.Colors.ANSI_RESET);
            } else {
                System.out.print(Terminal.Colors.ANSI_ORANGE + "       ║ " + (i + 1) + "  ║"+ Terminal.Colors.ANSI_RESET);
            }
            for (int j = 0; j < board.getColumns(); j++) {

                if (board.isCellFlag(i, j) && Objects.equals(board.getCellType(i, j), "BOMB"))
                    System.out.print(FLAGTNT);
                else {
                    if (board.isCellFlag(i, j)) {
                        System.out.print(FLAGEMPTY);
                    } else {
                        printVisibleCell(i, j, board);
                    }
                }
            }
            System.out.println();
            if (i + 1 < board.getRows()) {
                System.out.print(Terminal.Colors.ANSI_YELLOW +"       ╠═════"+ Terminal.Colors.ANSI_RESET);
                for (int j = 1; j < board.getColumns(); j++) {
                    System.out.print(Terminal.Colors.ANSI_YELLOW +"╬═════"+ Terminal.Colors.ANSI_RESET);
                }
                System.out.print(Terminal.Colors.ANSI_YELLOW +"╬═════╣"+ Terminal.Colors.ANSI_RESET);
                System.out.println(Terminal.Colors.ANSI_RESET);
            } else {
                printBot(board);
            }
        }

        Arrays.stream(botBorder(board.getColumns())).forEach(System.out::println);

    }

    private void printVisibleCell(int i, int j, Board board) {
        switch (board.getCellType(i, j)) {
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
            default -> throw new IllegalStateException("Unexpected value: " + board.getCellType(i, j));
        }
    }

    public void printBoard(Board board) {

        Arrays.stream(topBorder(board.getColumns())).forEach(System.out::println);

        printTop(board);
        for (int i = 0; i < board.getRows(); i++) {

            if (i < 9) {
                System.out.print(Terminal.Colors.ANSI_YELLOW + "       ║"+ Terminal.Colors.ANSI_BLACK + Terminal.Colors.ANSI_YELLOW_BACKGROUND + "  " + (i + 1) + "  "+ Terminal.Colors.ANSI_RESET + Terminal.Colors.ANSI_YELLOW +"║"+ Terminal.Colors.ANSI_RESET);
            } else {
                System.out.print(Terminal.Colors.ANSI_YELLOW + "       ║"+ Terminal.Colors.ANSI_BLACK + Terminal.Colors.ANSI_YELLOW_BACKGROUND + " " + (i + 1) + "  "+ Terminal.Colors.ANSI_RESET + Terminal.Colors.ANSI_YELLOW +"║"+ Terminal.Colors.ANSI_RESET);
            }

            for (int j = 0; j < board.getColumns(); j++) {
                if (board.isCellHidden(i, j)) {
                    if (board.isCellFlag(i, j)) {
                        System.out.print(FLAG);
                    } else {
                        System.out.print(HIDDEN);
                    }
                } else {
                    printVisibleCell(i, j, board);
                }
            }
            System.out.println();
            if (i + 1 < board.getRows()) {
                System.out.print(Terminal.Colors.ANSI_YELLOW +"       ╠═════"+ Terminal.Colors.ANSI_RESET);
                for (int j = 1; j < board.getColumns(); j++) {
                    System.out.print(Terminal.Colors.ANSI_YELLOW +"╬═════"+ Terminal.Colors.ANSI_RESET);
                }
                System.out.print(Terminal.Colors.ANSI_YELLOW +"╬═════╣"+ Terminal.Colors.ANSI_RESET);
                System.out.println(Terminal.Colors.ANSI_RESET);
            } else {
                printBot(board);
            }
        }
        System.out.print("\033[H\033[2J");

        System.out.flush();

        Arrays.stream(botBorder(board.getColumns())).forEach(System.out::println);
    }

    public void printTop(Board board) {
        System.out.print(Terminal.Colors.ANSI_YELLOW + "       ╔═════╦═════"+ Terminal.Colors.ANSI_RESET);
        for (int j = 1; j < board.getColumns(); j++) {
            System.out.print(Terminal.Colors.ANSI_YELLOW +"╦═════"+ Terminal.Colors.ANSI_RESET);
        }
        System.out.print(Terminal.Colors.ANSI_YELLOW +"╗"+ Terminal.Colors.ANSI_RESET);
        System.out.println();
        System.out.print(Terminal.Colors.ANSI_YELLOW +"       ║"+ Terminal.Colors.ANSI_BLACK + Terminal.Colors.ANSI_YELLOW_BACKGROUND + " R\\C " + Terminal.Colors.ANSI_RESET + Terminal.Colors.ANSI_YELLOW +"║"+ Terminal.Colors.ANSI_RESET);
        for (int j = 1; j < board.getColumns() + 1; j++) {
            if (j < 10) {
                System.out.print(Terminal.Colors.ANSI_BLACK + Terminal.Colors.ANSI_YELLOW_BACKGROUND +"  " + j + "  "+ Terminal.Colors.ANSI_RESET);
                System.out.print(Terminal.Colors.ANSI_YELLOW +"║"+ Terminal.Colors.ANSI_RESET);
            } else {
                System.out.print(Terminal.Colors.ANSI_BLACK + Terminal.Colors.ANSI_YELLOW_BACKGROUND +"  " + j + " "+ Terminal.Colors.ANSI_RESET);
                System.out.print(Terminal.Colors.ANSI_YELLOW +"║"+ Terminal.Colors.ANSI_RESET);
            }
        }
        System.out.println();
        System.out.print(Terminal.Colors.ANSI_YELLOW +"       ╠═════╬═════"+ Terminal.Colors.ANSI_RESET);
        for (int j = 1; j < board.getColumns(); j++) {
            System.out.print(Terminal.Colors.ANSI_YELLOW +"╬═════"+ Terminal.Colors.ANSI_RESET);
        }
        System.out.print(Terminal.Colors.ANSI_YELLOW +"╣"+ Terminal.Colors.ANSI_RESET);
        System.out.println(Terminal.Colors.ANSI_RESET);
    }


    public void printBot(Board board) {
        System.out.print(Terminal.Colors.ANSI_YELLOW + "       ╚═════"+ Terminal.Colors.ANSI_RESET);
        for (int j = 1; j < board.getColumns(); j++) {
            System.out.print(Terminal.Colors.ANSI_YELLOW + "╩═════"+ Terminal.Colors.ANSI_RESET);
        }
        System.out.print(Terminal.Colors.ANSI_YELLOW + "╩═════╝"+ Terminal.Colors.ANSI_RESET);
    }
}
