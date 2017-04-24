/*
 * Author: Kuna Fomboh
 * Date: 4/4/17 
 */
package chapter3;

/**
 *
 * @author Kuna
 */
public class Invoice {
    //instance variable declaration for cllass invoice
    private String partNumber;
    private String partDescrip;
    private int quantity;
    private double price;
    
//initializing constructor for class invoice
    public Invoice(String partNumber, String partDescrip, int quantity, double price) {
        this.partNumber = partNumber;
        this.partDescrip = partDescrip;
        this.quantity = quantity;
        this.price = price;
              
    }
    //method gets part number
    public String getPartNumber() {
        return partNumber;
    }
    //method sets part number
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }
    //method gets part description
    public String getPartDescrip(){
        return partDescrip;
    }
    //method sets part description
    public void setPartDescrip(String partDescrip) {
        this.partDescrip = partDescrip;
    }
    //method gets quantity of items being purchased
    public int getQuantity() {
        return quantity;
    }
    //method sets quantitty of items being purchased
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    //method gets price per item
    public double getPrice() {
        return price;
    }
    //method sets price per item
    public void setPrice(double price) {
        this.price = price;
    }
    //method calculates the invoice amount i.e multiplies the quantity by the price per item
    public double getInvoiceAmount(int quantity, double price) {
        if(quantity < 0)
            quantity = 0;
        if(price < 0.0)
            price = 0.0;
        return quantity * price;
    }
    
}
