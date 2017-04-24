/*
 * (Temperature Conversions) Implement the following integer methods:
a) Method ce
lsius returns the Celsius equivalent of a Fahrenheit temperature, using the
calculation
celsius = 5.0 / 9.0 * (fahrenheit - 32);
b) Method fahrenheit returns the Fahrenheit equivalent of a Celsius temperature, using
the calculation
fahrenheit = 9.0 / 5.0 * celsius + 32;
c) Use the methods from parts (a) and (b) to write an application that enables the user ei-
ther to enter a Fahrenheit temperature and display the Celsius equivalent or to enter a
Celsius temperature and display the Fahrenheit equivalent.
 */
package chapter6;
import java.util.Scanner;
/**
 * @author kuna
 */
public class TemperatureConversion {
    public static int celcuis(int temp){
        int result = (int) 5.0 / 90*(temp -32);
        return result;
    }
    public static int fahrenheit(int temp) {
        int result = (int)(9.0/ 5.0)*temp + 32;
        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter one of the integers below");
        System.out.println("Convert Temperature from: ");
        System.out.println("1. Celcius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celcius");
        
        int choice = input.nextInt();
        System.out.println("Enter temperature to convert");
        int temp = input.nextInt();
        if(choice == 1) {
            int fah = fahrenheit(temp);
            System.out.printf("%d degrees celcuis is %d degrees fahrenheit\n", temp, fah);
        }
        
        else if(choice == 2) {
            int cel = celcuis(temp);
            System.out.printf("%d degrees fahrenheit is %d degrees celcuis\n", temp, cel);
        }
        
        
        
        
    }
    
}
