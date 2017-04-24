/*
 * (Computer-Assisted Instruction) The use of computers in education is referred to as com-
puter-assisted instruction (CAI). Write a program that will help an elementary school student learn
multiplication. Use a SecureRandom object to produce two positive one-digit integers. The program
should then prompt the user with a question, such as
How much is 6 times 7?
The student then inputs the answer. Next, the program checks the student’s answer. If it’s correct,
display the message "Very good!" and ask another multiplication question. If the answer is wrong,
display the message "No. Please try again." and let the student try the same question repeatedly
until the student finally gets it right. A separate method should be used to generate each new ques-
tion. This method should be called once when the application begins execution and each time the
user answers the question correctly.

6.36 (Computer-Assisted Instruction: Reducing Student Fatigue) One problem in CAI environ-
ments is student fatigue. This can be reduced by varying the computer’s responses to hold the stu-
dent’s attention. Modify the program of Exercise 6.35 so that various comments are displayed for
each answer as follows:
Possible responses to a correct answer:
    Very good!
    Excellent!
    Nice work!
    Keep up the good work!
Possible responses to an incorrect answer:
    No. Please try again.
    Wrong. Try once more.
    Don't give up!
    No. Keep trying.
Use random-number generation to choose a number from 1 to 4 that will be used to select
one of the four appropriate responses to each correct or incorrect answer. Use a switch statement to
issue the responses.

6.37 (Computer-Assisted Instruction: Monitoring Student Performance) More sophisticated
computer-assisted instruction systems monitor the student’s performance over a period of time. The
decision to begin a new topic is often based on the student’s success with previous topics. Modify
the program of Exercise 6.36 to count the number of correct and incorrect responses typed by the
student. After the student types 10 answers, your program should calculate the percentage that are
correct. If the percentage is lower than 75%, display " Please ask your teacher for extra help .",
then reset the program so another student can try it. If the percentage is 75% or higher, display
" Congratulations, you are ready to go to the next level! ", then reset the program so another
student can try it.

6.38 (Computer-Assisted Instruction: Difficulty Levels) Exercises 6.35–6.37 developed a com-
puter-assisted instruction program to help teach an elementary school student multiplication. Mod-
ify the program to allow the user to enter a difficulty level. At a difficulty level of 1, the program
should use only single-digit numbers in the problems; at a difficulty level of 2, numbers as large as
two digits, and so on.

6.39 (Computer-Assisted Instruction: Varying the Types of Problems) Modify the program of
Exercise 6.38 to allow the user to pick a type of arithmetic problem to study. An option of 1 means
addition problems only, 2 means subtraction problems only, 3 means multiplication problems only,
4 means division problems only and 5 means a random mixture of all these types.
 */
package chapter4;
import java.security.SecureRandom;
import java.util.Scanner;
/**
 * @author kuna
 */
public class CompAssistedInstruc {
    private int diff;
    public static int difficultyLevel(int level) {
        SecureRandom random = new SecureRandom();
        Scanner input = new Scanner(System.in);
        int number = 0;
        
        switch(level) {
            case 1: 
                number = random.nextInt(9);
                break;
            case 2: 
                number = 10 + random.nextInt(99);
                break;
            case 3: 
                number = 100 + random.nextInt(999);
                break;
            case 4:
                number = 1000 + random.nextInt(9999);
                break;
        }
        return number;
    }
    public static int arithmeticProb(int option, int diff) {
        //Scanner input = new Scanner(System.in);
        int result = 0, number1, number2;
        switch(option) {
            case 1://addition
                number1 = difficultyLevel(diff); 
                number2 = difficultyLevel(diff);
                result = number1 + number2;
                System.out.printf("How much is %d plus %d\t",number1,number2 );
                break;
            case 2: //multiplication
                number1 = difficultyLevel(diff); 
                number2 = difficultyLevel(diff);
                result = number1 * number2;
                System.out.printf("How much is %d times %d\t",number1,number2 );
                break;
            case 3: //division
                number1 = difficultyLevel(diff); 
                number2 = difficultyLevel(diff);
                result = number1 / number2;
                System.out.printf("How much is %d divided by %d\t",number1,number2 );
                break;
            case 4: //subtraction
                number1 = difficultyLevel(diff); //check input variable for difficulty level
                number2 = difficultyLevel(diff);
                result = number1 - number2;
                System.out.printf("How much is %d minus %d\t",number1,number2 );
                break;
           
                
        }
        return result;
    }
    public static String goodComments() {
        SecureRandom rand = new SecureRandom();
        String comment = "";
        switch(1 + rand.nextInt(4)) {
            case 1: 
                comment = "Very good!";
                break;
            case 2: 
                comment = "Excellent!";
                break;
            case 3:
                comment = "Nice work!";
                break;
            case 4:
                comment = "Keep up the good work!";
                break;
        }
        return comment;
    }
    public static String poorComments() {
        SecureRandom rand = new SecureRandom();
        String comment = "";
        switch(1 + rand.nextInt(4)) {
            case 1:
                comment = "No. Please try again.";
                break;
            case 2:
                comment = "Wrong. Try once more.";
                break;
            case 3:
                comment = "Don't give up!";
                break;
            case 4:
                comment = "No. Keep trying.";
                break;
        }
        return comment;
     }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //creating a scanner object
        SecureRandom random = new SecureRandom(); //creating a random number object
        
        System.out.println("Hello! Welcome to Math World!!");
        //System.out.println("Answer the math questions that follow.\n");
        int answer, response, score = 0; //variable declaration
        int count = 0; int replay = 0; //loop counters
        
        
        System.out.println("Select and key in your choice of Arithmetic Problems.");
        System.out.println("1. Addition Problems");
        System.out.println("2. Multiplication Problems");
        System.out.println("3. Division Poblems");
        System.out.println("4. Subtraction Problems");
        System.out.println("5. Mixture of all problems");
        
        int option = input.nextInt(); //variable stores the arithmetic problem option.
        
        /*System.out.println("Select and key in a difficulty level");
        System.out.println("1. Single Digit Questions");
        System.out.println("2. Two Digit Questions");
        System.out.println("3. Three Digit Questions");
        System.out.println("4. Four Digit Questions");
        
        */
        int stage = 1, level = 1;
        
        while(replay!= 1) {
            System.out.printf("\n\nSTAGE %d\n\n", stage); //add stage variable
            //int level = input.nextInt();
        
            while(count < 10) {
                if(option == 5) {
                    answer = arithmeticProb(1+random.nextInt(4),level);
                }
                else
                    answer = arithmeticProb(option, level); //calls function arithmetic probs and passes to it variable option
            
                response = input.nextInt();
                //checks if user's answer is correct
                if(response == answer)
                    score += 1;
            
                count++;
            }
            int percentage = (score*100/10); //calculates percentage
            System.out.printf("Score: %d/10\tPercentage: %d\n", score, percentage);
            if(percentage < 75) 
                System.out.println("You must repeat this stage.\nPlease ask your teacher for extra help \n.");
                
            else {
                System.out.println(goodComments() + " You are ready to go to the next level! ");
                stage++; level++; }
            
            System.out.println("Press 1 to quit or 0 to continue.");
            replay = input.nextInt();
            
            count = 0; score = 0;
        }
        
   }
    
}