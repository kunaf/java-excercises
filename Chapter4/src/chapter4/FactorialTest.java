/*
 * The factorial of a nonnegative integer n is written as n! (pronounced “n factori-
al”) and is defined as follows:
n! = n · (n – 1) · (n – 2) · ... · 1 (for values of n greater than or equal to 1)
and
n! = 1 (for n = 0)
For example, 5! = 5 · 4 · 3 · 2 · 1, which is 120.
a) Write an application that reads a nonnegative integer and computes and prints its fac-
torial.
b) Write an application that estimates the value of the mathematical constant e by using
the following formula. Allow the user to enter the number of terms to calculate.
1 1 1
e = 1 + ----- + ----- + ----- + ...
1! 2! 3!
c) Write an application that computes the value of ex by using the following formula. Al-
low the user to enter the number of terms to calculate.
2
3
x x x
x
e = 1 + ----- + ----- + ----- + ...
 */
package chapter4;
import java.util.Scanner;
public class FactorialTest {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

	Factorial fact = new Factorial(0);

	System.out.print("How many terms do you want to calculate?: ");
	int terms = input.nextInt();

	//estimateing the value of the mathematical constant e = 1 + 1/1! + 1/2! + 1/3!+ ---
	double e = 1.0;
	for(int i = 1; i < terms; i++) {
            int get = fact.calcFacto(i);
            System.out.printf("i: %d get: %d\n",i, get);

            e += (double) 1/get;
	}

	System.out.printf("the value of e is: %.2f\n",e);


	//estimating the value of the mathematical constant e^X = 1 + x/1! + x^2/2! + x^3/3! + ---
	System.out.print("Enter Exponent: ");
	int exponent = input.nextInt();
	System.out.print("How many terms do you want to calculate?: ");
	terms = input.nextInt();

	double expe = 1.0;
	for(int i = 1; i < terms; i++) {
            int get = fact.calcFacto(i); //variable get calls factorial function and returns the value of the factorial
            System.out.printf("i: %d get: %d\n",i, get);
            expe += (double) exponent/get; 
            exponent *= exponent; 
	}

	System.out.printf("the value of e^x is: %.2f\n",expe);

    }
    
}
