/*
 * (Sales Commissions) Use a one-dimensional array to solve the following problem: A com-
pany pays its salespeople on a commission basis. The salespeople receive $200 per week plus 9% of
their gross sales for that week. For example, a salesperson who grosses $5,000 in sales in a week re-
ceives $200 plus 9% of $5,000, or a total of $650. Write an application (using an array of counters)
that determines how many of the salespeople earned salaries in each of the following ranges (assume
that each salesperson’s salary is truncated to an integer amount):
a) $200–299
b) $300–399
c) $400–499
d) $500–599
e) $600–699
f) $700–799
g) $800–899
h) $900–999
i) $1,000 and over
Summarize the results in tabular format.
 */
package chapter7arrays;

/**
 * @author kuna
 */
public class SalesCommisionTrouble {

    public static void main(String[] args) {

        double[] salary = {500.3, 200, 210, 384.90, 1000, 999.9, 872.345, 301, 723, 2003, 4560, 1000,3000};

        int counter1 = 100, counter2 = 199, tally = 0;
        
        for(int count=0;count<salary.length;count++) {
            
            counter1 += 100; counter2 += 100;
            
            //loop to displays range and counts salaries in same the ranges
            if(counter1 >= 1000) {
                
                System.out.print("$" + 1000 + "\t");
                
                for (int j = 0; j < salary.length; j++) {
                    if(salary[j] >= 999) {
                        tally += 1;
                    }
                }
                System.out.printf("%d\n", tally);
                tally = 0; //reset the tally
                break;
                
            } 
            
            else { //printing salaries less than 1000 and greater than 200
                System.out.printf("$%d - $%d: ", counter1, counter2);
            
        
            //loop counts salaries in the same range
            for (int j = 0; j < salary.length; j++) {
                if (salary[j] >= counter1 && salary[j] <= counter2) {
                    tally += 1;
                }
            }
            
              System.out.printf("%d\n", tally);
              tally = 0; //reset the tally
            }
        }  System.out.println();
    }

}
    
