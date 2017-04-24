/*
 * Purpose: This program that inputs from the user the radius of a circle
            as an integer and prints the circle’s diameter, circumference 
            and area using the floating-point value 3.14159 for π.
 * Author: Kuna Fomboh
 * Date: 4/4/17
 */
package Chapter1;

import java.util.Scanner;

public class Circle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double PI = Math.PI;  
        
        System.out.println("Enter radius of a Circle: "); //prompt
        int radius = input.nextInt();
        
        System.out.printf("Diameter = %d\n", 2*radius ); //ptinting the diameter
        System.out.printf("Circumference = %.3f\n", 2*PI*radius); //printing Circumfrence
        System.out.printf("Area = %.3f\n", PI*radius*radius); //printing area
     
    }
    
}
