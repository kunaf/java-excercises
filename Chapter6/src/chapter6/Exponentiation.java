/*
 *(Exponentiation) Write a method integerPower(base, exponent) that returns the value of
base exponent
For example, integerPower(3, 4) calculates 3 4 (or 3 * 3 * 3 * 3 ). Assume that exponent is a posi-
tive, nonzero integer and that base is an integer. Use a for or while statement to control the calcu-
lation. Do not use any Math class methods. Incorporate this method into an application that reads
integer values for base and exponent and performs the calculation with the integerPower method.
 */
package chapter6;

/**
 * @author kuna
 */
public class Exponentiation {
    //method instance variables
    private int base;
    private int exponent;
    //constructor
    public Exponentiation(int base, int exponent) {
        this.base = base;
        this.exponent = exponent;
    }
    //method returns the value of base exponent
    public int integerPower(int base, int exponent) {
        int result = 1;
        for(int i=0;i<exponent;i++) 
            result *= base;
        return result;
    }
    public static void main(String[] args) {
        
        Exponentiation expo = new Exponentiation(0,0);
        
        int base = 2, exponent = 10;
        
        int answer = expo.integerPower(base, exponent);
        
        System.out.printf("%d\n", answer);
    }
    
}
