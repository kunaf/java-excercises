/*
 * (Calculating the Value of π) Calculate the value of π from the infinite series
4 4 4 4 4
π = 4 – --- + --- – --- + --- – ------ + ...
3 5 7 9 11
Print a table that shows the value of π approximated by computing the first 200,000 terms of this
series. How many terms do you have to use before you first get a value that begins with 3.14159? 91679
 */
package chapter5;

/**
 *
 * @author kuna
 */
public class CalcValOfPi {

    public static void main(String[] args) {
        
        float p = 4; //variable holds the value of pi and is initialised to first term
        
        System.out.printf("%s %20s\n", "Term", "Value of Pi");
        System.out.printf("%s %20s\n", "1", "4");
        //i counts the number of terms and n is the denominator in the formula i.e pi = 4/n
        for(int i=2,n=1;i<200000;i++) {
            n += 2; //to make sure the value of n is odd
           
            if(i%2 == 0) { //tests the term whether it is odd or even to determine the sign
                p -= (float)4/n;
            }
            else
               p += (float)4/n;
            System.out.printf("%d %20.5f\n", i, p);
        }
    }
    
}
