/*
 * (Greatest Common Divisor) The greatest common divisor (GCD) of two integers is the largest
integer that evenly divides each of the two numbers. Write a method gcd that returns the greatest
common divisor of two integers. [Hint: You might want to use Euclid’s algorithm. You can find
information about it at en.wikipedia.org/wiki/Euclidean_algorithm .] Incorporate the method
into an application that reads two values from the user and displays the result.
 */
package chapter6;
import java.util.Scanner;
/**
 * @author kuna
 */
public class GreatestCommonDivisor {
    public static int GCD(int a, int b) {
        int r = 1, gcd = 1;//remainder;
       
            while(r!=0) {
                r = a%b;
                a = b;
                gcd = b;
                b = r;
            }
        return Math.abs(gcd);
    }
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
        System.out.println("Enter a pair of integers to find their greatest common divisor:");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.printf("The GCD of %d and %d is: ", a, b);
        System.out.println(GCD(a,b));
    }
    
}

/*if((Math.abs(a) < Math.abs(b))){
            int temp = a;
            a = b;
            b = temp;
        }  
     /* if(a==b)
            gcd = a;
        else */