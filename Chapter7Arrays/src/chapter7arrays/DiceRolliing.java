/*
 * (Dice Rolling) Write an application to simulate the rolling of two dice. The application
should use an object of class Random once to roll the first die and again to roll the second die. The
sum of the two values should then be calculated. Each die can show an integer value from 1 to 6, so
the sum of the values will vary from 2 to 12, with 7 being the most frequent sum, and 2 and 12 the
least frequent. Figure 7.28 shows the 36 possible combinations of the two dice. Your application
should roll the dice 36,000,000 times. Use a one-dimensional array to tally the number of times
each possible sum appears. Display the results in tabular format.
 */
package chapter7arrays;
import java.security.SecureRandom;

/**
 * @author kuna
 */
public class DiceRolliing {
   
    public static void main(String[] args) {
        //object creation
        SecureRandom random = new SecureRandom();
        //array declaration
        int[] sum = {0,0,0,0,0,0,0,0,0,0,}, tally = new int[12];
        //filiing the array containing the sum of 2 die rolls
        for(int i=0;i<sum.length;i++) {
            int die1 = 1 + random.nextInt(6);
            int die2 = 1 + random.nextInt(6);
            //add to array
            sum[i] = die1 + die2;
        }
        
        //display array sum
        for(int i: sum)
            System.out.printf("%d\t", i);
        
        System.out.printf("\n%s%10s\n", "Value", "Tally");
        
        //searches array sum for similar values and calculates the tally
        for(int i=0;i<sum.length;i++) {
           
                for(int match = 0;match < sum.length-1;match++) {
                    int check = 0;
                    if(sum[i] == sum[match]) { 
                        check += 1;
                        tally[i] += check;
                    }
                }       
            System.out.printf("%d%10d\n", i+1, tally[i]);
        }
       
    }
    
}
