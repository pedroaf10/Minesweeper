import javax.swing.text.html.parser.Parser;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Menu {

    public static final String option = Terminal.Colors.ANSI_WHITE + "                                                                                             Choice : " + Terminal.Colors.ANSI_RESET;
    public static final String abort = Terminal.Colors.ANSI_RED + "                                                                                   You can type abort to go back at anytime!" + Terminal.Colors.ANSI_RESET;
    public static final String add = Terminal.Colors.ANSI_BLUE + "                                                                                   Insert (add) to add a product." + Terminal.Colors.ANSI_RESET;
    public static final String stop = Terminal.Colors.ANSI_BLUE + "                                                                                   Insert (exit) to stop adding." + Terminal.Colors.ANSI_RESET;
    public static final String end = Terminal.Colors.ANSI_BLUE + "                                                                                           Insert 0 to move on." + Terminal.Colors.ANSI_RESET;
    public static final String noorders = Terminal.Colors.ANSI_RED + "                                                                               There were no ordes made in this time." + Terminal.Colors.ANSI_RESET;
    public static final String noVolunteers = Terminal.Colors.ANSI_RED + "                                                                                   There are no available volunteers." + Terminal.Colors.ANSI_RESET;
    public static final String deliveries = Terminal.Colors.ANSI_GREEN + "                                                                                   You have been delivered" + Terminal.Colors.ANSI_RESET;
    public static final String kmsdone = Terminal.Colors.ANSI_GREEN + "                                                                                   You have made" + Terminal.Colors.ANSI_RESET;
    public static final String orderstuck = Terminal.Colors.ANSI_GREEN + "                                                                                   Number of orders stuck in store" + Terminal.Colors.ANSI_RESET;
    public static  final String price = Terminal.Colors.ANSI_GREEN + "                                                                                   Price : "+ Terminal.Colors.ANSI_RESET;
    public static final String newtransport = Terminal.Colors.ANSI_BLUE + "                                                                                   Which order do you want to get delivered?" + Terminal.Colors.ANSI_RESET;
    public static final String ratetransport = Terminal.Colors.ANSI_BLUE + "                                                                                   Which Carrier do you want to rate?" + Terminal.Colors.ANSI_RESET;
    public static final String orderstotransport= Terminal.Colors.ANSI_BLUE +"                                                                                   Insert order to deliver!" + Terminal.Colors.ANSI_RESET;
    public static final String invalidInput =  Terminal.Colors.ANSI_RED + "                                                ╔════════════════════════╗\n" +
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
            "                                        "+Terminal.Colors.ANSI_YELLOW,
            "                                                                     ╔═══█▓    ",
            "                                                               ╔═════╝     " +Terminal.Colors.ANSI_WHITE,
            "                                                    ▓▓██████░░██▓░▓▓           " ,
            "                                                 ▓█████████░▓░░░█████▓          " ,
            "                                               ▓█░████████████░▓░████▓▓         " ,
            "                                              ▓░░░█████████████     ███▓        " ,
            "                                             ▓░░░░█████████████      ██▓        " ,
            "                                             ▓░░░░████████████████  ████▓       " ,
            "                                             ▓█░░░░█████████████    ███▓        " ,
            "                                              ▓░░░░░░█████████████████▓▓        " ,
            "                                               ▓█░░░░░░██████████████▓          " ,
            "                                                 ▓▓░░░░░░░█████████▓            " ,
            "                                                     ▓▓▓██████▓▓                ",
            "                                        "+ Terminal.Colors.ANSI_YELLOW,
            "                                        ",
            "                                                  ╔═══════════════╗                       ",
            "                                                  ║  PRESS ENTER  ║             ",
            "                                                  ╚═══════════════╝                       "+ Terminal.Colors.ANSI_RESET
    };



    public static final String[] options = {
            Terminal.Colors.ANSI_YELLOW,
            "                               ██████╗  ██████╗  ████████╗ ██╗  ██████╗  ███╗   ██╗ ███████╗",
            "                              ██╔═══██╗ ██╔══██╗ ╚══██╔══╝ ██║ ██╔═══██╗ ████╗  ██║ ██╔════╝",
            "                              ██║   ██║ ██████╔╝    ██║    ██║ ██║   ██║ ██╔██╗ ██║ ███████╗",
            "                              ██║   ██║ ██╔═══╝     ██║    ██║ ██║   ██║ ██║╚██╗██║ ╚════██║",
            "                              ╚██████╔╝ ██║         ██║    ██║ ╚██████╔╝ ██║ ╚████║ ███████║",
            "                               ╚═════╝  ╚═╝         ╚═╝    ╚═╝  ╚═════╝  ╚═╝  ╚═══╝ ╚══════╝",
            "                                        "+ Terminal.Colors.ANSI_YELLOW,
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
            "                                        "+ Terminal.Colors.ANSI_YELLOW,
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

    public static final String[] signOptions = {
            "                                                                                 Please choose your type of account!",
            "                                                                                         1 -> User",
            "                                                                                         2 -> Volunteer",
            "                                                                                         3 -> Carrier",
            "                                                                                         4 -> Shop",
            "                                                                                         0 -> Exit",
    };

    public static final String[] LogMenuoptions = {
            "",
            "",
            "                                                                                         1 -> Log in",
            "                                                                                         2 -> Sign in",
            "                                                                                         3 -> Read logs",
            "                                                                                         0 -> Exit",
    };


    public static final String[] top = {
            Terminal.Colors.ANSI_CYAN,
            " ██████████████████████████████████████████████████████████████████████████████████████████████████████████████████",
            " ██╔════════════════════════════════════════════════════════════════════════════════════════════════════════════╗██",
            " ╚═╝                                                                                                            ╚═╝" + Terminal.Colors.ANSI_RESET,
    };


    public static final String[] bot = {
            Terminal.Colors.ANSI_CYAN,
            " ╔═╗                                                                                                            ╔═╗",
            " ██╚════════════════════════════════════════════════════════════════════════════════════════════════════════════╝██",
            " ██████████████████████████████████████████████████████████████████████████████████████████████████████████████████",
            Terminal.Colors.ANSI_RESET,
    };

    public static final String[] Explosion1 = {
            Terminal.Colors.ANSI_RED,
            "                                :.                        ..                              ",
            "                                -=.                      :=.                              ",
            "                                -++-          .        .=++.                              ",
            "                                :+===.       :-       :====                               ",
            "                                :+====:     .+=.    .====+-                               ",
            "                        .:      :+=--=+-.  .===:  .:+=--=+-                               ",
            "                        .==:.   .+=-:-===: -====..===-:-=+:      .:.                      ",
            "          .--::.         .===-: .+=-:::-=+=+=:-==+=-:::-=+.   .-==.           ...         ",
            "            :=+===-:..    :+====-+=-:..:-===-:-===-:..:-=+..-====.      .::-===:          ",
            "             .:========-::.-==--===-:. .::--:.:--:.. ::==+==--==...:--=======:            ",
            "               .-==-----====+=-:::--:.   .::. .::.   :-==--:-=+======---===:              ",
            "                 .-==-:::::-----:..::.    ..  ..    .::::.:-==---::::-===:.               ",
            "          ...      :===-:.....::::. ..              .....:::::...::-===:.                 ",
            "          .:-=====---=+==-:.    ...                     ...    .:-===-.                   ",
            "             .:-===--------::.                               .:-==+=:::::::::::.          ",
            "                .:-===-::......                            .::--------=====-:.            ",
            "           ...::--======--::..                            ......::--====-:.               ",
            "  ..:::--=======----::::......                               ...:::----======--::..       ",
            " .::--=======---::::....                                          ....:::::--=====+==--:. ",
            "        ..::--======----:::..                               .....::::----=======---::..   ",
            "               .:-===--::..                                ..:--=======--::...            ",
            "           .:-====---------:::.                             ...::-==-:.                   ",
            "        .:-----------=+==-::.                               .::::::--==-:.                ",
            "                   .-==--:.   ...                    .....    .:--========-:.             ",
            "                 .-==--::...::::. ..:.       .        .:--::.....:-===-...:::.            ",
            "               .:==--:::---=-::.::--:.   .  .::.    ....-====---::::-===:                 ",
            "             .:===--=====+==::--===::   .:. .--:.   .::::-==:-=====----=+=.               ",
            "           .:======--:..-==--==-===:: .::::.:==-::. .:---:-=:  ..:--======+-.             ",
            "          :==--:..    .-====-.  ==-:..:-=-::-====-:..:-===-=+.       ..:-==++-.           ",
            "         ..          .=+=:.    .+=-:::-===:-=- :==-:::-=+=====.            .::-.          ",
            "                    .::.       :+=-:-===+=-==.  .===-:-=+:.:=+-                           ",
            "                               :+=--==: -===.    .-+=--=+:   .-.                          ",
            "                               -+====.  .++:       .====+-                                ",
            "                               ====:     --         .-==+-                                ",
            "                               =+-.      ..           :=+-                                ",
            "                              .=:                      .-=                                ",
            "                              ..                         :                                "+ Terminal.Colors.ANSI_RESET
    };

    public static final String[] Explosion2 = {
            Terminal.Colors.ANSI_YELLOW,
            "                                :.                        ..                              ",
            "                                -=.                      :=.                              ",
            "                                -++-          .        .=++.                              ",
            "                                :+===.       :-       :====                               ",
            "                                :+====:     .+=.    .====+-                               ",
            "                        .:      :+=--=+-.  .===:  .:+=--=+-                               ",
            "                        .==:.   .+=-:-===: -====..===-:-=+:      .:.                      ",
            "          .--::.         .===-: .+=-:::-=+=+=:-==+=-:::-=+.   .-==.           ...         ",
            "            :=+===-:..    :+====-+=-:..:-===-:-===-:..:-=+..-====.      .::-===:          ",
            "             .:========-::.-==--===-:. .::--:.:--:.. ::==+==--==...:--=======:            ",
            "               .-==-----====+=-:::--:.   .::. .::.   :-==--:-=+======---===:              ",
            "                 .-==-:::::-----:..::.    ..  ..    .::::.:-==---::::-===:.               ",
            "          ...      :===-:.....::::. ..              .....:::::...::-===:.                 ",
            "          .:-=====---=+==-:.    ...                     ...    .:-===-.                   ",
            "             .:-===--------::.                               .:-==+=:::::::::::.          ",
            "                .:-===-::......                            .::--------=====-:.            ",
            "           ...::--======--::..                            ......::--====-:.               ",
            "  ..:::--=======----::::......                               ...:::----======--::..       ",
            " .::--=======---::::....                                          ....:::::--=====+==--:. ",
            "        ..::--======----:::..                               .....::::----=======---::..   ",
            "               .:-===--::..                                ..:--=======--::...            ",
            "           .:-====---------:::.                             ...::-==-:.                   ",
            "        .:-----------=+==-::.                               .::::::--==-:.                ",
            "                   .-==--:.   ...                    .....    .:--========-:.             ",
            "                 .-==--::...::::. ..:.       .        .:--::.....:-===-...:::.            ",
            "               .:==--:::---=-::.::--:.   .  .::.    ....-====---::::-===:                 ",
            "             .:===--=====+==::--===::   .:. .--:.   .::::-==:-=====----=+=.               ",
            "           .:======--:..-==--==-===:: .::::.:==-::. .:---:-=:  ..:--======+-.             ",
            "          :==--:..    .-====-.  ==-:..:-=-::-====-:..:-===-=+.       ..:-==++-.           ",
            "         ..          .=+=:.    .+=-:::-===:-=- :==-:::-=+=====.            .::-.          ",
            "                    .::.       :+=-:-===+=-==.  .===-:-=+:.:=+-                           ",
            "                               :+=--==: -===.    .-+=--=+:   .-.                          ",
            "                               -+====.  .++:       .====+-                                ",
            "                               ====:     --         .-==+-                                ",
            "                               =+-.      ..           :=+-                                ",
            "                              .=:                      .-=                                ",
            "                              ..                         :                                "+ Terminal.Colors.ANSI_RESET
    };

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

            if (!isInteger(test) || Integer.parseInt(test) > 3 ) {
                invalidInput();

            } else {
                valid = true;
                option = Integer.parseInt(test);
            }
        } while (!valid);

        return option;
    }

    public static void showOptions() throws InterruptedException {
        clearConsole();
        Arrays.stream(Menu.top).forEach(System.out::println);
        Arrays.stream(Menu.options).forEach(System.out::println);
        Arrays.stream(Menu.bot).forEach(System.out::println);

        do {
            showExplosion();
        } while (1 != 0);

    }

    public static void showExplosion() throws InterruptedException {
        clearConsole();
        Arrays.stream(Menu.top).forEach(System.out::println);
        Arrays.stream(Menu.Explosion2).forEach(System.out::println);
        Arrays.stream(Menu.bot).forEach(System.out::println);
        sleep(500);
        clearConsole();
        Arrays.stream(Menu.top).forEach(System.out::println);
        Arrays.stream(Menu.Explosion1).forEach(System.out::println);
        Arrays.stream(Menu.bot).forEach(System.out::println);
        sleep(500);
        clearConsole();
        Arrays.stream(Menu.top).forEach(System.out::println);
        Arrays.stream(Menu.Explosion2).forEach(System.out::println);
        Arrays.stream(Menu.bot).forEach(System.out::println);
        sleep(500);
        clearConsole();
        Arrays.stream(Menu.top).forEach(System.out::println);
        Arrays.stream(Menu.Explosion1).forEach(System.out::println);
        Arrays.stream(Menu.bot).forEach(System.out::println);
        sleep(500);

        do {

        } while (1 != 0);

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
}
