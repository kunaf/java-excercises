/*
 * Write an application that finds the smallest of several integers.
Assume that the first value read specifies the number of values to input from the user.
 */
package chapter5;
import java.util.Scanner;

public class SmallestValue {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        System.out.println("Enter the integers: ");
        int number = input.nextInt();
        int smallest = number;
        int count = number;
        for(int i=1;i<count;i++) {
            if(smallest >= number )
                smallest = number;
            number = input.nextInt();
        }
        
        System.out.printf("the smallest numbetr is: %d", smallest);
    }
    
}
