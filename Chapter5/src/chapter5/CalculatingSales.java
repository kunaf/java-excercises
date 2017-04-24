/*
 *An online retailer sells five products whose retail prices are as follows:
Product 1, $2.98; product 2, $4.50; product 3, $9.98; product 4, $4.49 and product 5, $6.87.
Write an application that reads a series of pairs of numbers as follows:
a) product number
b) quantity sold
Your program should use a switch statement to determine the retail price for each product. It
should calculate and display the total retail value of all products sold. Use a sentinel-controlled
loop to determine when the program should stop looping and display the final results.
 */
package chapter5;
import java.util.Scanner;
public class CalculatingSales {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int productNo = 1, qtySold;
        double retailPrice;
        double product1 = 0, product2 = 0, product3 = 0, product4 = 0, product5 = 0;
        
        while(productNo != 0) {
            System.out.println("Enter the Product Number: ");
            productNo = input.nextInt();
            System.out.println("Enter the quantity sold: ");
            qtySold = input.nextInt();
            switch(productNo) {
                case 1: 
                    product1 = qtySold * 2.98;
                    break;
                case 2: 
                    product2 = qtySold * 4.50;
                    break;
                case 3: 
                    product3 = qtySold * 9.98;
                    break;
                case 4: 
                    product4 = qtySold * 4.49;
                    break;
                case 5:
                    product5 = qtySold * 6.87;
            }
            
        }
        
        System.out.println("Total retail value for all items sold: ");
        System.out.printf("Product 1: $%.2f\n", product1);
        System.out.printf("Product 2: $%.2f\n", product2);
        System.out.printf("Product 3: $%.2f\n", product3);
        System.out.printf("Product 4: $%.2f\n", product4);
        System.out.printf("Product 5: $%.2f\n", product5);
        
    }
    
}
