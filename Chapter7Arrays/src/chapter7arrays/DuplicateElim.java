/*
 * (Duplicate Elimination) Use a one-dimensional array to solve the following problem:
Write an application that inputs five numbers, each between 10 and 100, inclusive. As each number
is read, display it only if it’s not a duplicate of a number already read. Provide for the “worst case,”
in which all five numbers are different. Use the smallest possible array to solve this problem. Display
the complete set of unique values input after the user enters each new value.
 */
package chapter7arrays;
import java.util.Scanner;
/**
 * @author kuna
 */
public class DuplicateElim {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//create new Scanner object
        //array stores numbers entered by users
        int[] number = new int[5];
        boolean check = false;
        System.out.println("Enter 5 two digit numbers.");
        
        //reads value entered by user and stores it in array if it is not a duplicate
        for(int i=0;i<number.length;i++) {
            int val = input.nextInt(); //gets two digit number from user
            
            //loop checks that the number entered is a two digit number
            while(val < 10 || val > 100) {
                System.out.println("Enter two digit number");
                val = input.nextInt(); //gets two digit number from user
            }
            
             number[i] = val; //assigns value entered to position in the array
            //tests if number already exists in the array
            for(int j=0;j<i;j++) {  
                if(number[j] == val) {
                    number[i] = 0;
                    break;
                    
                }
                //System.out.print("val = " + number[j]); //keep track of numbers entered
            }
           
        }       
        System.out.println();
        
        //prints numbers entered without duplicates
        for(int p=0;p<number.length;p++) {
            if(number[p] != 0 )
                System.out.print( number[p] + "\t");
        }
        
    }
    
}
