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

    //grab month of birth, 2 chars
    if(bDay.indexOf("/") == 2) {
      username += bDay.substring(0,2);
      username += bDay.substring(bDay.length()-2);
    }
    else {
      username += "0";
      username += bDay.substring(0,1);
      username += bDay.substring(bDay.length()-2);
    }

    //domain name
    username += "@anonymous.org";

    System.out.println("Your username is: " + username);
   // **domain name** @compsci.com OR @csaiscool.com
   s.close();
  }// end main method
}// end class
