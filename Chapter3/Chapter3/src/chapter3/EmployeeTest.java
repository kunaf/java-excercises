/*
 * Author: Kuna Fomboh
 * Date: 4/4/17
 */
package chapter3;

/**
 *
 * @author Kuna
 */
public class EmployeeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creating two empoyee objects, employee1 and employee
        Employee employee1 = new Employee("John", "Doe", 40000.0000);
        Employee employee2 = new Employee("Maryliza", "Solaris", 60000.0000);
        
        //dispaying the values of the object
        System.out.println("First Name      Last Name       Salary");
        System.out.printf("%s               %s          %.4f\n",employee1.getFirstName(), employee1.getLastName(), employee1.getSalery() );
        System.out.printf("%s           %s      %.4f\n",employee2.getFirstName(), employee2.getLastName(), employee2.getSalery() );
        
        //increasing the salary of both objects by 10%
        employee1.setSalary(employee1.getSalery() + (employee1.getSalery() /10));
        employee2.setSalary(employee2.getSalery() + (employee2.getSalery() /10));
        System.out.println("\nYou just got a ten percent raise!\n");
        //dispaying the values of the objects employee1 and employee2 after the ten percent salary raise
        System.out.println("First Name      Last Name       Salary");
        System.out.printf("%s               %s          %.4f\n",employee1.getFirstName(), employee1.getLastName(), employee1.getSalery() );
        System.out.printf("%s           %s      %.4f\n",employee2.getFirstName(), employee2.getLastName(), employee2.getSalery() );
        
        
    }
    
}
