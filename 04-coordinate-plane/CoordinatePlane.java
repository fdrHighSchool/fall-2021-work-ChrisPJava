import java.util.*;

public class CoordinatePlane {
    public static void main(String[] args) {
        //new scanner instance
        Scanner s = new Scanner(System.in);

        //program introduction
        System.out.println("Hey there! I'm your coordinate plane and ready to graph some points.");
        System.out.println("\nWhat's your first pair in format: (x, y)");
        String p1 = s.nextLine();

        System.out.println("\nWhat's your second pair in format: (x, y)");
        String p2 = s.nextLine();

        int x1 = intX(p1);
        int x2 = intX(p2);
        int y1 = intY(p1);
        int y2 = intY(p2);

        //CoordinatePlane method call
        coordinatePlane(x1, y1, x2, y2);

        //taxicabMethod method call
        taxicabDistance(x1, y1, x2, y2);

        //scanner close
        s.close();
    }// end main method

    /*
    ~ Name: CoordinatePlane
    ~ Purpose: To find the diagonal distance between to points using the distance formula.
    ~ Input: Integer values of the first and second coordinate pair.
    ~ Return: Outputs the value of the distance between the two coordinate pairs.
    */
    public static void coordinatePlane(int x1, int y1, int x2, int y2) {
        //variable type is double for decimal rounding
        double dis = 0;

        //distance formula using the two coordinate pair values
        dis = (Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));

        //rounding to thousandths decimal place
        //moves decimal 3 places to the right
        dis = (dis * 1000);

        //rounds current decimal value to the next value
        dis = Math.round(dis);

        //places decimal point back into the same position, 4 places to the left
        dis = (dis / 1000);

        System.out.println("\nThe diagonal distance between " + "("+ x1 +", "+ y1 +") and ("+ x2 +", "+ y2 +") is "+ Math.abs(dis) +" units.");
    }// end CooridnatePlane method

    /*
    ~ Name: taxicabDistance
    ~ Purpose: To find the taxicab distance between the two points.
    ~ Input: Integer values of the first and second coordinate pair.
    ~ Return: Outputs the taxicab distance between the teo coordinate points.
    */
    public static void taxicabDistance(int x1, int y1, int x2, int y2) {
        int dis = 0;

        //conditions for resulting the correct x distance value form x2 to x1.
        if((x2 < 0) && (x1 < 0)) {

            dis = Math.abs((Math.abs(x2) - Math.abs(x1)));
        }
        else if((x2 > 0) && (x1 > 0)) {

            dis = Math.abs((Math.abs(x2) - Math.abs(x1)));
        }
        else if((x2 < 0) || (x1 < 0)) {

            dis = (Math.abs(x2) + Math.abs(x1));
        }

        //conditions for resulting the correct y distance value form y2 to y1. Adds x distance value to recieve the total taxicab length
        if((y2 < 0) && (y1 < 0)) {

            dis = dis + Math.abs((Math.abs(y2) - Math.abs(y1)));
        }
        else if((y2 > 0) && (y1 > 0)) {

            dis = dis + Math.abs((Math.abs(y2) - Math.abs(y1)));
        }
        else if((y2 < 0) || (y1 < 0)) {

            dis = dis + (Math.abs(y2) + Math.abs(y1));
        }

        System.out.println("\nThe taxicab distance between " + "("+ x1 +", "+ y1 +") and ("+ x2 +", "+ y2 +") is "+ dis +" units.");
    }// end taxicabDistance method

    /*
    ~ Name: intX
    ~ Purpose: To convert the X value of the coordinate pair from a string type to int type
    ~ Input: String value into parameter named 'o'
    ~ Return: Returns the converted string value into a int value
    */
    public static int intX(String o) {
        String conv = o.substring(1, o.indexOf(","));

        int x = Integer.parseInt(conv);

        return x;
    }// end intX method

    /*
    ~ Name: intY
    ~ Purpose: To convert the y value of the coordinate pair from a string type to int type
    ~ Input: String value into parameter named 'o'
    ~ Return: Returns the converted string value into a int value
    */
    public static int intY(String o) {
        String conv = o.substring((o.indexOf(",") + 2), o.length()-1);

        int y = Integer.parseInt(conv);

        return y;
    }// end intY method
}// end class
