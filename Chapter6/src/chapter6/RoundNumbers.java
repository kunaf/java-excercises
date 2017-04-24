/*
 * (Rounding Numbers) T o round numbers to specific decimal places, use a statement like
y = Math.floor(x * 10 + 0.5) / 10;
which rounds x to the tenths position (i.e., the first position to the right of the decimal point), or
y = Math.floor(x * 100 + 0.5) / 100;
which rounds x to the hundredths position (i.e., the second position to the right of the decimal
point). Write an application that defines four methods for rounding a number x in various ways:
a) roundToInteger(number)
b) roundToTenths(number)
c) roundToHundredths(number)
d) roundToThousandths(number)
For each value read, your program should display the original value, the number rounded to the
nearest integer, the number rounded to the nearest tenth, the number rounded to the nearest hun-
dredth and the number rounded to the nearest thousandth.
 */
package chapter6;
import java.util.Scanner;
/**
 * @author kuna
 */
public class RoundNumbers {
    //instance variable declaration 
    private double number;
    //constructor
    public RoundNumbers(int number) {
        this.number = number;
    }
    //method to round number to integer
    public double roundToInteger(double number) {
        this.number = Math.floor(number + 0.5);
        return this.number;
    }
    //method to round number to nearest tens
    public double roundToTenths(double number) {
        this.number = Math.floor(number * 10 + 0.5)/10;
        return this.number;
    }
    //method to round number to nearest hundredth
     public double roundToHundredths(double number) {
        this.number = Math.floor(number * 100 + 0.5)/100;
        return this.number;
    }
     //method to round number to nearest thousand
     public double roundToThousandths(double number) {
        this.number = Math.floor(number * 1000 + 0.5)/1000;
        return this.number;
    }
   
    public static void main(String[] args) {
        
        RoundNumbers round = new RoundNumbers(0);
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a floating point number:");
        
        double number = input.nextDouble();
        
        int integ = (int)round.roundToInteger(number);
        double tens = round.roundToTenths(number);
        double huns = round.roundToHundredths(number);
        double thous = round.roundToThousandths(number);
        
        System.out.printf("%s %20s %15s %20s %20s", "Number", "As Integer", "Tenths", "Hundredths", "Thousandths\n");
        
        System.out.printf("%.4f %15d %20.4f %18.4f %18.4f\n", number, integ,  tens, huns, thous);
    }
    
}
