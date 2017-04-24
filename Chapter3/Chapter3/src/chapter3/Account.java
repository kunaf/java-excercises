/*
 *Purpose: This is Account class with a double instance variable balance and a constructor
            and deposit method that perform validation.
 * Author: Kuna Fomboh
 * Date: 4/4/17
 */
package chapter3;

public class Account {
    private String name;//instance variable
    private double balance;//instance variable
    
    //account coonstructor that recieves two parameters
    public Account(String name, double balance) {
        this.name = name; //assign name to instance variable name
        
        //checks to make sure balance is greater than or eual to 0
        if(balance < 0.0) //if valid balance
            this.balance = balance;
    }
    
    //method deposit adds amount to bank
    public void depositAmount(double depositamt){
        if(depositamt > 0.0) //is deposit amount valid?
            balance = balance + depositamt; //add amount to balance
    }
    //method withdraw, reduces amount from account
     public void withdrawn(double amount) {
        if( amount > 0.0 && amount <= balance) 
           balance = balance - amount ;
        else System.out.println("Withdrawal amount exceeded account balance");
    }
    
    //return account balance
    public double getBalance() {
        return balance;
}
    //method sets the name
    public void setName(String name) {
        this.name = name;
    }
    //method returns name
    public String getName() {
        return name;
    }
    
   
}
