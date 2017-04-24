/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3;
import java.util.Scanner; //import Scanner object
import java.time.*; //import time object

/**
 *
 * @author Kuna
 */
public class HeartRatesTest {

	// main method begins execution of Java application
	public static void main( String[] args )
	{
	LocalDate date = LocalDate.of(1997,04,29);
        HeartRates heart = new HeartRates("", "", date);
	HeartRates thr = new HeartRates("Kuna", "Fomboh", date);

	Scanner input = new Scanner(System.in);

	//prompts the user to enter his/her first name
	System.out.print("Enter your first name: ");
	String first = input.nextLine();
	thr.setFirstName(first);

	//prompts the user to enter his/her last name
	System.out.print("Enter your last name: ");
	String last = input.nextLine();
	thr.setLastName(last);

	//calls setDateOfBirth method, prompting the user to enter his/her birth date
	thr.setDateOfBirth();

	//prints first and last name
	System.out.printf("\nFirst Name: %s\n", thr.getFirstName());
	System.out.printf("Last Name: %s\n", thr.getLastName());
		
	//prints the age
	System.out.printf("You are %d years old\n", thr.calcAge());
	//prints maximum heart rate
	System.out.printf("Your Maximum Heart Rate is %d beats per second\n", thr.maxHeartRate());
	//prints target heart rate
	System.out.printf("Your Target-Heart-Rate lies between %d - %d percent \n\n", thr.tarHeartRate1(), thr.tarHeartRate2());
		
	}
}
	

