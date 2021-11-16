import java.util.*;

public class FracCalc {
    public static void main(String[] args){
        // TODO: Read the input from the user and call produceAnswer with an equation

        // Checkpoint 1: Create a Scanner, read one line of input, pass that input to produceAnswer, print the result.
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome! You have accessed a fraction calculator.");

        // Checkpoint 2: Accept user input multiple times.
        boolean r = true;
        while(r) {
          System.out.println("What is your fraction in form: x_x/x or x/x (op.) x_x/x or x/x");
          String frac = s.nextLine();
          frac = frac.toLowerCase();

          if(frac.equals("quit")){
            System.out.println("Closing program...");
            r = false;
          }
          else if(!(frac.equals("quit"))) {
            System.out.println("\n" + produceAnswer(frac));
          }
        }

        s.close();
    }//end main method

    /**
     * produceAnswer - This function takes a String 'input' and produces the result.
     * @param input - A fraction string that needs to be evaluated.  For your program, this will be the user input.
     *      Example: input ==> "1/2 + 3/4"
     * @return the result of the fraction after it has been calculated.
     *      Example: return ==> "1_1/4"
     */
    public static String produceAnswer(String input){
        // TODO: Implement this function to produce the solution to the input
        // Checkpoint 1: Return the second operand.  Example "4/5 * 1_2/4" returns "1_2/4".

        String firstOper = input.substring(0, input.indexOf(" "));//FRAC1
        String oper = input.substring(input.indexOf(" ")+ 1, input.indexOf(" ")+ 2);
        String secOper = input.substring(input.indexOf(" ")+ 3);//FRAC2

        // Checkpoint 2: Return the second operand as a string representing each part.
        //               Example "4/5 * 1_2/4" returns "whole:1 numerator:2 denominator:4"
        String whole = "";
        String nume = "";
        String demo = firstOper.substring(firstOper.indexOf("/")+ 1);

        String whole2 = "";
        String nume2 = "";
        String demo2 = secOper.substring(secOper.lastIndexOf("/")+ 1);

        // **NUMBER SEPARATION FOR FIRST OPERAND**
        if(firstOper.contains("_") == false && firstOper.contains("/") == false) {
          whole = firstOper;
          nume = "0";
          demo = "1";
        }
        else if (firstOper.contains("_") == true && firstOper.contains("/") == true) {
          whole = firstOper.substring(0, firstOper.indexOf("_"));
          nume = firstOper.substring(firstOper.indexOf("_")+ 1, firstOper.indexOf("/"));
        }
        else {
          whole = "0";
          nume = firstOper.substring(0, firstOper.indexOf("/"));
        }

        // **NUMBER SEPARATION FOR SECOND OPERAND**
        if(secOper.contains("_") == false && secOper.contains("/") == false) {
            whole2 = secOper;
            nume2 = "0";
            demo2 = "1";
        }
        else if(secOper.contains("_") == true && secOper.contains("/") == true) {
            whole2 = secOper.substring(0, secOper.indexOf("_"));
            nume2 = secOper.substring(secOper.indexOf("_")+ 1, secOper.indexOf("/"));
        }
        else {
            whole2 = "0";
            nume2 = secOper.substring(0, secOper.indexOf("/"));
        }

        int wholeInt = converStr(whole);
        int numeInt = convertStr(nume);
        int demoInt = convertStr(demo);

        int wholeInt2 = convertStr(whole2);
        int numeInt2 = convertStr(nume2);
        int demoInt2 = convertStr(demo2);

        // Checkpoint 3: Evaluate the formula and return the result as a fraction.
        //               Example "4/5 * 1_2/4" returns "6/5".
        //               Note: Answer does not need to be reduced, but it must be correct.



        // Final project: All answers must be reduced.
        //               Example "4/5 * 1_2/4" returns "1_1/5".
    }//end produceAnswer method

    public static int multiply(int wh, int nu, int de, int wh2, int nu2, int de2) {
      return 0;
    }

    public static int divide(int wh, int nu, int de) {
      return 0;
    }

    public static int add(int wh, int nu, int de) {
      return 0;
    }

    public static int subtract(int wh, int nu, int de) {
      return 0;
    }

    // TODO: Fill in the space below with helper methods

    /**
     * greatestCommonDivisor - Find the largest integer that evenly divides two integers.
     *      Use this helper method in the Final Checkpoint to reduce fractions.
     * @param a - First integer.
     * @param b - Second integer.
     * @return The GCD.
     */
    public static int greatestCommonDivisor(int a, int b){

      return 0;
    }//end greatestCommonDivisor method

    /**
     * leastCommonMultiple - Find the smallest integer that can be evenly divided by two integers.
     *      Use this helper method in Checkpoint 3 to evaluate expressions.
     * @param a - First integer.
     * @param b - Second integer.
     * @return The LCM.
     */
    public static int leastCommonMultiple(int a, int b){

      return 0;
    }//end leastCommonMultiple

    public static int convertStr(String a) {
      int conv = Integer.parseInt(a);

      return conv;
    }//end convertStr method
}//end class
