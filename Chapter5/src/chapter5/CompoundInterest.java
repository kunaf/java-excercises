/*
 * Modify the application in Fig. 5.6 to use only in-
tegers to calculate the compound interest. [Hint: Treat all monetary amounts as integral numbers
of pennies. Then break the result into its dollars and cents portions by using the division and re-
mainder operations, respectively. Insert a period between the dollars and the cents portions.]
 */
package chapter5;

/**
 *
 * @author kuna
 */
public class CompoundInterest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int amount; // amount on deposit at end of each year
        int principal = 1000; // initial amount before interest
        //double rate = 0.05; // interest rate
        
        // display headers
        System.out.printf("%s %20s %10s %n", "Year", "Amount on deposit", "Rate");
        
        // calculate amount on deposit for each of ten years 
        for (int year = 1; year <= 10; ++year) {
            // calculate new amount for specified year
            for(double rate = 0.05; rate <= 0.1; rate=rate+0.01) {
                // amount = principal * Math.pow(1.0 + rate, year);
                 // display the year and the amount
                // System.out.printf("%4d%20.2f%12.2f%n", year, amount, rate);
            }
           
        }
    }
    
}
