/*
 *(Credit Limit Calculator) Develop a Java application that determines whether any of several
department-store customers has exceeded the credit limit on a charge account. For each customer,
the following facts are available:
a) account number
b) balance at the beginning of the month
c) total of all items charged by the customer this month
d) total of all credits applied to the customer’s account this month
e) allowed credit limit.
The program should input all these facts as integers, calculate the new balance (= beginning balance
+ charges – credits), display the new balance and determine whether the new balance exceeds the
customer’s credit limit. For those customers whose credit limit is exceeded, the program should dis-
play the message "Credit limit exceeded" .
 * Author: Kuna Fomboh
 * Date: 4/4/17
 */
package chapter4;
import java.util.Scanner;

public class CreditLimCalc {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //declare variables account number, balance at begginning of month, total of items charged by customer,
        //total credits applied to customer and and credit limit for the month.
        int accNum, begBal, charges, credit, creditLim;
        
        //prompt user for values to variables
        System.out.println("Enter Customer's account number: ");
        accNum = input.nextInt();
        System.out.println("Enter balance at the beginnning of the month: ");
        begBal = input.nextInt();
        System.out.println("Enter total of all items charged by the customer this month: ");
        charges = input.nextInt();
        System.out.println("Enter the total of all credits applied to customer's account this month: ");
        credit = input.nextInt();
        System.out.println("Allowed credit limit: ");
        creditLim = input.nextInt();
        
        //compute new balance
        int newBal = begBal + charges - credit;
        
        System.out.printf("Your new balance is %d\n", newBal); //print new balance
        //determine if customer exceeded credit limit by cheking if the value for new balance is greater than the credit limit
        if(newBal > creditLim) 
            System.out.println("Credit Limit Exceeded!\n");
    }
    
}
