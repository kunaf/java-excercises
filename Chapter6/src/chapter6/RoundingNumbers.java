/*
 *(Rounding Numbers) Math.floor can be used to round values to the nearest integer—e.g.,
y = Math.floor(x + 0.5);
will round the number x to the nearest integer and assign the result to y . Write an application that
reads double values and uses the preceding statement to round each of the numbers to the nearest
integer. For each number processed, display both the original number and the rounded number.
 */
package chapter6;

/**
 * @author kuna
 */
public class RoundingNumbers {

    public static void main(String[] args) {
        
        double number = -45.7;
        
        double num = Math.floor(number + 0.5);
        
        System.out.printf("%.2f %.0f\n",number,num);
    }
    
}
