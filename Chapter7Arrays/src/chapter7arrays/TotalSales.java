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
public class TotalSales {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       int [] salesPerson = new int[20];
       int[][] table = new int[5][4];
       int[] item = new int[20];
       int[] value = new int[20];
       int pdtValue, count = 0;
       
        for(int i = 0; i < 20; i++){
           
            System.out.println("Enter values in your pay slip.");
            System.out.println("Sales Person ID(1,2,3,4): ");
            salesPerson[i] = input.nextInt();
            System.out.println("Product ID(1,2,3,4,5): ");
            item[i] = input.nextInt();
            System.out.println("Product value: ");
            value[i] = input.nextInt();
            
            System.out.println("Enter 1 to terminate 0 to continue");
            count = input.nextInt();
            if(count == 1)
                break;
       }
        
        for(int i=0;i<5;i++){
            for(int j=0;j<4;j++){
                table[item[i]][salesPerson[j]] = value[j];
            }
        }
        
         for(int i=0;i<5;i++){
            for(int j=0;j<4;j++){
                System.out.print(table[i][j] + "\t");
            }
             System.out.println();
        }
        
        
        
        
        
        
       
    }
    
}
