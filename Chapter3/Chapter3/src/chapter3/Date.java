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
public class Date { 
//instance variable decalration of class date
    private int month;
    private int day;
    private int year;
    
    //constructor for class date
    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }
    //method gets month for date
    public int getMonth() {
        return month;
    }
    //method gets day for date
    public int getDay() {
        return day;
    }
    //method gets year for date
    public int getYear() {
        return year;
    } 
    //method sets year
    public void setYear(int year) {
        this.year = year;
    }
    //method sets month
    public void setMonth(int month) {
        if(month < 1 || month > 12) 
            month = 1;
        this.month = month;
    }
    //method sets day
    public void setDay(int day) {
        //tests if monnth is february and a leap year to set valid day(29 days)
        if(month == 2 && year % 4 == 0 && (day < 1 || day > 29 )) 
              day = 1;
        //tests if mmonth is february(28 days) to set valid day
        else if(month == 2 && (day < 1 || day > 28))
            day = 1;
        //tests if its a month that has 30 days
        else if( month == 8 || month == 4 || month == 6 || month == 11 && (day < 1 || day > 30))
            day = 1;
        //tests if its a month that has 31 days to set valid day
        else if(day < 1 || day > 31) day = 1;
        
        this.day = day;
    }
    //method displays date
    public void displayDate() {
        System.out.printf("Date: %d/%d/%d\n", day, month, year);
    }
}
