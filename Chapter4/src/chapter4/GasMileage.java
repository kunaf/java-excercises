/*
 * Drivers are concerned with the mileage their automobiles get. One driver has
kept track of several trips by recording the miles driven and gallons used for each tankful. Develop
a Java application that will input the miles driven and gallons used (both as integers) for each trip.
The program should calculate and display the miles per gallon obtained for each trip and print the
combined miles per gallon obtained for all trips up to this point. All averaging calculations should
produce floating-point results. Use class Scanner and sentinel-controlled repetition to obtain the
data from the user.
 * Author: Kuna Fomboh
 * Date: 4/4/17
 */
package chapter4;

import java.util.Scanner;
/**
 *
 * @author kuna
 */
public class GasMileage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int end = 0; // sentinel 
        double total = 0.0; //sum of miles per gallon for all trips
        
        //sentinel controlled repetition to get data from user
        while(end == 0) {
            System.out.println("Enter the number of miles driven:  ");  //prompt
            int miles = input.nextInt(); //gets the number of miles
            System.out.println("Enter the number of gallons used for each tankful: ");
            int gallons = input.nextInt();
            
            double average; // variable stores the miles per gallon
            average = (double)miles/gallons; //calculation of miles [er gallon
            System.out.printf("Miles per gallon: %.2f\n", average); // prints the miles the miles per gallon
              
            total += average; //variable stores the total miles per gallon for all trips
            //checks the sentinel value
            System.out.println("press 0 to enter more info.\npress 1 to stop.");
            end = input.nextInt();
           
        }
        //printing total miles per gallon for all trips
        System.out.printf("Miles per gallon for all trips: %.2f\n\n", total);
        
        
        

    }
    
}
