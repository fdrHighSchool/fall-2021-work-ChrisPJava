import java.util.*;

public class ExamsMDA {
  public static void main(String[] args) {
    // Initialization
    int[][] arr = new int[15][5];

    // Fill/Access
    for(int j = 0; j < arr.length; j++) {
      for(int i = 0; i < 5; i++) {
        System.out.println(arr[j][i]+(int)(Math.random() * 9));
      }
    }

    // Print
    System.out.println(arr[0][1]);

  }// end main method
}// end class
