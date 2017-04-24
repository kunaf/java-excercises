/*
 * (Global Warming Facts Quiz) The controversial issue of global warming has been widely
publicized by the film “An Inconvenient Truth,” featuring former Vice President Al Gore. Mr. Gore
and a U.N. network of scientists, the Intergovernmental Panel on Climate Change, shared the 2007
Nobel Peace Prize in recognition of “their efforts to build up and disseminate greater knowledge
about man-made climate change.” Research both sides of the global warming issue online (you
might want to search for phrases like “global warming skeptics”). Create a five-question multiple-
choice quiz on global warming, each question having four possible answers (numbered 1–4). Be ob-
jective and try to fairly represent both sides of the issue. Next, write an application that administers
the quiz, calculates the number of correct answers (zero through five) and returns a message to the
user. If the user correctly answers five questions, print “Excellent”; if four, print “Very good”; if
three or fewer, print “Time to brush up on your knowledge of global warming,” and include a list
of some of the websites where you found your facts.
 */
package chapter5;
import java.util.Scanner;
public class GlobalWarmingFactsQuiz {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int result = 0;
        
        System.out.println("Answer all five questions.");
        System.out.println("Enter the number correspnding to your answer. \n");
        
        System.out.println("a. Global warming is as a result of ");
        System.out.println("    1) Increase in greenhoue gases.");
        System.out.println("    2) Warming of the earth.");
        System.out.println("    3) Excess energy.");
        System.out.println("    4) High atmospheric pressure.");
        
        int ans1 = input.nextInt();
        if(ans1 == 1) 
            result += 1;
        
        System.out.println("b. Which of the following is not a greenhouse gas?");
        System.out.println("    1) CO2");
        System.out.println("    2) CO3");
        System.out.println("    3) CH4");
        System.out.println("    4) NO2");
        
        int ans2 = input.nextInt();
        if(ans2 == 2)
            result += 1;
        
        System.out.println("c. Which of the ollowing is not a way to reduce greenhouse gas emissions?");
        System.out.println("    1) Efficient use of energy.");
        System.out.println("    2) Drastic climatic change");
        System.out.println("    3) Lowering population growth rates.");
        System.out.println("    4) Development of renewable energy supplies.");
        
        int ans3 = input.nextInt();
        if(ans3 == 2)
            result += 1;
        
        System.out.println("d. ____ damages Coral Reefs");
        System.out.println("    1) Excess sea water");
        System.out.println("    2) Over heating by sunlight");
        System.out.println("    3) Increase in population of sea creatures");
        System.out.println("    4) Increase in atmospheric Carbondioxide");
        
        int ans4 = input.nextInt();
        if(ans4 == 4)
            result += 1;
        
        System.out.println("e. In 2003, the heat wave which hit India caused temperatures to rise to _______");
        System.out.println("    1) 90 degrees celcuis");
        System.out.println("    2) 50 degrees celcuis");
        System.out.println("    3) 26 degrees celcuis");
        System.out.println("    4) 10 degrees celcuis");
        
        int ans5 = input.nextInt();
        if(ans5 == 2) 
            result += 1;
        
        System.out.printf("Score: %d/5\n", result);
        
        if(result == 5)
            System.out.println("Excellent!");
        else if(result == 4)
            System.out.println("Very Good!");
        else if(result <= 3)
            System.out.println("Time to brush up your knowledge of global warming!");
    }
    
}
