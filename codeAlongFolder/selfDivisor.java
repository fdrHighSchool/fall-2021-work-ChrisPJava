package codeAlongFolder;
import java.util.Arrays;

public class selfDivisor {
  public static void main(String[] args) {
    System.out.println(iSD(12)); // Should output true, self divisor
    System.out.println(iSD(13)); // Should output falsem, not self divisor
    System.out.println(Arrays.toString(fNSD(10, 3))); // I decided that the example from the FRQ would be the most simple to test
  }// end main method

  public static boolean iSD(int number) {
    int num = 0;

    while(number > 0) {
      num = number % 10;

      if(num == 0) {
        return false;
      }

      if (number % num != 0) {
        return false;
      }
    
      number /= 10;
    }

    return true;
  }// end iSD method

  public static int[] fNSD(int start, int num) {
    int count = 0;
    int[] arr = new int[num];

  
    while (count < num) {
      if (iSD(start)) {
        arr[count] = start;
        count++;
      }

      start++;
    }
    
    return arr;
  }// end fNSD method
}// end class
