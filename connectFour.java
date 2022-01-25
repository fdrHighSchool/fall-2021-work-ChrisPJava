import java.util.*;

public class connectFour {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String[][] board = new String[6][7];
    boolean cont = true;
    int round = 0;
    int col2 = 0;
    String col;

    fillBoard(board);

    while(cont) {
      // Starts with X and then follows O, X, O, X, ...
      System.out.println("\nWhat is you column?");
      col = s.nextLine();
      col = col.toLowerCase();

      System.out.println("");

      if(col.equals("quit")) {
        cont = false;
        System.exit(0);
      }

      col2 = Integer.parseInt(col);

      clrScrn();
      displayBoard(round(board, col2, round));
      round++;
    }
  } // end main method

  public static void clrScrn() {
    System.out.println("\033[H\033[2J");
    System.out.flush();
  }

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

  public static String[][] round(String[][] board, int c, int round) {
    Scanner s = new Scanner(System.in);
    String choice = "";
    int colFill = 0;
    c = c - 1;

    if(round % 2 == 0) {
      choice = "[X]";
    }
    else {
      choice = "[O]";
    }

    for(int row = board.length-1; row >= 0; row--) {
      for(int col = board[row].length-1; col >= 0; col--) {
        if(c < 0 || c > board[0].length-1) {
          while(c < 0 || c > board[0].length-1) {
            System.out.println("Please type in a valid column.");
            c = s.nextInt();
            System.out.println("");
          }
        }

        if(row == board.length-1 && col == c) {
          if(board[row][c] == "[ ]") {
            board[row][c] = choice;
          }
          else if(board[row][c] != "[ ]" && board[row-1][c] == "[ ]") {
            for(int i = 0; i < board.length; i++) {
              if(board[i][c] == "[ ]") {
                colFill++;
              }
            }

            board[(colFill-2)][c] = choice;
          }

          System.out.println(colFill);
        }
      }
    }

    colFill = 0;
    return board;
  }// end round method
} // end class

