/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4;

import java.util.Scanner;

public class TwoLargest {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
        int number, largest1 = 0, largest2 = 0;
        System.out.println("Enter 10 integers");
        for(int i=0;i<10;i++){
            number = input.nextInt();
            if(number > largest1)
                largest1 = number;
            else if(number < largest1 && number > largest2)
                largest2 = number;
        }
        
        System.out.printf("Largest integer: %d\n", largest1);
        System.out.printf("Second Largest integer: %d\n", largest2);

    
    }
    
}
