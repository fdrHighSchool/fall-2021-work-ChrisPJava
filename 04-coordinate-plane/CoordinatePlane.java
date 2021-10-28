import java.util.*;

public class CoordinatePlane {
    public static void main(String[] args) {
    //scanner instance
    Scanner s = new Scanner(System.in);

    System.out.println("Hey there, I'm your coordinate plane and ready to get some points!");
    System.out.println("What is your x1 and y1? Format: (x1,y1)");
    String p1 = s.nextLine();// first two points, x1 y1

    System.out.println("What is your x2 and y2? Format: (x2,y2)");
    String p2 = s.nextLine();// second two points, x2 y2
    System.out.println(p1.substring(1, p1.indexOf(",")));

    }// end main method
    public static void crowDistance(int x1, int y1, int x2, int y2) {

    }// end crowDistance method
    public static void taxicabDistance(int x1, int x2) {

    }// end taxicabDistance method
    /*
      * Name
      * Purpose
      *
      *
    */
    public static int stringToInt(String k) {

      return -1;
    }// end stringInt method
}// end class
