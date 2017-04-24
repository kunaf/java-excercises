/*
 * (Calculating the Product of Odd Integers) Write an application that calculates the product
of the odd integers from 1 to 15.
 */
package chapter5;

public class ProdOddInt {

    public static void main(String[] args) {
        int product = 1;
        for(int i=1, p=1; i<=15; i++) {
            if(p%2 != 0){
                product *= p;
            }
            p++;
        }
        System.out.printf("Product: %d\n", product);
            
    }
    
}
