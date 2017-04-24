/*
 * (Parking Charges) A parking garage charges a $2.00 minimum fee to park for up to three
hours. The garage charges an additional $0.50 per hour for each hour or part thereof in excess of three
hours. The maximum charge for any given 24-hour period is $10.00. Assume that no car parks for
longer than 24 hours at a time. Write an application that calculates and displays the parking charges
for each customer who parked in the garage yesterday. You should enter the hours parked for each
customer. The program should display the charge for the current customer and should calculate and
display the running total of yesterday’s receipts. It should use the method calculateCharges to de-
termine the charge for each customer.
 */
package chapter6;
import java.util.Scanner;
/**
 * @author kuna
 */
public class ParkingCharges {
    private int hours;
    
    public ParkingCharges(int hours){
        this.hours = hours;
    }
    
    public double calculateCharges(int hours) {
        double charges = 0;
        if(hours == 3)
            charges = 2.00;
        else if(hours > 3 && hours < 24) {
            int excess = hours - 3;
            charges = 2.00 +(excess * 0.5);
        }
        else if(hours == 24)
            charges = 10;
        return charges;    
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ParkingCharges park = new ParkingCharges(0);
        int count = 0; double charge = 0.0, total = 0; int cus = 1;
        while(count != 1) {
            System.out.printf("Enter the number of hours for customer %d or 1 to terminate\n", cus);
            count = input.nextInt();
            charge = park.calculateCharges(count);
            total += charge;
            System.out.printf("Customer Charges: $%.4f\n", charge);
            cus++;
        }
        System.out.printf("Total Charges: $%.4f\n", total);
        
    }
    
}
