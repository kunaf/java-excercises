/*
 * (Command-Line Arguments) Rewrite Fig. 7.2 so that the size of the array is specified by the
first command-line argument. If no command-line argument is supplied, use 10 as the default size
of the array.
 */
package chapter7arrays;

/**
 * @author kuna
 */
public class UsingComLine {

    public static void main(String[] args) {
        
        
        int arrayLength;
        //check number of command line arguments
        if(args.length != 3)
            System.out.println("Please re-enter command line arguments that include the inital value increment snd the array size");
        else {
            arrayLength = Integer.parseInt(args[0]);
            int[] array = new int[arrayLength];
            int initVal = Integer.parseInt(args[1]);
            int increment = Integer.parseInt(args[2]);
            
            for(int i=0;i<array.length;i++) 
                array[i] = initVal + increment * i;
            System.out.printf("%s10%s", "Index", "Value");    
           
            for(int i=0;i<array.length;i++)
                System.out.printf("%d10%d", i, array[i]);
        }
            
    }
    
}
