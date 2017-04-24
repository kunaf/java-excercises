/*
 * (Multiples) Write a method isMultiple that determines, for a pair of integers, whether the
second integer is a multiple of the first. The method should take two integer arguments and return
true if the second is a multiple of the first and false otherwise. [Hint: Use the remainder operator.]
Incorporate this method into an application that inputs a series of pairs of integers (one pair at a
time) and determines whether the second value in each pair is a multiple of the first.

(Even or Odd) Write a method isEven that uses the remainder operator ( % ) to determine
whether an integer is even. The method should take an integer argument and return true if the in-
teger is even and false otherwise. Incorporate this method into an application that inputs a se-
quence of integers (one at a time) and determines whether each is even or odd.

(Circle Area) Write an application that prompts the user for the radius of a circle and uses
a method called circleArea to calculate the area of the circle.
 */
package chapter6;
import java.util.Scanner;
/**
 * @author kuna
 */
public class Multiples {
    public static boolean isMultiple(int first, int second){
        if(first % second == 0 || second % first == 0)
            return true;
        else return false;
    }
    public static boolean isEven(int number) {
        if(number % 2 == 0 && number != 0) 
            return true;
        else return false;
    }
    public static double circleArea(double radius) {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter radius for your circle to calculate the area.");
        double radius = input.nextDouble();
        
        double area = circleArea(radius);
        System.out.println(area);
        
        int loop = 0;
        while(loop <= 5) {
            System.out.println("Enter a pair of integers, to test if the first is a multiple of the second ");
            int first = input.nextInt();
            int second = input.nextInt();
        
            boolean check = isMultiple(first, second);
        
            System.out.println(check);
            loop++;
        }
        
        System.out.println("");
        
        int loop1 = 0;
        while(loop1 <=4 ) {
            System.out.println("Enter an integer to test if it is even");
            int number = input.nextInt();
            
            boolean even = isEven(number);
            System.out.println(even);
            
            loop1++;
        }
       
    }
    
}
