/*
 *(Prime Numbers) A positive integer is prime if it’s divisible by only 1 and itself. For example,
2, 3, 5 and 7 are prime, but 4, 6, 8 and 9 are not. The number 1, by definition, is not prime.
a) Write a method that determines whether a number is prime.
b) Use this method in an application that determines and displays all the prime numbers
less than 10,000. How many numbers up to 10,000 do you have to test to ensure that
you’ve found all the primes?
c) Initially, you might think that n/2 is the upper limit for which you must test to see
whether a number n is prime, but you need only go as high as the square root of n. Re-
write the program, and run it both ways.
 */
package chapter6;

/**
 * @author kuna
 */
public class PrimeNumber {
    public static boolean isPrime(int number) {
        boolean check = true;
        if(number == 1)
            check = false;
        else {
            for(int i=2;i<=Math.sqrt(number);i++) {
                if(number%i==0) 
                    check = false;             
            }
        }
        return check;
    }
    public static void main(String[] args) {
        
        for(int i=2;i<10000;i++) {
            if(isPrime(i) == true) 
                System.out.println(i);
        }
    }
    
}
