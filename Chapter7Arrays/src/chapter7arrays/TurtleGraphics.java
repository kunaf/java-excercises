/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7arrays;
import java.util.Scanner;
/**
 *
 * @author kuna
 */
public class TurtleGraphics {
    public static boolean penUp() {
      return true;
    }
    public static boolean penDown() {
        return true;
    }
    public static boolean turnLeft(){
        boolean right = false;
        return true;
    }
    public static boolean turnRight(){
        boolean left = false;
        return true;
    }
     public static void printArray(char[][] turtle) {
        for(int i=0;i<20;i++){
            for(int j=0;j<20;j++) {
                System.out.print(turtle[i][j]);
            }
            System.out.println();
        }
    }
    public static void moveSteps(int steps, char[][] turtle) {
       
        
        int j=0, i = 0;
        if(turnLeft() == true) {
            for(;j<steps-1;j++) {
                turtle[i][j] = '*';
            }
        }
        
        if(turnRight() == true && (j>0 && i == 0)) {
            for(;i<steps;i++) {
                turtle[i][j] = '*';
            }
        }
        
        if(turnRight() == true && (j>0 && i>0)) {
            for(;j>=0;j--) {
                turtle[i][j] = '*';
            }
        }
        
        if(turnRight() == true && (j == 0 && i>0)) {
            for(;i>=0;i--) {
                turtle[i][j] = '*';
            }
        }
    }
    public static void selectCommand(int command) {
        char[][] turtle = new char[20][20];
        switch(command) {
            case 1: 
                penUp();
                break;
            case 2:
                penDown();
                break;
            case 3:
                turnRight();
                break;
            case 4: 
                turnLeft();
                break;
            case 5:
                Scanner input = new Scanner(System.in);
                System.out.println("Enter number of steps to move");
                int steps = input.nextInt();
                moveSteps(steps, turtle);
                break;
            case 6: 
                printArray(turtle);
                break;
            case 9:
                break;
        }
    }
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[][] turtle = new int[20][20];
        int command = 0;
        boolean write = false, right = false, left = false;
        
        System.out.println("Turtle Graphics Command list");
        System.out.println("1. Pen down");
        System.out.println("2. Pen up");
        System.out.println("3. Turn Right");
        System.out.println("4. Turn Left");
        System.out.println("5,10. Move forward 10 spaces (replace 10 for a different number of spaces)");
        System.out.println("6. Display the 20-by-20 array");
        System.out.println("9. End of data (sentinel)");
        System.out.println("Enter list of commands.");
       
       
        
    }
    
}
