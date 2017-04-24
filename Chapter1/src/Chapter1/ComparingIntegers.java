/*
 * Purpose: This program prompts the user to input two integers and compares them.
 * Author: Kuna Fomboh
 * Date: 4/4/17
 */

package chapter1;

import java.util.Scanner;
/**
 *
 * @author Kuna
 */
public class ComparingIntegers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      int number1, number2; //first and second number to compare
      
        System.out.println("Enter the first integer: "); //prompt
        number1 = input.nextInt(); //read first number from user
        System.out.println("Enter the second integer: "); //prompt 
        number2 = input.nextInt();//read secoond number from user
        
        if(number1 == number2){
            System.out.println("These numbers are equal\n");
        }
        if(number1 > number2) {
            System.out.printf("%d is larger.\n", number1); 
        }
        if(number2 > number1) {
            System.out.printf("%d is larger.\n", number2); 
        }
        if(number1 < number2) {
            System.out.printf("%d is smaller.\n", number1); 
        }
        if(number2 < number1) {
            System.out.printf("%d is smaller.\n", number2); 
        }
    }
    
}
