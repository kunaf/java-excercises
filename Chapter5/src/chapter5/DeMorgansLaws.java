/*
 * In this chapter, we discussed the logical operators && , & , || , | , ^ and ! .
De Morgan’s laws can sometimes make it more convenient for us to express a logical expression.
These laws state that the expression !( condition1 && condition2 ) is logically equivalent to the expres-
sion (! condition1 || ! condition2 ) . Also, the expression !( condition1 || condition2 ) is logically
equivalent to the expression (! condition1 && ! condition2 ) . Use De Morgan’s laws to write equivalent
expressions for each of the following, then write an application to show that both the original ex-
pression and the new expression in each case produce the same value:
a) !(x < 5) && !(y >= 7)
b) !(a == b) || !(g != 5)
c) !((x <= 8) && (y > 4))
d) !((i > 4) || (j <= 6))
 */
package chapter5;
import java.util.Scanner;
/**
 *
 * @author kuna
 */
public class DeMorgansLaws {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 1, y = 3, a = 4, b = 10, g = 6, i = 1, j = 2;
        String result1="false", result2="false";
        
        //check first condition
        if((!(x < 5) && !(y <= 7)) == (!((x < 5) || (y >=7 )))) {
            result1 = "true";  
            System.out.println("(!(x < 5) && !(y <= 7)) = (!((x < 5) || (y >=7 )))");
        }
    
        //check second condition 
        if((!((x <= 8) && (y > 4))) == (!(x <= 8) || !(y > 4))) 
            System.out.println("(!((x <= 8) && (y > 4))) = (!(x <= 8) || !(y > 4))");
       
        
        //checks third condition
        if((!(a == b) || !(g != 5)) == (!((a == b) && (g != 5)))) {
            System.out.println("(!(a == b) || !(g != 5)) = (!((a == b) && (g != 5)))");
        }
       
        //checks fourth condition
        if((!((i > 4) || (j <= 6))) == (!(i > 4) && !(j <= 6)))
            System.out.println("(!((i > 4) || (j <= 6))) = (!(i > 4) && (j <= 6))");
        
    }
    
}


 /*System.out.println("Enter values for x and y");
        x = input.nextInt();
        y = input.nextInt();
        
        System.out.println("Enter values for a, b and g");
        int a = input.nextInt();
        int b = input.nextInt();
        int g = input.nextInt();
        
        System.out.println("Enter values for i and j");
        int i = input.nextInt();
        int j = input.nextInt();
        */