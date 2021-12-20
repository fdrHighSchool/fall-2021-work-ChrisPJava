import java.util.Random;
import java.util.Arrays;

public class Arr {
    public static void main(String[] args) {
        int arr[] = {6,2,3,4,5,6,7,8,9,10}; // Mean test case
        int arr3[] = {2,2,3,4,5,6,7,8,9,10}; // Mode and Range test case
        int arr4[] = {13,19,17,16,21,22};// Median test case
        double arr2[] = new double[100]; // Mean w/ random values test case
        double total = 0.0;

        // For loop traverses through each value of the list and adds the numbers to total
        for(int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }

        // Outputs
        System.out.println("Average: "+ total / arr.length +"\n");// Mean, personal number set
        System.out.println("Average: "+ mean(arr2) +"\n");// Mean
        System.out.println("Mode: "+ mode(arr3) +"\n");// Mode
        System.out.println("Range: "+ range(arr3) +"\n");// Range
        System.out.println("Median: "+ median(arr4) +"\n");// Median
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

        // If all values of freqArr is 1, there is no mode 
        if(max(freqArr) == 1) {
          // Returns extreme value 
          return -1010101;
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

    public static double median(int[] arr) {
        int sortArr[] = sort(arr);

        if(sortArr.length % 2 == 0){
            // If even length, returns the two most middle value's average
            return ((double)(sortArr[((sortArr.length)/2)-1] + sortArr[((sortArr.length)/2)])) / 2;
        }
        else if(sortArr.length % 2 == 1) {
            // If odd length, returns middle number
            return (sortArr[(sortArr.length-1)/2]);
        }

        // Returns 0 if none of the conditions are satisfied
        return 0;
    }// end median method

    public static int[] sort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int minLoc = i;
            int temp = arr[i];
      
            // Searches for the values
            for (int j = i + 1; j < arr.length; j++) {
              // The new min is found
              if(arr[j] < min) {
                min = arr[j];
                minLoc = j;
              } 
            }
      
            arr[i] = min;
            arr[minLoc] = temp;
        }
      
        // Returns sorted array
        return arr;
    }// end sort method

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
