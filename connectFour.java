import java.util.*;

public class connectFour {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String[][] board = new String[6][7];
    boolean cont = true;
    String row;
    int row2 = 0;
    String col;
    int col2 = 0;
    String ltr;

    while(cont) {
        // Starts with X and then follows O, X, O, X, ...
        System.out.println("What is your row?");
        row = s.nextLine();
        row = row.toLowerCase();

        if(row.equals("quit")) {
            System.exit(0);
            cont = false;
        }

        row2 = Integer.parseInt(row);

        System.out.println("What is you column?");
        col = s.nextLine();
        col = col.toLowerCase();

        if(col.equals("quit")) {
            System.exit(0);
            cont = false;
        }

        col2 = Integer.parseInt(col);

        System.out.println("What is you letter, X or O?");
        ltr = s.nextLine();
        ltr = ltr.toUpperCase();

        if(ltr.equals("quit")) {
            System.exit(0);
            cont = false;
        }

        displayBoard(fillBoard(board, row2, col2, ltr));
    }
  } // end main method


  public static String[][] fillBoard(String[][] board, int r, int c, String l) {
    r = r - 1;
    c = c - 1;
    for(int row = 0; row < board.length; row++) {
      for(int col = 0; col < board[row].length; col++) {
        if(board[row][col] == "[X]" || board[row][col] == "[O]") {
            col++;
        }
        else {
            if((row == r) && (col == c)) {
                // If there is a character in the 
                if(board[row][col] == "[X]" || board[row][col] == "[O]") {
                    board[row-1][col] = "["+ l +"]";
                }
                else {
                    board[row][col] = "["+ l +"]";
                }

                col++;
                }
                
                board[row][col] = "[ ]";
            } 
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
} // end class

/*

*/