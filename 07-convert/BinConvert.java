import java.util.*;
import java.lang.Math;

public class BinConvert {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean r = true;

        while(r) {
            // User Input
            System.out.println("What is your binary number?");
            String bin = s.nextLine();

            // Checks to see if the user wants to quit the program by typing quit
            if(bin.toLowerCase().equals("quit")) {
                System.exit(0);
            }
            // Else will continue the program
            else {
                System.out.println(binToDec(reverse(bin)));
            }
        }
    } // end main method

    public static int binToDec(String b) {
        int total = 0, comp = 0;

        for(int i = 0; i < b.length(); i++) {
            // Will add values if there is 1 
            if(b.substring(i,i+1).equals("1")) {
                // Since binary is base two, its two to the power of the index in this case
                comp = (int)(Math.pow(2,i));
                // Decimal value, trouble with just +=ing with one variable
                total = total + comp;
            }
        }

        // Returns decimal value of binary value
        return total;
    } // end method binToDec

    public static String reverse(String a) {
        String rStr = "";
    
        // Reverses each value in a swapping order
        for(int i = a.length()-1; i > -1; i--){
          rStr = rStr + a.charAt(i);
        }
        
        // returns reversed string
        return rStr;
    } // end method reverse

} // end class

/*
NOTE:

The reason why I reversed the string is because 
I first saw that the indexes 
correlated with the base of 
two powers for the binary numbers.

*/