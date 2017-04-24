/*
 * (Sides of a Triangle) Write an application that reads three nonzero values entered by the
user and determines and prints whether they could represent the sides of a triangle.
4.36 (Sides of a Right Triangle) Write an application that reads three nonzero integers and de-
termines and prints whether they could represent the sides of a right triangle.
 */
package chapter4;
import java.util.Scanner;
public class TriangleSides {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter three non zero integers");
        int number1 = input.nextInt();
        int number3 = input.nextInt();
        int number2 = input.nextInt();
        
        int sum1 = number1*number1 + number2*number2;
        int sum2 = number1*number1 + number3*number3;
        int sum3 = number3*number3 + number2*number2;
        
        if(sum1 == number3*number3 || sum2 == number2*number2 || sum3 == number1*number1)
            System.out.println("Triangle is a right tringle");
        
        if(number1 + number2 > number3)
            System.out.println("Sides represent a tringle");
        if(number1 + number3 > number2)
            System.out.println("Sides represent a tringle");
        if(number2 + number3 > number1)
            System.out.println("Sides represent a tringle");
    }
    
}
