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

        String frstOper = input.substring(0, input.indexOf(" "));//FRAC1
        String oper = input.substring(input.indexOf(" ")+ 1, input.indexOf(" ")+ 2);
        String secOper = input.substring(input.indexOf(" ")+ 3);//FRAC2

        // Checkpoint 2: Return the second operand as a string representing each part.
        //               Example "4/5 * 1_2/4" returns "whole:1 numerator:2 denominator:4"
        String whole = "";
        String nume = "";
        String demo = input.substring(input.lastIndexOf("/")+ 1);

        if(secOper.contains("_") == false && secOper.contains("/") == false) {
            whole = secOper;
            nume = "0";
            demo = "1";
            //return "Whole: "+ whole +" Numerator: "+ nume +" Denominator: "+ demo;
        }
        else if(secOper.contains("_") == true && secOper.contains("/") == true) {
            whole = secOper.substring(0, secOper.indexOf("_"));
            nume = secOper.substring(secOper.indexOf("_")+ 1, secOper.indexOf("/"));
            //return "Whole: "+ whole +" Numerator: "+ nume +" Denominator: "+ demo;
        }
        else {
            whole = "0";
            nume = secOper.substring(0, secOper.indexOf("/"));
            //return "Whole: "+ whole +" Numerator: "+ nume +" Denominator: "+ demo;
        }

        // Checkpoint 3: Evaluate the formula and return the result as a fraction.
        //               Example "4/5 * 1_2/4" returns "6/5".
        //               Note: Answer does not need to be reduced, but it must be correct.

        int wholeInt = convertStr(whole);
        int numeInt = convertStr(nume);
        int demoInt = convertStr(demo);



        // Final project: All answers must be reduced.
        //               Example "4/5 * 1_2/4" returns "1_1/5".
    }//end produceAnswer method

    public static int convertStr(String a) {
      int conv = Integer.parseInt(a);

      return conv;
    }

    public static int multiply(int wh, int nu, int de) {
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
}//end class
