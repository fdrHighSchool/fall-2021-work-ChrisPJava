import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // main variables
        int guess = 3;
        int rg = 0;
        boolean repeat = false;

        // type of game; 1-10, 1-50, 1-100
        System.out.println("\nWelcome to the number guessing game! You have 3 game mode choices.");
        System.out.print("Type '1' for numbers 0-10\nType '2' for numbers 1-50\nType '3' for numbers 1-100\nChoice: ");
        int choice = s.nextInt();

        // if statements to set variables for the method w/ choice
        if(choice == 1) {
            rg = 10;
        }
        else if(choice == 2) {
            rg = 50;
        }
        else if(choice == 3) {
            rg = 100;
        }

        game(rg,guess,repeat);// runs game method
        s.close();// scanner close
    }

    public static void game(int ra, int g, boolean p) {
        int c;
        Scanner s2 = new Scanner(System.in);
        Random r2 = new Random();

        while(p == false) {
            int msg = r2.nextInt(2);
            System.out.println("\nGuesses left: "+ g);

            while(g != 0) {
                int ranNum = ((r2.nextInt(ra)) + 1);
                System.out.println("Guess a number from 1-"+ ra +"!");
                c = s2.nextInt();

                if(c == ranNum) {
                    //random message for correct guess
                    if(msg == 0) {   
                        System.out.println("Correct!\n");
                    }

                    else if(msg == 1) {
                        System.out.println("You guessed the right number!\n");
                    }
                }

                else {
                    //random message for wrong guess
                    if(msg == 0) {
                        g -= 1;  
                        System.out.println("Incorrect! Guesses left: "+ g +"\n");
                    }

                    else if(msg == 1) {
                        g -= 1;   
                        System.out.println("Wrong! Guesses left: "+ g +"\n");
                    }
                }// end while loop

            }// end while loop

            // *replay option
            System.out.println("Thank you for playing! Would you like to play again?\nType '1' for yes, type '2' for no.");
            c = s2.nextInt();

            if(c == 1) {
                System.out.print("\nType '1' for numbers 0-10\nType '2' for numbers 1-50\nType '3' for numbers 1-100\nChoice: ");
                c = s2.nextInt();
                g = 3;

                // if statements to set variables for the method w/ choice
                if(c == 1){
                    ra = 10;
                }
                else if(c == 2){
                    ra = 50;
                }
                else if(c == 3){
                    ra = 100;
                }
            }

            else {
                p = true;
                System.out.println("Thank you for playing!");
            }
        }

        s2.close();// scanner close
    }// end execute method
}