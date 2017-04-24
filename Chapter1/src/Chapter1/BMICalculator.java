/*
 * Purpose: This program calculates the Body Mass Index of a persoon using the following formula
    BMI = weight in Kilograms/ height in meters * heightin meters.
 * Author: Kuna Fomboh
 * Date: 4/4/17
 */
package Chapter1;

import java.util.Scanner;

public class BMICalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your weight in Kilograms: ");
        double weight = input.nextDouble();
        System.out.println("Enter your height in Metres: ");
        double height = input.nextDouble();
        
        double bmi = weight/(height*height);
        
        System.out.printf("Your Body Mass Index is: %.1f\n\n", bmi);
        
        System.out.println("BMI VALUES");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal: between 18.5 and 24.5");
        System.out.println("Overweight: between 25 and 29.9");
        System.out.println("Obese: 30 or greater");
        
    }
    
}
