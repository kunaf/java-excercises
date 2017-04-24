/*
 * Author: Kuna Fomboh
 * Date: 4/4/17
Create a class called Employee that includes three instance variables—a
first name (type String), a last name (type String) and a monthly salary (double). Provide a constructor
that initializes the three instance variables. Provide a set and a get method for each instance
variable. If the monthly salary is not positive, do not set its value. Write a test app named EmployeeTest
that demonstrates class Employee’s capabilities. Create two Employee objects and display each
object’s yearly salary. Then give each Employee a 10% raise and display each Employee’s yearly salary
again.
 */
package chapter3;

/**
 *
 * @author Kuna
 */
public class Employee {
    private String firstName;
    private String lastName;
    private double salary; //instance variable for employee monthly salary
    
    //constructor initializes instance variables
    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    //method gets employee first name
    public String getFirstName() {
        return firstName;
    }
    //method gets employee last name
    public String getLastName() {
        return lastName;
    }
    //method gets employee's monthly salary
    public double getSalery() {
        return salary;
    }
    //method sets employee's first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    //method sets employee's last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    //method sets employe's monthly salary
    public void setSalary(double salary) {
        this.salary = salary;
    }
            
}
