/*
 *(Sales Commission Calculator) A large company pays its salespeople on a commission basis.
The salespeople receive $200 per week plus 9% of their gross sales for that week. For example, a
salesperson who sells $5,000 worth of merchandise in a week receives $200 plus 9% of $5000, or a
total of $650. You’ve been supplied with a list of the items sold by each salesperson. The values of
these items are as follows:
Item    Value
1       239.99
2       129.75
3       99.95
4       350.89
Develop a Java application that inputs one salesperson’s items sold for last week and calculates and
displays that salesperson’s earnings. There’s no limit to the number of items that can be sold.
 * Author: Kuna Fomboh
 * Date: 4/4/17 To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4;

import java.util.Scanner;
public class SalesComCal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double value; double total = 0;
        System.out.println("Enter the value of item sold terminate with digit 1: ");

        int check = 0;
        while(check==0) {
            value = input.nextDouble();
            if(value == 1)
               check = 1;
            total += value;
            
        }
        double earnings = total * 0.09 + 200 ;
        System.out.printf("Earning: %.2f\n", earnings);
    }
    
}
