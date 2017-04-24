/*
 * Purpose: This program prompts the user to input a number and hence checks if the numbe is dd or even
 * Author: Kuna Fomboh
 * Date: 4/4/17
 */
package Chapter1;

import java.util.Scanner;

public class OddEven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
        System.out.println("Enter an integer: "); //prompt
        int value = input.nextInt();
        
        //tests if a number is even or odd
        if(value%2==0) {// an number is even if there exist no remaiinder when the number is divided by 2
            System.out.printf("%d is an even number.\n", value);
        }
        else System.out.printf("%d is an odd number.\n", value);
    }
    
}
