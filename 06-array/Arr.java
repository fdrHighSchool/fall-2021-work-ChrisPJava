import java.util.Random;
import java.util.Arrays;

public class Arr {
    public static void main(String[] args) {
        // Varaible and arrays gets delcared and initialized
        int arr[] = new int[10]; 
        double arr2[] = new double[100]; 
        Random r = new Random();
        double total = 0.0;
        double rand = 0.0;
        
        //10 selected values that has a mean of 6
        arr[0] = 6;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        arr[6] = 7;
        arr[7] = 8;
        arr[8] = 9;
        arr[9] = 10;

        // For loop traverses through each value of the list and adds the numbers to total 
        
        for(int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }

        // Calculation for mean
        total = total / arr.length;

        System.out.println("10 values list below.\n");
        System.out.println("Average: "+ total +"\n");
        System.out.println("100 values list below.\n");
        
        // Clears previous values
        total = 0.0;

        // First fl gives each index a random
        // Second fl value adds them all together into one varaible
        for(int i = 0; i < arr2.length; i++) {
            rand = r.nextInt(100);
            arr2[i] = rand;
        }

        for(int i = 0; i < arr2.length; i++) {
            total = total + arr2[i];
        }

        // Calculation for mean
        total = total / arr2.length;
        System.out.println("Average: "+ total +"\n");
    }
}

