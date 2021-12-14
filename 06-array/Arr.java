import java.util.Random;
import java.util.Arrays;

public class Arr {
    public static void main(String[] args) {
        int arr[] = {6,2,3,4,5,6,7,8,9,10}; // Mean test case
        double arr2[] = new double[100]; // Mean w/ random values test case
        int arr3[] = {7,2,20,5,7,3,2,9,4,6}; // Mode test case
        double total = 0.0;

        // For loop traverses through each value of the list and adds the numbers to total 
        for(int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }

        // Calculation for mean
        total = total / arr.length; // Mean for arr[]
        System.out.println("Average: "+ total +"\n");
        System.out.println("Average: "+ mean(arr2) +"\n");
        System.out.println("Average: "+ mode(arr3) +"\n");
    }

    public static double mean(double[] arr) {
        Random r = new Random();
        double total = 0.0;
        int rand = 0;
        // First fl gives each index a random
        for(int i = 0; i < arr.length; i++) {
            rand = r.nextInt(100);
            arr[i] = rand;
        }
        // Second fl value adds them all together into one varaible
        for(int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }

        return total / arr.length;
    }

    public static int mode(int arr[]) {
        int max = 0;
        for(int i = 0; i < arr.length-1; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        int freqArr[] = new int[max];

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < freqArr.length; i++) {
                freqArr[arr[i]] = freqArr[i] + 1;
            }
        }

        return 0;
    }
}
