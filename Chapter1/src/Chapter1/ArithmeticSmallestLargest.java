/*
 * Purpose: This program prompts the user to input three integers and computes the sum, product, average, largest and smallest.
 * Author: Kuna Fomboh
 * Date: 4/4/17
 */
package chapter1;

import java.util.Scanner;

/**
 *
 * @author Kuna
 */
public class ArithmeticSmallestLargest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
        int number1, number2, number3;
        int average, product, sum, smallest, largest;
        
        System.out.println("Enter the first integer: "); //prompt
        number1 = input.nextInt(); //read first number from user
        System.out.println("Enter the second integer: "); //prompt
        number2 = input.nextInt();//read secoond number from user
        System.out.println("Enter the third integer: "); //prompt
        number3 = input.nextInt();//read third number from user
        
        //tests for largest integer
        
       // smallest = largest = number1;
        
	if(number1 >= number2 && number1 >= number3)
		System.out.printf("The largest number is:%d\n", number1);
        else if(number2 >= number1 && number2 >= number3)
		System.out.printf("The largest number is:%d\n", number2);
        else if(number3 >= number1 && number3 >= number2)
		System.out.printf("The largest number is:%d \n", number3);
        
        //tests for smallest integer
        if(number1 <= number2 && number1 <= number3)
		System.out.printf("The smallest number is:%d\n", number1);
        else if(number2 <= number1 && number2 <= number3)
		System.out.printf("The smallest number is:%d\n", number2);
        else if(number3 <= number1 && number3 <= number2)
		System.out.printf("The smallest number is:%d \n", number3);

        product = number1 * number2 * number3;
	sum = number1 + number2 + number3;
	average = sum/3;

        System.out.printf("The Sum is: %d\nThe product is: %d\nThe average is: %d\n", sum, product, average);
           
       
               
        
    }
    
}
