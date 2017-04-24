/*
 * (Bar Chart Printing Program) One interesting application of computers is to display
graphs and bar charts. Write an application that reads five numbers between 1 and 30. For each
number that’s read, your program should display the same number of adjacent asterisks. For exam-
ple, if your program reads the number 7, it should display ******* . Display the bars of asterisks after
you read all five numbers.
 */
package chapter5;
import java.util.Scanner;
/**
 *
 * @author kuna
 */
public class BarChart {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter 5 numberes between 1 and 30: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();
        
        for(int i=0;i<num1;i++) {
            System.out.print("*");
        }
        System.out.println(" ");
        
        for(int i=0;i<num2;i++) {
            System.out.print("*");
        }
        System.out.println(" ");
        
        for(int i=0;i<num3;i++) {
            System.out.print("*");
        }
        System.out.println(" ");
        
        for(int i=0;i<num4;i++) {
            System.out.print("*");
        }
        System.out.println(" ");
        
        for(int i=0;i<num5;i++) {
            System.out.print("*");
        }
        System.out.println(" ");
    }
    
}
