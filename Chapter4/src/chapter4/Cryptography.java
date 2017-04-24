/*
 * The explosive growth of Internet communications
and data storage on Internet-connected computers has greatly increased privacy concerns. The field
of cryptography is concerned with coding data to make it difficult (and hopefully—with the most
advanced schemes—impossible) for unauthorized users to read. In this exercise you’ll investigate a
simple scheme for encrypting and decrypting data. A company that wants to send data over the In-
ternet has asked you to write a program that will encrypt it so that it may be transmitted more se-
curely. All the data is transmitted as four-digit integers. Your application should read a four-digit
integer entered by the user and encrypt it as follows: Replace each digit with the result of adding 7
to the digit and getting the remainder after dividing the new value by 10. Then swap the first digit
with the third, and swap the second digit with the fourth. Then print the encrypted integer. Write
a separate application that inputs an encrypted four-digit integer and decrypts it (by reversing the
encryption scheme) to form the original number. [Optional reading project: Research “public key
cryptography” in general and the PGP (Pretty Good Privacy) specific public key scheme. You may
also want to investigate the RSA scheme, which is widely used in industrial-strength applications.]
 * Author:Kuna Fomboh
 */
package chapter4;

import java.util.Scanner;
public class Cryptography {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);
       int digit1, digit2, digit3, digit4;

        System.out.print("\nChoose an option: \n");
	System.out.print("1. Encrypt four-digit number.\n2. Decrypt four-digit number.\n");
	int choose = input.nextInt();

	System.out.print("\nEnter a four-digit number: ");
	int number = input.nextInt();

	if(choose == 1) {
            digit1 = ((number /1000) + 7 ) % 10 ;
            digit2 = ((number /100 % 10) + 7 ) % 10 ;
            digit3 = ((number /10 % 10 % 10) + 7 ) % 10 ;
            digit4 = ((number %10) + 7 ) % 10 ;
            System.out.printf("\nThe encrypted number is: %d%d%d%d \n", digit3, digit4, digit1, digit2);

	}
		
	else if(choose == 2) {
            digit3 = ((number /1000) + 3 ) % 10 ;
            digit4 = ((number /100 % 10) + 3 ) % 10 ;
            digit1 = ((number /10 % 10 % 10) + 3 ) % 10 ;
            digit2 = ((number % 10) + 3 ) % 10 ;

            System.out.printf("\nThe decrypted number is: %d%d%d%d \n", digit1, digit2, digit3, digit4);
	}
    }
    
}
