public class RocketShip {
    public static void main(String[] args) {
        arrow();
        shaft();
        arrow();
    }// end main

    public static void arrow() {
        System.out.println("   /\\ \n  /  \\ \n /    \\");
    }// end arrow method

    public static void shaft() {
        box();
        System.out.println("|United|\n|States|");
        box();
    }//end shaft method

    public static void box() {
      System.out.println("+------+\n|      |\n|      |\n+------+");
    }
}// end class
