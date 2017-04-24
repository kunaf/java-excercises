/*
 *  Purpose: This program inputs one number consisting of five digits from the user, separates the 
             number into its individual digits and prints the digits separated from one another by 
             three spaces each.
 * Author: Kuna Fomboh
 * Date: 4/4/17
 */
package Chapter1;

import java.util.Scanner;

public class SeperateDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);
       
        System.out.println("Enter a five digit number: ");
        int number = input.nextInt();
        
        int digit1, digit2, digit3, digit4, digit5; 
        
        //seperating the number into digits
        digit1 = number / 10000; //divides number by 1000 to get 1
        digit2 = number % 10000 / 1000;
        digit3 = number % 1000 / 100;
        digit4 = number % 100 / 10;
        digit5 = number % 10;
        
        System.out.printf("%d   %d   %d   %d   %d\n", digit1, digit2, digit3, digit4, digit5);
                
    }
    
}
