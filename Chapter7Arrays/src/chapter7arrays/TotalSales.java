/*(Total Sales) Use a two-dimensional array to solve the following problem: A company has
four salespeople (1 to 4) who sell five different products (1 to 5). Once a day, each salesperson passes
in a slip for each type of product sold. Each slip contains the following:
a) The salesperson number
b) The product number
c) The total dollar value of that product sold that day
Thus, each salesperson passes in between 0 and 5 sales slips per day. Assume that the information
from all the slips for last month is available. Write an application that will read all this information for
last month’s sales and summarize the total sales by salesperson and by product. All totals should be
stored in the two-dimensional array sales . After processing all the information for last month, dis-
play the results in tabular format, with each column representing a salesperson and each row repre-
senting a particular product. Cross-total each row to get the total sales of each product for last month.
Cross-total each column to get the total sales by salesperson for last month. Your output should
include these cross-totals to the right of the totaled rows and to the bottom of the totaled columns.
 */
package chapter7arrays;
import java.util.Scanner;
/**
 *
 * @author kuna
 */
public class TotalSales {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       /*int [] salesPerson = new int[20];
       int[][] table = new int[5][4];
       int[] item = new int[20];
       int[] value = new int[20];
       int pdtValue, count = 0; */
       
       int item, salesperson, price, count = 0;
       int[][] arraySales = new int[5][4];
       
        
        for(int i = 0; i < 20; i++){
           
            System.out.println("Enter values in your pay slip.");
            System.out.println("Sales Person ID(1,2,3,4): ");
            salesperson = input.nextInt();
            System.out.println("Product ID(1,2,3,4,5): ");
            item = input.nextInt();
            System.out.println("Product value: ");
            price = input.nextInt();
            
            arraySales[item-1][salesperson-1] += price;
            
            System.out.println("Enter 1 to terminate 0 to continue");
            count = input.nextInt();
            if(count == 1)
                break;
       }
        int sum = 0, sp1 =0, sp2 = 0, sp3 = 0, sp4 = 0;
        System.out.printf("%s%8s%7s%8s%8s   %10s\n", "Item Number","SP1", "SP2", "SP3", "SP4", "*Row Total*");
         for(int i=0;i<5;i++){
             System.out.printf("Item %d\t\t", i);
            for(int j=0;j<4;j++){
                System.out.print(arraySales[i][j] + "\t");
                sum += arraySales[i][j]; 
                if(j == 0)
                    sp1 += arraySales[i][j];
                else if(j == 1)
                    sp2 += arraySales[i][j];
                else if(j == 2)
                    sp3 += arraySales[i][j];
                else if(j == 3)
                    sp4 += arraySales[i][j];
            }
            System.out.print(sum); sum = 0;
             System.out.println();
        }
         System.out.println();
         System.out.print("*Col Tot*");
         System.out.printf("%8d%8d%8d%8d\n",sp1, sp2, sp3, sp4);
        
        
        
        
        
        
       
    }
    
}
