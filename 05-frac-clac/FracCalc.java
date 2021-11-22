import java.util.*;

public class FracCalc {
    public static void main(String[] args){
    //New Scanner Instance
    Scanner s = new Scanner(System.in);
    System.out.println("Welcome! You have accessed a fraction calculator.");

    //User input
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

  /*
  -N-> produceAnswer
  -P-> To Calculate the sum, diff, product, or quotient of two given fractions
  -I-> The whole expression of two fractions, String
  -R-> Returns a String with the calculated fraction result
  */
  public static String produceAnswer(String input){
    String sim;

    //Separating the fraction into three mathematical parts
    String firstOper = input.substring(0, input.indexOf(" "));//FRAC1
    String oper = input.substring(input.indexOf(" ")+ 1, input.lastIndexOf(" "));
    String secOper = input.substring(input.indexOf(" ")+ 3);//FRAC2

    //Fraction seperation
    String whole = "";
    String nume = "";
    String demo = firstOper.substring(firstOper.indexOf("/")+ 1);

    String whole2 = "";
    String nume2 = "";
    String demo2 = secOper.substring(secOper.lastIndexOf("/")+ 1);

    // **NUMBER SEPARATION FOR FIRST OPERAND**
    if(firstOper.contains("_") == false && firstOper.contains("/") == false) {
      whole = "0";
      nume = firstOper;
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
      whole2 = "0";
      nume2 = secOper;
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

    //Convert String to Int
    int wholeInt = convertStr(whole);
    int numeInt = convertStr(nume);
    int demoInt = convertStr(demo);

    int wholeInt2 = convertStr(whole2);
    int numeInt2 = convertStr(nume2);
    int demoInt2 = convertStr(demo2);

    //Makes it easier to do calculations
    if(wholeInt != 0 && wholeInt2 != 0) {

      numeInt = toImp(wholeInt, numeInt, demoInt);
      numeInt2 = toImp(wholeInt2, numeInt2, demoInt2);
    }
    else if(wholeInt != 0) {

      numeInt = toImp(wholeInt, numeInt, demoInt);
    }
    else if(wholeInt2 != 0) {

      numeInt2 = toImp(wholeInt2, numeInt2, demoInt2);
    }

    //Returns simplified result from both fractions
    String f = "";
    if(oper.equals("+")) {
      f = add(numeInt, demoInt, numeInt2, demoInt2);
      if(f.equals("0")){
        return "ERROR: Cannot divide by 0.";
      }
      else {
        return "Calculated result = "+ add(numeInt, demoInt, numeInt2, demoInt2);
      }
    }
    else if(oper.equals("-")) {
      f = mult(numeInt, demoInt, numeInt2, demoInt2);
      if(f.equals("0")){
        return "ERROR: Cannot divide by 0.";
      }
      else {
        return "Calculated result = "+ sub(numeInt, demoInt, numeInt2, demoInt2);
      }
    }
    else if(oper.equals("*")) {
      f = mult(numeInt, demoInt, numeInt2, demoInt2);
      if(f.equals("0")){
        return "ERROR: Cannot divide by 0.";
      }
      else {
        return "Calculated result = "+ mult(numeInt, demoInt, numeInt2, demoInt2);
      }
    }
    else {
      f = mult(numeInt, demoInt, numeInt2, demoInt2);
      if(f.equals("0")){
        return "ERROR: Cannot divide by 0.";
      }
      else {
      return "Calculated result = "+ div(numeInt, demoInt, numeInt2, demoInt2);
      }
    }

    //Does the final string to integer conversion to return a string
  }//end produceAnswer method

  /*
  -N-> ToImp
  -P-> To put a mixed fraction into a improper fraction
  -I-> Whole, Numerator, Denomator as integers
  -R-> Numerator for improper fraction as a integer
  */
  public static int toImp(int w, int n , int d) {
    int newnume = w * d;
    newnume = newnume + n;
    return newnume;
  }// end toImp method

  /*
  -N-> add
  -P-> To add fractions
  -I-> Both numerators and fractions as integers
  -R-> Improper added fraction
  */
  public static String add(int nu, int de, int nu2, int de2) {
    if(de == 0 || de2 == 0){
      return "0";
    }
    int add = (nu * de2) + (nu2 * de);
    int add2 = (de * de2);
    String t = add +"/"+ add2;
    return t;
  }// end add method

  /*
  -N-> sub
  -P-> To subtract fractions
  -I-> Both numerators and fractions as integers
  -R-> Improper subtracted fraction
  */
  public static String sub(int nu, int de, int nu2, int de2) {
    if(de == 0 || de2 == 0){
      return "0";
    }
    int sub = (nu * de2) - (nu2 * de);
    int sub2 = (de * de2);
    String t = sub +"/"+ sub2;
    return t;
  }// end sub method

  /*
  -N-> mult
  -P-> To multiply fractions
  -I-> Both numerators and fractions as integers
  -R-> Improper multiplied fraction
  */
  public static String mult(int nu, int de, int nu2, int de2) {
    if(de == 0 || de2 == 0){
      return "0";
    }
    int mult = (nu * nu2);
    int mult2 = (de * de2);
    String t = mult +"/"+ mult2;
    return t;
  }// end mult method

  /*
  -N-> div
  -P-> To divide fractions
  -I-> Both numerators and fractions as integers
  -R-> Improper divided fraction
  */
  public static String div(int nu, int de, int nu2, int de2) {
    if(de == 0 || de2 == 0){
      return "0";
    }
    int div = (nu * de2);
    int div2 = (nu2 * de);
    String t = div +"/"+ div2;
    return t;
  }// end div method

  /*
  -N-> simp
  -P-> To divide fractions
  -I-> Both numerators and fractions as integers
  -R-> Improper divided fraction
  */
  public static String simp(int gcd, int nu, int de) {
    int sNu;
    int sDe;
    if(nu%gcd == 0) {
      sNu = nu / gcd;
    }
    else {
      sNu = nu % gcd;
    }
    if(de%gcd == 0) {
      sDe = de / gcd;
    }
    else {
      sDe = de % gcd;
    }
    if(sNu%sDe == 0) {
      return (sNu / sDe) + "";
    }
    else {
      return sNu +"/"+ sDe;
    }

  }// end simp method

  /*
  -N-> GCD
  -P-> Find the greatest common divisor
  -I-> Numerator and Denomator as integers
  -R-> Greatest common divisor as integer
  */
  public static int GCD(int nu, int de){
    int gcd = 1;
    for(int i = 1; i <= de && i <= nu; i++) {
      if(nu%i == 0 && de%i == 0) {
        gcd = i;
      }
    }

    return gcd;
  }//end GCD method

  /*
  -N-> convertStr
  -P-> Convert from Str to Int type
  -I-> A string
  -R-> An integer
  */
  public static int convertStr(String a) {
    int conv = Integer.parseInt(a);

    return conv;
  }//end convertStr method
}//end class
