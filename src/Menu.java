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

    public static final String[] welcome = {
            Terminal.Colors.ANSI_RED,
            "                                                                   ██╗       ██╗███████╗██╗      █████╗  █████╗ ███╗   ███╗███████╗",
            "                                                                   ██║  ██╗  ██║██╔════╝██║     ██╔══██╗██╔══██╗████╗ ████║██╔════╝",
            "                                                                   ╚██╗████╗██╔╝█████╗  ██║     ██║  ╚═╝██║  ██║██╔████╔██║█████╗  ",
            "                                                                    ████╔═████║ ██╔══╝  ██║     ██║  ██╗██║  ██║██║╚██╔╝██║██╔══╝  ",
            "                                                                    ╚██╔╝ ╚██╔╝ ███████╗███████╗╚█████╔╝╚█████╔╝██║ ╚═╝ ██║███████╗",
            "                                                                     ╚═╝   ╚═╝  ╚══════╝╚══════╝ ╚════╝  ╚════╝ ╚═╝     ╚═╝╚══════╝" + Terminal.Colors.ANSI_RESET,
    };

    public static final String[] minesweeper = {
            Terminal.Colors.ANSI_RED,
            "       ███╗░░░███╗ ██╗ ███╗░░██╗ ███████╗ ░██████╗ ░██╗░░░░░░░██╗ ███████╗ ███████╗ ██████╗ ░███████╗ ██████╗░",
            "       ████╗░████║ ██║ ████╗░██║ ██╔════╝ ██╔════╝ ░██║░░██╗░░██║ ██╔════╝ ██╔════╝ ██╔══██╗ ██╔════╝ ██╔══██╗",
            "       ██╔████╔██║ ██║ ██╔██╗██║ █████╗ ░░╚█████╗ ░░╚██╗████╗██╔╝ █████╗ ░░█████╗ ░░██████╔╝ █████╗ ░░██████╔╝"+Terminal.Colors.ANSI_YELLOW,
            "       ██║╚██╔╝██║ ██║ ██║╚████║ ██╔══╝ ░░░╚═══██╗ ░░████╔═████║ ░██╔══╝ ░░██╔══╝ ░░██╔═══╝ ░██╔══╝ ░░██╔══██╗",
            "       ██║░╚═╝░██║ ██║ ██║░╚███║ ███████╗ ██████╔╝ ░░╚██╔╝░╚██╔╝ ░███████╗ ███████╗ ██║ ░░░░░███████╗ ██║░░██║",
            "       ╚═╝░░░░░╚═╝ ╚═╝ ╚═╝░░╚══╝ ╚══════╝ ╚═════╝ ░░░░╚═╝░░░╚═╝ ░░╚══════╝ ╚══════╝ ╚═╝ ░░░░░╚══════╝ ╚═╝░░╚═╝"
            "                                        ",
            "                            @@@&%%@@    ",
            "                      @@@@(*/**@@%@     " ,
            "            @@######&%##@**@@           " ,
            "         @#########%@%%%#####@          " ,
            "       @#%############%@&####@@         " ,
            "      @%%%#############     ###@        " ,
            "     @%%%%#############      ##@        " ,
            "     @%%%%################  ####(       " ,
            "     @#%%%%#############    ###@        " ,
            "      @%%%%%%#################@@        " ,
            "       @#%%%%%%##############@          " ,
            "         @@%%%%%%%#########@            " ,
            "             @@@######@@                "+ Terminal.Colors.ANSI_RESET,
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
            Terminal.Colors.ANSI_PURPLE,
            "                                          ██████████████████████████████████████████████████████████████████████████████████████████████████████████████████",
            "                                          ██╔════════════════════════════════════════════════════════════════════════════════════════════════════════════╗██",
            "                                          ╚═╝                                                                                                            ╚═╝" + Terminal.Colors.ANSI_RESET,
    };


    public static final String[] menu = {
            Terminal.Colors.ANSI_CYAN,
            "                                                                                  ███╗   ███╗███████╗███╗   ██╗██╗   ██╗    ",
            "                                                                                  ████╗ ████║██╔════╝████╗  ██║██║   ██║    ",
            "                                                                                  ██╔████╔██║█████╗  ██╔██╗ ██║██║   ██║    ",
            "                                                                                  ██║╚██╔╝██║██╔══╝  ██║╚██╗██║██║   ██║    ",
            "                                                                                  ██║ ╚═╝ ██║███████╗██║ ╚████║╚██████╔╝    ",
            "                                                                                  ╚═╝     ╚═╝╚══════╝╚═╝  ╚═══╝ ╚═════╝     ",
            Terminal.Colors.ANSI_RESET,
    };
    public static final String[] firstMenuoptions = {
            "                                                                                 Please choose your type of account!",
            "                                                                                         1 -> User",
            "                                                                                         2 -> Volunteer",
            "                                                                                         3 -> Carrier",
            "                                                                                         4 -> Shop",
            "                                                                                         5 -> ADMIN",
            "                                                                                         0 -> Sair",
    };

    public static final String[] bot = {
            Terminal.Colors.ANSI_PURPLE,
            "                                          ╔═╗                                                                                                            ╔═╗",
            "                                          ██╚════════════════════════════════════════════════════════════════════════════════════════════════════════════╝██",
            "                                          ██████████████████████████████████████████████████████████████████████████████████████████████████████████████████",
            Terminal.Colors.ANSI_RESET,
    };

    public static final String[] admin = {
            Terminal.Colors.ANSI_CYAN,
            "                                                                                 █████╗ ██████╗ ███╗   ███╗██╗███╗  ██╗",
            "                                                                                ██╔══██╗██╔══██╗████╗ ████║██║████╗ ██║",
            "                                                                                ███████║██║  ██║██╔████╔██║██║██╔██╗██║",
            "                                                                                ██╔══██║██║  ██║██║╚██╔╝██║██║██║╚████║",
            "                                                                                ██║  ██║██████╔╝██║ ╚═╝ ██║██║██║ ╚███║" + Terminal.Colors.ANSI_RESET,
    };

    public static final String[] trazAqui = {
            Terminal.Colors.ANSI_CYAN,
            "                                                                 ████████╗██████╗  █████╗ ███████╗     █████╗  ██████╗ ██╗   ██╗██╗",
            "                                                                 ╚══██╔══╝██╔══██╗██╔══██╗╚══███╔╝    ██╔══██╗██╔═══██╗██║   ██║██║",
            "                                                                    ██║   ██████╔╝███████║  ███╔╝     ███████║██║   ██║██║   ██║██║",
            "                                                                    ██║   ██╔══██╗██╔══██║ ███╔╝      ██╔══██║██║▄▄ ██║██║   ██║██║",
            "                                                                    ██║   ██║  ██║██║  ██║███████╗    ██║  ██║╚██████╔╝╚██████╔╝██║",
            "                                                                    ╚═╝   ╚═╝  ╚═╝╚═╝  ╚═╝╚══════╝    ╚═╝  ╚═╝ ╚══▀▀═╝  ╚═════╝ ╚═╝" + Terminal.Colors.ANSI_RESET,
    };

    public static String[] car = {
            Terminal.Colors.ANSI_YELLOW,
            "                                                                                             _______",
            "                                                                                            //  ||\\ \\",
            "                                                                                      _____//___||_\\ \\___",
            "                                                                                      )  _          _    \\",
            "                                                                                      |_/ \\________/ \\___|",
            "                                                                                        \\_/        \\_/" + Terminal.Colors.ANSI_RESET,
    };

    public static final String[] adminOptions = {
            "",
            "                                                                                   1  -> Register a new User",
            "                                                                                   2  -> Register a new Volunteer",
            "                                                                                   3  -> Register a new Carrier Company",
            "                                                                                   4  -> Register a new Shop",
            "                                                                                   5  -> Validate User",
            "                                                                                   6  -> Insert Order request to a Shop by a User",
            "                                                                                   7  -> Rate a transport",
            "                                                                                   8  -> Top 10 users by number of orders",
            "                                                                                   9  -> Top 10 carriers by number of kilometers",
            "                                                                                   10 -> Chose a transport method",
            "                                                                                   11 -> Orders between 2 dates",
            "                                                                                   12 -> Change user credentials",
            "                                                                                   13 -> Change transporter credentials",
            "                                                                                   14 -> Change store credentials",
            "                                                                                   save -> Save appState",
            "                                                                                   read -> Read appState",
            "                                                                                   remove -> Remove appState file save",
            "                                                                                   print -> Print appState",
            "                                                                                   0  -> Exit",
    };


    public static final String[] user = {
            Terminal.Colors.ANSI_CYAN,
            "                                                                                    ██╗   ██╗ ██████╗███████╗██████╗ ",
            "                                                                                    ██║   ██║██╔════╝██╔════╝██╔══██╗",
            "                                                                                    ██║   ██║╚█████╗ █████╗  ██████╔╝",
            "                                                                                    ██║   ██║ ╚═══██╗██╔══╝  ██╔══██╗",
            "                                                                                    ╚██████╔╝██████╔╝███████╗██║  ██║" + Terminal.Colors.ANSI_RESET,
    };

    public static final String[] userOptions = {
            "",
            "                                                                                   1 -> Insert new Order",
            "                                                                                   2 -> Orders between 2 dates",
            "                                                                                   3 -> Show all orders",
            "                                                                                   4 -> Chose a transport method",
            "                                                                                   5 -> Update Credentials",
            "                                                                                   6 -> Rate your carriers",
            "                                                                                   0 -> Exit",
    };

    public static final String[] volunteer = {
            Terminal.Colors.ANSI_CYAN,
            "                                                             ██╗   ██╗ ██████╗ ██╗     ██╗   ██╗███╗   ██╗████████╗███████╗███████╗██████╗",
            "                                                             ██║   ██║██╔═══██╗██║     ██║   ██║████╗  ██║╚══██╔══╝██╔════╝██╔════╝██╔══██╗",
            "                                                             ██║   ██║██║   ██║██║     ██║   ██║██╔██╗ ██║   ██║   █████╗  █████╗  ██████╔╝",
            "                                                             ╚██╗ ██╔╝██║   ██║██║     ██║   ██║██║╚██╗██║   ██║   ██╔══╝  ██╔══╝  ██╔══██╗",
            "                                                              ╚████╔╝ ╚██████╔╝███████╗╚██████╔╝██║ ╚████║   ██║   ███████╗███████╗██║  ██║",
            "                                                               ╚═══╝   ╚═════╝ ╚══════╝ ╚═════╝ ╚═╝  ╚═══╝   ╚═╝   ╚══════╝╚══════╝╚═╝  ╚═╝" + Terminal.Colors.ANSI_RESET,
    };

    public static final String[] volunteerOptions = {
            "",
            "                                                                                   1 -> Change availability",
            "                                                                                   2 -> Agree or not to take medical orders",
            "                                                                                   3 -> Total orders delivered",
            "                                                                                   4 -> Change radius",
            "                                                                                   5 -> Change vehicle",
            "                                                                                   6 -> Change Credentials",
            "                                                                                   7 -> Check average rating",
            "                                                                                   0 -> Exit",
    };


    public static final String[] carrier = {
            Terminal.Colors.ANSI_CYAN,
            "                                                                              ██████╗ █████╗ ██████╗ ██████╗ ██╗███████╗██████╗ ",
            "                                                                             ██╔════╝██╔══██╗██╔══██╗██╔══██╗██║██╔════╝██╔══██╗",
            "                                                                             ██║     ███████║██████╔╝██████╔╝██║█████╗  ██████╔╝",
            "                                                                             ██║     ██╔══██║██╔══██╗██╔══██╗██║██╔══╝  ██╔══██╗",
            "                                                                             ╚██████╗██║  ██║██║  ██║██║  ██║██║███████╗██║  ██║",
            "                                                                              ╚═════╝╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═╝╚═╝╚══════╝╚═╝  ╚═╝" + Terminal.Colors.ANSI_RESET,
    };

    public static final String[] carrierOptions = {
            "",
            "                                                                             1 -> Change availability",
            "                                                                             2 -> Agree or not to take medical orders",
            "                                                                             3 -> Total kms made",
            "                                                                             4 -> Change radius",
            "                                                                             5 -> Change transport method (Express or Normal)",
            "                                                                             6 -> Change Credentials",
            "                                                                             7 -> Check average rating",
            "                                                                             0 -> Exit",
    };


    public static final String[] shop = {
            Terminal.Colors.ANSI_CYAN,
            "                                                                                   ███████╗██╗  ██╗ ██████╗ ██████╗ ",
            "                                                                                   ██╔════╝██║  ██║██╔═══██╗██╔══██╗",
            "                                                                                   ███████╗███████║██║   ██║██████╔╝",
            "                                                                                   ╚════██║██╔══██║██║   ██║██╔═══╝ ",
            "                                                                                   ███████║██║  ██║╚██████╔╝██║     ",
            "                                                                                   ╚══════╝╚═╝  ╚═╝ ╚═════╝ ╚═╝     " + Terminal.Colors.ANSI_RESET,
    };

    public static final String[] shopOptions = {
            "",
            "                                                                                   1 -> Number of orders Stuck in shop",
            "                                                                                   2 -> Orders between two dates",
            "                                                                                   3 -> Change Shop credentials",
            "                                                                                   0 -> Exit",
    };

    public static final String[] deliveryoptions = {
            "",
            "                                                                                   Please choose an option",
            "",
            "                                                                                   1 -> Fastest Delivery",
            "                                                                                   2 -> Cheapest Delivery",
            "                                                                                   0 -> Exit",
    };

    public static final String[] setstatus = {
            "",
            "                                                                                   1 -> Set status to available",
            "                                                                                   2 -> Set status to unavailable",
            "                                                                                   0 -> Exit",
    };

    public static final String[] orderbaner = {
            Terminal.Colors.ANSI_CYAN,
            "                                                                                  ██████╗ ██████╗ ██████╗ ███████╗██████╗ ",
            "                                                                                 ██╔═══██╗██╔══██╗██╔══██╗██╔════╝██╔══██╗",
            "                                                                                 ██║   ██║██████╔╝██║  ██║█████╗  ██████╔╝",
            "                                                                                 ██║   ██║██╔══██╗██║  ██║██╔══╝  ██╔══██╗",
            "                                                                                 ╚██████╔╝██║  ██║██████╔╝███████╗██║  ██║" + Terminal.Colors.ANSI_RESET,
    };
}
