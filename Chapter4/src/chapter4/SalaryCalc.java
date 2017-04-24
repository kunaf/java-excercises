/*
 * Develop a Java application that determines the gross pay for each of
three employees. The company pays straight time for the first 40 hours worked by each employee
and time and a half for all hours worked in excess of 40. You’re given a list of the employees, their
number of hours worked last week and their hourly rates. Your program should input this informa-
tion for each employee, then determine and display the employee’s gross pay. Use class Scanner to
input the data.
 */
package chapter4;

import java.util.Scanner;
public class SalaryCalc {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        for(int i=0;i<3;i++) {
            System.out.println("Enter Employee Name: ");
            String name = input.next();
            System.out.println("Enter number of hours worked by employee : ");
            int hours = input.nextInt();
            System.out.println("Enter hourly Rates: ");
            int rates = input.nextInt();
            double grossPay;
            if(hours > 40)
                grossPay = (hours * rates)+((hours-40)/2 * rates); 
            else
                grossPay = hours * rates;
            
            System.out.printf("Gross Pay = %.2f\n", grossPay);

        }
    }
    
}
