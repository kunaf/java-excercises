/*(Distance Between Points) Write method distance to calculate the distance between two
points (x1, y1) and (x2, y2). All numbers and return values should be of type double . Incorporate
this method into an application that enables the user to enter the coordinates of the points.
 */
package chapter6;
import java.util.Scanner;
/**
 * @author kuna
 */
public class DistanceBetPoints {
    public static double Distance(double x1, double x2, double y1, double y2) {
        return (y2-y1) / (x2-x1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter x-coordinate: ");
        double x1 = input.nextDouble();
        double x2 = input.nextDouble();
        System.out.println("Enter y-coordinate: ");
        double y1 = input.nextDouble();
        double y2 = input.nextDouble();
        
        System.out.print("The distance between these two points is: ");
        System.out.println(Distance(x1,x2,y1,y2));
    }
    
}
