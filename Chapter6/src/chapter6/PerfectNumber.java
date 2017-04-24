
/*
 * (Perfect Numbers) An integer number is said to be a perfect number if its factors, including
1 (but not the number itself), sum to the number. For example, 6 is a perfect number, because 6 =
1 + 2 + 3. Write a method isPerfect that determines whether parameter number is a perfect number.
Use this method in an application that displays all the perfect numbers between 1 and 1000. Display
the factors of each perfect number to confirm that the number is indeed perfect. Challenge the com-
puting power of your computer by testing numbers much larger than 1000. Display the results.
 */
package chapter6;
/**
 * @author kuna
 */
public class PerfectNumber {
    public static boolean isPerfect(int number){
        boolean check = false; int result = 0;
        for(int i=1;i<number;i++){
            if(number%i==0)
                result += i;
        }
        if(result == number)
            check = true;
        return check;
    }
    public static void main(String[] args) {
        System.out.printf("%s%20s\n", "Number", "Factors");
       
        for(int i=1;i<100000;i++){
            if(isPerfect(i)==true) {
                System.out.printf("%d                  ",i);
                for(int j=1;j<i;j++){
                    if(i%j==0)
                        System.out.printf("%d, ", j);
                }
            System.out.println("");
            }
        }
    }
    
}
