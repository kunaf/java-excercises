/*
 *
 */
package chapter6;
import java.security.SecureRandom;
/**
 * @author kuna
 */
public class Chapter6 {

    public static void main(String[] args) {
        
      /* double x = Math.ceil(-Math.abs(-8 + Math.floor(-5.5)));
        System.out.printf("x = %f\n", x);
        
        */SecureRandom random = new SecureRandom();
        
        int n = -3 + random.nextInt(11);
        
        System.out.printf("%d\n", n);
    }
    
}
