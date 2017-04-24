/*
 * According to CNNMoney.com, Facebook hit one billion us-
ers in October 2012. Using the compound-growth technique you learned in Fig. 5.6 and assuming
its user base grows at a rate of 4% per month, how many months will it take for Facebook to grow
its user base to 1.5 billion users? How many months will it take for Facebook to grow its user base
to two billion users?
 */
package chapter5;

import java.util.Scanner;
public class FBUGrowth {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double rate = 0.04; //growth rate of facebook users
        long initUsers = 1000000000; //number of users in 2012 (starting point)
        long finUsers = 1500000000; //number of users at the end of a certain number months
        
        double n = (initUsers * (1 + rate)) / finUsers;
        
        n = n * 12;
        
        System.out.printf("It will take for %d months for Facebook to grow its user base to 1.5 billion users\n", (int)n);
        
        long finUsers2 = 2000000000;
        double n2 = (initUsers * (1 + rate)) / finUsers2;
        
        System.out.printf("It will take for %d months for Facebook to grow its user base to 2 billion users\n", (int)n);

    }
    
}
