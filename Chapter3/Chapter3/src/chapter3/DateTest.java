/*
 * Author: Kuna Fomboh
 * Date: 4/4/17
Create a class called Date that includes three instance variables—a month (type
int), a day (type int) and a year (type int). Provide a constructor that initializes the three instance
variables and assumes that the values provided are correct. Provide a set and a get method for each
instance variable. Provide a method displayDate that displays the month, day and year separated
by forward slashes (/). Write a test app named DateTest that demonstrates class Date’s capabilities.
 */
package chapter3;

/**
 *
 * @author Kuna
 */
public class DateTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date date = new Date(5, 31, 2000);
        
        date.setYear(date.getYear());
        date.setMonth(date.getMonth());
        date.setDay(date.getDay());
        
        date.displayDate();
        //System.out.printf("Date: %d/%d/%d\n", date.getDay(), date.getMonth(), date.getYear());
    }
    
}
