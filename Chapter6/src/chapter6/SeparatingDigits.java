/*
 * (Separating Digits) Write methods that accomplish each of the following tasks:
a) Calculate the integer part of the quotient when integer a is divided by integer b .
b) Calculate the integer remainder when integer a is divided by integer b .240

c) Use the methods developed in parts (a) and (b) to write a method displayDigits that
receives an integer between 1 and 99999 and displays it as a sequence of digits, separating
each pair of digits by two spaces. For example, the integer 4562 should appear as
4  5  6  2
Incorporate the methods into an application that inputs an integer and calls display-
Digits by passing the method the integer entered. Display the results.
 */
package chapter6;
    import java.util.Scanner;
/**
 *
 * @author kuna
 */
public class SeparatingDigits {

   public static int partQuotient(int a) {
       int result = 0;
       if(a>0 && a<10) 
           result = a;
       else if(a>=10 && a<100)
           result = a/10;
       else if(a>=100 && a<1000)
           result = a/100;
       else if(a>=1000 && a<10000)
            result = a/1000;
       else if(a>=10000 && a<100000)
           result = a/10000;
       
       return result;
   }
   
   public static int partRemainder(int b){
       int result = 0;
       if(b>0 && b<10) 
           result = b;
       else if(b>=10 && b<100)
           result = b%10;
       else if(b>=100 && b<1000)
           result = b%100;
       else if(b>=1000 && b<10000)
            result = b%1000;
       else if(b>=10000 && b<100000)
           result = b%10000;
       return result;
   }
   
   public static void displayDigits(int number) {
        int digit1,digit2,digit3,digit4,digit5;
       
        digit1 = partQuotient(number);
        digit5 = partRemainder(number);
        
        System.out.println(digit1 + "  " + digit5);
   }
    public static void main(String[] args) {
        System.out.println(partQuotient(partRemainder(partRemainder(345))));
        displayDigits(92498);
        
    }
    
}
