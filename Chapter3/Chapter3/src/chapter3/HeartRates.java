/*
 * Author: Kuna Fomboh
 * Date: 4/4/17
(Target-Heart-Rate Calculator) While exercising, you can use a heart-rate monitor to see that
your heart rate stays within a safe range suggested by your trainers and doctors. According to the American
Heart Association (AHA) (www.americanheart.org/presenter.jhtml?identifier=4736), the
formula for calculating your maximum heart rate in beats per minute is 220 minus your age in years.
Your target heart rate is a range that’s 50–85% of your maximum heart rate. [Note: These formulas are
estimates provided by the AHA. Maximum and target heart rates may vary based on the health, fitness
and gender of the individual. Always consult a physician or qualified health-care professional before
beginning or modifying an exercise program.] Create a class called HeartRates. The class attributes
should include the person’s first name, last name and date of birth (consisting of separate attributes for
the month, day and year of birth). Your class should have a constructor that receives this data as parameters.
For each attribute provide set and get methods. The class also should include a method that
calculates and returns the person’s age (in years), a method that calculates and returns the person’s
maximum heart rate and a method that calculates and returns the person’s target heart rate. Write a
Java app that prompts for the person’s information, instantiates an object of class HeartRates and
prints the information from that object—including the person’s first name, last name and date of
birth—then calculates and prints the person’s age in (years), maximum heart rate and target-heart-rate
range.
 */
package chapter3;

import java.util.Scanner;
import java.time.*;
/**
 *
 * @author Kuna
 */
public class HeartRates {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    
   // Date date1 = new Date(0,0,0);
    public HeartRates(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }
    //method gets employee first name
    public String getFirstName() {
        return firstName;
    }
    //method gets employee last name
    public String getLastName() {
        return lastName;
    }
     public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    //method sets employee's last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    //method gets the date of birth
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    //method sets the date of birth
    public void setDateOfBirth() {
        //create Scanner object
	Scanner input = new Scanner(System.in);
	//prompts user to enter birth Year 
	System.out.print("Enter your Year of birth and press the Enter key: ");
        int year = input.nextInt();

	//prompts user to enter birth month
	System.out.print("Enter your month of birth and press the Enter key: ");
	int month = input.nextInt();
		
	//prompts user to enter birth day
	System.out.print("Enter your Day of birth and press the Enter key: ");
	int day = input.nextInt();
        
        LocalDate birth = LocalDate.of(year, month, day);

	dateOfBirth = birth;

    }
    //this method calculates the age of the user
    public int calcAge() {
	LocalDate today = LocalDate.now();
	Period p = Period.between(dateOfBirth, today);
	int age = p.getYears();
	return age;
	}
    
    //method calculates the maximum heart rate
   public int maxHeartRate() {
	int maxHR = 220 - calcAge();
           return maxHR;
	}

    public int tarHeartRate1() {
	double tarHR1 = maxHeartRate() * 0.5;
	return (int)tarHR1;
	}

    public int tarHeartRate2() {
	double tarHR2 = maxHeartRate() * 0.58;
	return (int)tarHR2;
	
    }
    
}
