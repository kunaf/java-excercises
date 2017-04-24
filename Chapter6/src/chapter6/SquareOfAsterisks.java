/*
 * (Displaying a Square of Asterisks) Write a method squareOfAsterisks that displays a solid
square (the same number of rows and columns) of asterisks whose side is specified in integer param-
eter side . For example, if side is 4 , the method should display
****
****
****
****
Incorporate this method into an application that reads an integer value for side from the user and
outputs the asterisks with the squareOfAsterisks method.

(Displaying a Square of Any Character) Modify the method created in Exercise 6.18 to re-
ceive a second parameter of type char called fillCharacter . Form the square using the char pro-
vided as an argument. Thus, if side is 5 and fillCharacter is # , the method should display
#####
#####
#####
#####
#####
Use the following statement (in which input is a Scanner object) to read a character from the user
at the keyboard:
char fill = input.next().charAt(0);
 */
package chapter6;
import java.util.Scanner;
/**
 *
 * @author kuna
 */
public class SquareOfAsterisks {
    public static void squareOfAsterisks(int side) {
        for(int i=0;i<side;i++){
            for(int j=0;j<side;j++)
                System.out.print("*");
            System.out.println("");
        }
    }
    public static void charOfAsterisks(int side, String fill) {
        for(int i=0;i<side;i++){
            for(int j=0;j<side;j++)
                System.out.print(fill);
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter value pair:(side , character fill)");
        int side = input.nextInt();
        String fill = input.next();
        
        //squareOfAsterisks(side);
        
        charOfAsterisks(side, fill);
    }
    
}
