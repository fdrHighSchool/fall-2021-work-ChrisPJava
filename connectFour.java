import java.util.*;

public class connectFour {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String[][] board = new String[6][7];
    boolean cont = true;
    String col;
    int col2 = 0;

    fillBoard(board);

    while(cont) {
      // Starts with X and then follows O, X, O, X, ...
      System.out.println("What is you column?");
      col = s.nextLine();
      col = col.toLowerCase();

      if(col.equals("quit")) {
        System.exit(0);
        cont = false;
      }

      col2 = Integer.parseInt(col);

      displayBoard(round(board, col2));
    }
  } // end main method

  public static String[][] fillBoard(String[][] board) {
    for(int row = 0; row < board.length; row++) {
      for(int col = 0; col < board[row].length; col++) {
        board[row][col] = "[ ]";
      }   
    }

    return board;
  } // end fillBoard method

  public static void displayBoard(String[][] board) { 
    for(int row = 0; row < board.length; row++) {
      for(int col = 0; col < board[row].length; col++) {
        System.out.print(board[row][col] + " ");
      } 
      System.out.println();
    } 
  } // end displayBoard method

  public static String[][] round(String[][] board, int c) {
    String x = "X";
    String o = "O";
    int round = 0;
    c = c - 1;

    for(int row = 0; row < board.length; row++) {
      for(int col = board[row].length-1; col > 0; col--) {
        if(row == c) {
          if(board[row][col] != "[X]" || board[row][col] != "[O]") {
            board[row][col] = "["+ x +"]";
          }
          row++;
        }
      } 
    }

    return board;
  }// end round method
} // end class

/*

*/
