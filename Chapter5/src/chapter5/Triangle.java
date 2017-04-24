/*
 * (Triangle Printing Program) Write an application that displays the following patterns sep-
arately, one below the other. Use for loops to generate the patterns. All asterisks ( * ) should be print-
ed by a single statement of the form System.out.print('*' ) ; which causes the asterisks to print side
by side. A statement of the form System.out.println(); can be used to move to the next line. A
statement of the form System.out.print(' ' ) ; can be used to display a space for the last two pat-
terns. There should be no other output statements in the program. [Hint: The last two patterns re-
quire that each line begin with an appropriate number of blank spaces.]
 */
package chapter5;

/**
 *
 * @author kuna
 */
public class Triangle {

   
    public static void main(String[] args) {
        
        for(int i=1;i<11;i++) {
            for(int j=0;j<i;j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        
        for(int i=1;i<11;i++){
            for(int j=0;j<11-i;j++) {
                System.out.print("*");
            }
            System.out.println(" ");
            
        }
        //System.out.print(" ");
        
        for(int i=1;i<11;i++) {
            for(int j=0;j<11-i;j++) {
                System.out.print(" ");
            }
            for(int k=0;k<i;k++) {
                System.out.print("*");
            } 
            System.out.println(" ");
        }
        System.out.println(" ");
        
        
        for(int i=1;i<11;i++){
            for(int j=0;j<i;j++) {
                System.out.print(" ");
            }
            for(int k=1;k<11-i;k++) {
                System.out.print("*");
            } 
            System.out.println("*");
        }
    }
    
}
