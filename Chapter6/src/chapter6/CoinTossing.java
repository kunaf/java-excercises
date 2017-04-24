/*
 *(Coin Tossing) Write an application that simulates coin tossing. Let the program toss a coin
each time the user chooses the “ Toss Coin ” menu option. Count the number of times each side of
the coin appears. Display the results. The program should call a separate method flip that takes no
arguments and returns a value from a Coin enum ( HEADS and TAILS ). [Note: If the program realistically
simulates coin tossing, each side of the coin should appear approximately half the time.]
 */
package chapter6;

/**
 *
 * @author kuna
 */
public class CoinTossing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println((int)(Math.random() *2 ));
    }
    
}
