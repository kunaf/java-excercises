/*
 * Write an application that prints the following diamond
shape. You may use output statements that print a single asterisk ( * ), a single space or a single new-
line character. Maximize your use of repetition (with nested for statements), and minimize the
number of output statements.
 */
package chapter5;

/**
 *
 * @author kuna
 */
public class Diamond {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        for(int i=0;i<5;i++) {
            for(int j=0;j<9;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
            
    }
    
}
