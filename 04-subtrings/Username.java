import java.util.*;

public class Username {
  public static void main(String[] args) {
    // create an instance of the Scanner
    Scanner s = new Scanner(System.in);

    // ask the user thier first name
    System.out.println("What is your first name?");
    String fName = s.nextLine();

    // ask the user their last Username
    System.out.println("What is your last name?");
    String lName = s.nextLine();

    // ask user their birthday -> mm/dd/yyyy
    System.out.println("Hi, "+ fName +", please enter your birthday in mm/dd/yyyy format");
    String bDay = s.nextLine();

    // generate a username for that person based on the data
    String username = "";
    username += fName.substring(0, 1); // only using the first letter of the first name
    username += lName.substring(lName.length()-2); // final two letters depend on the length of the last name


  }// end main method
}// end class
