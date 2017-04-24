/*
 * Purpose: This program helps calculate a users daily driving cost
 * Author: Kuna Fomboh
 * Date: 4/4/17
 */
package Chapter1;

import java.util.Scanner;

public class CPSCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in); 
       
        System.out.println("Enter the total miles driven per day: ");
        double miles = input.nextDouble();
        System.out.println("Enter the cost per gallon of gasoline: ");
        double gasoline = input.nextDouble();
        System.out.println("Enter the average of miles covered per gallon: ");
        double averagemiles = input.nextInt();
        System.out.println("Enter cost of parking fees per day: ");
        double parking = input.nextDouble();
        System.out.println("Enter number of tolls per day: "); 
        int tolls = input.nextInt();
       

    }
    
}
