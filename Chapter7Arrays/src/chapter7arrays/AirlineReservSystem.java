/*(Airline Reservations System) A small airline has just purchased a computer for its new au-
tomated reservations system. You’ve been asked to develop the new system. You’re to write an ap-
plication to assign seats on each flight of the airline’s only plane (capacity: 10 seats).
Your application should display the following alternatives: Please type 1 for First Class and
Please type 2 for Economy . If the user types 1 , your application should assign a seat in the first-
class section (seats 1–5). If the user types 2 , your application should assign a seat in the economy
section (seats 6–10). Your application should then display a boarding pass indicating the person’s
seat number and whether it’s in the first-class or economy section of the plane.
Use a one-dimensional array of primitive type boolean to represent the seating chart of the
plane. Initialize all the elements of the array to false to indicate that all the seats are empty. As
each seat is assigned, set the corresponding element of the array to true to indicate that the seat is
no longer available.
Your application should never assign a seat that has already been assigned. When the economy
section is full, your application should ask the person if it’s acceptable to be placed in the first-class
section (and vice versa). If yes, make the appropriate seat assignment. If no, display the message
"Next flight leaves in 3 hours."
 */
package chapter7arrays;
import java.util.Scanner;
/**
 * @author kuna
 */
public class AirlineReservSystem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int seatl1 = 0, seatl2 = 5, level;  //variables holds seat number and seat category respectively
        int check = 0; //loop counter
        boolean[] seatChart = new boolean[10]; boolean fill1 = false, fill2 = false;
        
        while(check != 1) {
            //checks if plane is full
            if(fill1 == true && fill2 == true) {
                System.out.println("No more available seats");
                break;
            }
            else {
                //prompt for seat category, first class or economy
                System.out.println("\nPlease type:");
                System.out.println("1 for First Class or");
                System.out.println("2 for Economy");
        
                level = input.nextInt(); //variable stores users seat category
            
                if(level == 1) {
                    if(seatl1 >= 5 ) {
                        System.out.println("No more seats are available in the First Class secion");
                        System.out.println("Do you wish to choose a seat in the Economy section?");
                        System.out.println("1 for yes\n2 for no");
                        fill1 = true;
                        int choice = input.nextInt();
                        if(choice == 1)
                            continue;
                        else
                            break;
                    }
                    else { 
                        seatChart[seatl1] = true; 
                        seatl1 +=1;
                    } 
                
                    System.out.println("\nBoarding Pass");
                    System.out.printf("Seat Number: %d\n", seatl1);
                    System.out.println("Class: First Class");
                    
                }
            
                else if(level == 2){
                    if(seatl2 >= 10 ) {
                        System.out.println("No more seats are available in the economy secion");
                        fill2 = true;
                        if(fill1 != true) {
                            System.out.println("Do you wish to choose a seat in the First Class section?");
                            System.out.println("1 for yes\n2 for no");
                            int choice = input.nextInt();
                            if(choice == 1)
                                continue;
                            else
                                System.out.println("Next flight leaves in 3 hours");
                                break;
                        }
                    
                    }
                    else {
                        seatChart[seatl2-1] = true;  
                        seatl2 += 1; 
                    }      
                    System.out.println("\nBoarding Pass");
                    System.out.printf("Seat Number: %d\n", seatl2);
                    System.out.println("Class: Economy");       
            
                }
            
                else 
                    System.out.println("Invalid category");
            
            
            }
            
        }
        
        
        
    }
    
}
