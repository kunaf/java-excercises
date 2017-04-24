/*
 * (Hypotenuse Calculations) Define a method hypotenuse that calculates the hypotenuse of
a right triangle when the lengths of the other two sides are given. The method should take two ar-
guments of type double and return the hypotenuse as a double . Incorporate this method into an
application that reads values for side1 and side2 and performs the calculation with the hypotenuse
method. Use Math methods pow and sqrt to determine the length of the hypotenuse for each of the
triangles in Fig. 6.15. [Note: Class Math also provides method hypot to perform this calculation.]
 */
package chapter6;
import java.util.Scanner;
/**
 * @author kuna
 */
public class Hypotnuse {
    public static double Hypotenuse(double side1, double side2) {
        double hypo = Math.sqrt((Math.pow(side1, 2)) + (Math.pow(side2, 2)));
        return hypo;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter values for side1 and side2 of triangle respectively");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        
        double hyp = Hypotenuse(side1,side2);
        System.out.printf("%.2f\n", hyp);
    }
    
}
