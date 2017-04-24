/*
 *(Guess the Number) Write an application that plays “guess the number” as follows: Your
program chooses the number to be guessed by selecting a random integer in the range 1 to 1000.
The application displays the prompt Guess a number between 1 and 1000 . The player inputs a first
guess. If the player's guess is incorrect, your program should display Too high. Try again. or Too
low. Try again. to help the player “zero in” on the correct answer. The program should prompt the
user for the next guess. When the user enters the correct answer, display Congratulations. You
guessed the number! , and allow the user to choose whether to play again. [Note: The guessing tech-
nique employed in this problem is similar to a binary search, which is discussed in Chapter 19,
Searching, Sorting and Big O.]
 */
package chapter6;
import java.security.SecureRandom;
import java.util.Scanner;
/**
 *
 * @author kuna
 */
public class GuessTheNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom random = new SecureRandom();
        
        int check = 0; //variable checks if user wants to stop playing the game
        
        System.out.println("GUESS A NUMBER!!");
        
        while(check != 1) {
            System.out.println("Guess and key in  a number between 1 and 10");
            int guess = input.nextInt(); //variable guess stores the player's guess
            
            //generating the random number
            int rand = 1 + random.nextInt(10);
            //loop helps player guess number easily by reducing the range of options
            while(guess != rand) {
                if(guess > rand)
                    System.out.println("Too high, try again");
                else if(guess < rand)
                    System.out.println("Too low, try again");
                guess = input.nextInt(); //allows player to guess again 
            }
            
            System.out.println("Congratulation!!\nYou Won!!!");
            //asks player if he/she wants to play again
            System.out.println("Enter 0 to play again or 1 to quit");
            check  = input.nextInt();
        }
       
    }
    
}
