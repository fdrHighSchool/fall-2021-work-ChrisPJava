import java.util.Random;
import java.util.Arrays;

public class Arr {
    public static void main(String[] args) {
        int arr[] = {6,2,3,4,5,6,7,8,9,10}; // Mean test case
        int arr3[] = {1,1,3,4,5,6,7,8,9,10}; // Mode and Range test case
        double arr2[] = new double[100]; // Mean w/ random values test case
        double total = 0.0;

        // For loop traverses through each value of the list and adds the numbers to total 
        for(int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }      

        // Outputs
        System.out.println("Average: "+ total / arr.length +"\n");
        System.out.println("Average: "+ mean(arr2) +"\n");
        System.out.println("Mode: "+ mode(arr3) +"\n");
        System.out.println("Range: "+ range(arr3) +"\n");
    }

    public static double mean(double[] arr) {
        //Random instance
        Random r = new Random();
        double total = 0.0;
        int rand = 0;
        // First fl gives each index a random
        for(int i = 0; i < arr.length; i++) {
            rand = r.nextInt(100);
            arr[i] = rand;
        }
        // Second fl adds all values of the array together into one variable
        for(int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }

        // Returns the mean
        return total / arr.length;
    }// end mean method
    
    public static int mode(int arr[]) {
        // New array storing with the length of the greatest number
        // The added 2 is for not having 0 to the greatest number
        int freqArr[] = new int[max(arr)+2];

        // Adds values to the corresponding index of the new array
        for(int i = 0; i < arr.length; i++) {
           freqArr[arr[i]]++;
        }

        // Fl that finds what index has the greatest value and take i 
        // Because i would used as the value on accessing the indexes of an array
        int index = 0;
        for(int i = 0; i < freqArr.length; i++) {
            if(freqArr[i] == max(freqArr)) {
                index = i;
                break; // Breaks once the index of the number that repeats most is found
            }
        }  

        // Returns the mode
        return index;
    }// end mode method

    public static int range(int[] arr) {
        return (max(arr) - min(arr));// ># - <#
    }// end range method

    public static int median(int[] arr) {

        return 0;
    }// end median method

    public static int max(int[] arr) {
        int max = 0;
        // Fl that compares each index of the array to the max variable
        // The max variable gets updated if a greater value is found
        for(int i = 0; i < arr.length-1; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        
        // Returns the greatest number from the array
        return max;
    }// end max method

    public static int min(int[] arr) {
        // An extreme value because a number like this wouldn't seen in the arrays given 
        int min = 999999999;
        // Fl that compares each index of the array to the max variable
        // The max variable gets updated if a greater value is found
        for(int i = 0; i < arr.length-1; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }

        // Returns the greatest number from the array
        return min;
    }// end min method
}// end class
