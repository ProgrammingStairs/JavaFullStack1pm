class Demo6 {
   public static void main(String[] args) {
       // ANSI escape code constants for text colors and background colors
       String RESET = "\u001B[0m";
       String RED_TEXT = "\u001B[31m";
       String GREEN_TEXT = "\u001B[32m";
       String YELLOW_TEXT = "\u001B[33m";
       String BLACK_BG = "\u001B[40m";
       String WHITE_BG = "\u001B[47m";
       // Print colored text with the background to the console
       System.out.println(RED_TEXT + BLACK_BG + "This text is red with black background." + RESET);
       System.out.println(GREEN_TEXT + WHITE_BG + "This text is green with white background." + RESET);
       System.out.println(YELLOW_TEXT + BLACK_BG + "This text is yellow with black background." + RESET);
   }
}