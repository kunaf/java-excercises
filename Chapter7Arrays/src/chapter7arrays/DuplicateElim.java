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
        
        System.out.println("Enter 5 two digit numbers.");
        
        //reads value entered by user and stores it in array if it is no a duplicate
        for(int i=0;i<number.length;i++) {
            int val = input.nextInt();
            if(i == 0)
                number[i] = val;
            else {
                for(int j=0;j<i;j++)
                    if(number[i-1] != val){
                        number[i] = val;
                       System.out.print(number[i]);
                    }
            }
                
        }
        System.out.println();
        
        for(int i=0;i<number.length;i++) {
            System.out.println(number[i]);
        }
        
    }
    
}
