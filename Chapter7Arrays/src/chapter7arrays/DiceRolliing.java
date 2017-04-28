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
        int[] sum = {2,3,4,5,6,7,8,9,10,11,12}, tally = new int[12];
        int total;
        System.out.printf("\n%s%10s\n","Sum", "Tally");
        //filiing the array containing the sum of 2 die rolls
        for(int i=0;i<3600000;i++) {
            int die1 = 1 + random.nextInt(6);
            int die2 = 1 + random.nextInt(6);
            
            total = die1 + die2;
            //add to array
           // sum[i] = die1 + die2;
            
           tally[total - 2] += 1;  
           
        }
        
        for(int i = 0; i < tally.length-1;i++) {
            System.out.printf("%d%12d\n",sum[i], tally[i]);
        }
        
       
    }
    
}
