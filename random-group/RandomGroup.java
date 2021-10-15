import java.util.*;

public class RandomGroup {
    public static void main(String[] args) {
      //new scanner in
      Scanner in = new Scanner(System.in);

      //asks user for groups
      System.out.println("How many groups?");
      int grps = in.nextInt();

      int ranGroup = (int)(Math.random()*grps + 1);

      //output
      System.out.println("Group #"+ ranGroup +" has been chosen!");

    }// end main method
}// end class
