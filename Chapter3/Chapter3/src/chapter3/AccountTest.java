/*
 *Purpose: This is Account class with a double instance variable balance and a constructor
            and deposit method that perform validation.
 * Author: Kuna Fomboh
 * Date: 4/4/17
 */
package chapter3;

import java.util.Scanner;

public class AccountTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Account account = new Account(" ", 0);
        
        System.out.println("Enter your name: ");
        String name = input.next();
        account.setName(name);
        System.out.printf("Your account balance is %.2f\n", account.getBalance());
        
        System.out.println("Enter amount to deposit in your account: ");//prompt
        double deposit = input.nextDouble(); //amount to deposit in the account
        account.depositAmount(deposit); //add to account's balance
        
        System.out.printf("Your new balance is: %.3f\n", account.getBalance()); //print new balance
        
        System.out.println("Enter amount you wish to withdraw: ");
        double withdraw = input.nextDouble();
        account.withdrawn(withdraw);
        
        System.out.printf("Your new balance is: %.3f\n", account.getBalance()); //print new balance

        
    }
    
}
