/*
 * (Factorials) Factorials are used frequently in probability problems. The factorial of a positive
integer n (written n! and pronounced “n factorial”) is equal to the product of the positive integers from
1 to n. Write an application that calculates the factorials of 1 through 20. Use type long . Display the
results in tabular format. What difficulty might prevent you from calculating the factorial of 100?
 */
package chapter5;
import java.util.Scanner; 

public class Factorial {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       
        long factorial = 1;
        //System.out.println("Enter the value for which you want to calculate the factorial: ");
        //n = input.nextInt();
        
            System.out.printf("%s%20s\n","Number","Factorial");
            for(int n=1;n<10;n++) {
            if(n == 0)
                factorial = 1;
            
            factorial *= n;
            System.out.printf(" %d%20d\n", n, factorial);

        }
                
        
       
    }
    
}
