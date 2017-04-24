/*
 * (Palindromes) A palindrome is a sequence of characters that reads the same backward as for-
ward. For example, each of the following five-digit integers is a palindrome: 12321, 55555, 45554
and 11611. Write an application that reads in a five-digit integer and determines whether it’s a pal-
indrome. If the number is not five digits long, display an error message and allow the user to enter
a new value.
 */
package chapter4;
import java.util.Scanner;
public class Palindromes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int digit1, digit2, digit3, digit4, digit5;
        
        System.out.println("Enter 5 digit number: ");
        int number = input.nextInt(); 
        while(number < 9999 || number > 100000) {
            System.out.println("Enter a 5 digit number!");
            number = input.nextInt();
        }
        
        //seperating the number into digits
        digit1 = number / 10000; //divides number by 1000 to get 1
        digit2 = number % 10000 / 1000;
        digit3 = number % 1000 / 100;
        digit4 = number % 100 / 10;
        digit5 = number % 10;
        
        if(digit1 == digit5 && digit2 == digit4)
            System.out.println("Number is a Palindrome!");
        else
            System.out.println("Number is not a Palindrome");
    }
    
}
