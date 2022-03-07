public class Terminal {

    public static final int WINDOW_WIDTH = 299;
    public static final int TEXT_MAX_WIDTH = 90;

    public static void clear() {
        for (int i = 0; i < WINDOW_WIDTH;i++){
            for(int a = 0; a < TEXT_MAX_WIDTH; a++){
                System.out.print("\033[H\033[2J");
                System.out.flush();}
        }
    }

    /**
     * Terminal colors.
     */
    public static class Colors {
        public static final String ANSI_RESET = "\u001B[0m";
        public static final String ANSI_BLACK = "\u001B[30m";
        public static final String ANSI_RED = "\033[1;31m";
        public static final String ANSI_GREEN = "\u001B[32m";
        public static final String ANSI_YELLOW = "\u001B[33m";
        public static final String ANSI_BLUE = "\u001B[34m";
        public static final String ANSI_PURPLE = "\u001B[35m";
        public static final String ANSI_CYAN = "\u001B[36m";
        public static final String ANSI_WHITE = "\u001B[37m";
        public static final String ANSI_ORANGE = "\033[48;2;255;165;0m";

        public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
        public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
        public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
        public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
        public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
        public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
        public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
        public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    }



    public static void error(String error) {
        System.out.println(Colors.ANSI_RED + "\nError: " + Colors.ANSI_RESET + error);
    }

    public static void info(String info) {
        System.out.println(Colors.ANSI_BLUE + "\nInfo: " + Colors.ANSI_RESET + info);
    }
}