/*
 *(Variable-Length Argument List) Write an application that calculates the product of a series
of integers that are passed to method product using a variable-length argument list. Test your meth-
od with several calls, each with a different number of arguments.
 */
package chapter7arrays;

/**
 * @author kuna
 */
public class VariableLenghtArg {
    public static int productVar(int ... number) {
        int total = 1;
        
        for(int i: number) 
            total *= i;
        return total;
    }
    public static void main(String[] args) {
        
        int i1 = 20, i4 = 2, i5 = 3;
        int i2 = 4;
        int i3 = 5;
        
        System.out.printf("The product of %d, %d and %d is %d\n", i1, i2, i3, productVar(i1, i2, i3));
        System.out.printf("The product of %d, %d, %d and %d is %d\n", i1, i2, i3, i4, productVar(i1, i2, i3, i4));
        System.out.printf("The product of %d, %d, %d, %d and %d is %d\n", i1, i2, i3, i4, i5, productVar(i1, i2, i3, i4, i5));

    }
    
}
