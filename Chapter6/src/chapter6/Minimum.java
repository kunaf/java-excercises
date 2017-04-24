/*
 *(Find the Minimum) Write a method minimum3 that returns the smallest of three floating-
point numbers. Use the Math.min method to implement minimum3 . Incorporate the method into an
application that reads three values from the user, determines the smallest value and displays the re-
sult.
 */
package chapter6;
import java.util.Scanner;
/**
 *
 * @author kuna
 */
public class Minimum {
    public static float minimum(float a, float b, float c){
        float min = a;
        if(b > a && c > a)
            min = a;
        else if(a > b && c > b)
            min = b;
        else if(a > c && b > c)
            min = c;
        return min;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter 3 floating point numbers to determine the minimum: ");
        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();
        
        System.out.printf("The smallest value of %.4f, %.4f and %.4f is ", a,b,c);
        System.out.println(minimum(a,b,c));
    }
    
}
