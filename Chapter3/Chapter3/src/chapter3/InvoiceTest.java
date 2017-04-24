/*
 * Author: Kuna Fomboh
 * Date: 4/4/17
 */
package chapter3;

import java.util.Scanner;

public class InvoiceTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //initailizing Invoice constructor
        Invoice invoice = new Invoice(" ", " ", 0, 0.0);
        
        System.out.println("Enter the part number: "); //prompt
        String partNumber = input.next();
        invoice.setPartNumber(partNumber);//stores input in variable part number by calling set method
        System.out.println("Enter Part Description: "); //prompt
        String partDescrip = input.next();
        invoice.setPartDescrip(partDescrip);//stores input in variable part description by calling set method
        System.out.println("Enter Quantity per Item: ");//prompt
        int quantity = input.nextInt();
        invoice.setQuantity(quantity);//stores input in variable quantity by calling set method
        System.out.println("Enter Price per item: ");//prompt
        double price = input.nextDouble();
        invoice.setPrice(price);//stores input in variable price by calling set method
       
        System.out.printf("Part Number: %s\nPart Description: %s\nQuantity: %d\nPrice: %.2f\n",invoice.getPartNumber(), invoice.getPartDescrip(), invoice.getQuantity(), invoice.getPrice() );
        //calculates total cost for items using getInvoice amount method
        System.out.printf("Total Cost: %.2f",invoice.getInvoiceAmount(quantity, price) );
        
    }
    
}
