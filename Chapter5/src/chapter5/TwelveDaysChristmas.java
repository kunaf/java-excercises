/*
 * Write an application that uses repetition and
switch statements to print the song “The Twelve Days of Christmas.” One switch statement should
be used to print the day (“first,” “second,” and so on). A separate switch statement should be usedMaking a Difference
199
to print the remainder of each verse. Visit the website en.wikipedia.org/wiki/The_Twelve_Days_
of_Christmas_(song) for the lyrics of the song.
 */
package chapter5;

/**
 *
 * @author kuna
 */
public class TwelveDaysChristmas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String result= "";
        for(int day=1;day<13;day++) {
            result += "\nOn the ";
          
            switch(day) {
                case 1: 
                    result += "first";
                    break;
                case 2: 
                    result += "second" ; 
                    break;
                case 3: 
                    result += "third" ; 
                    break;
                case 4: 
                    result += "fourth" ; 
                    break;
                case 5: 
                    result += "fifth" ; 
                    break;
                case 6: 
                    result += "sixth" ; 
                    break;
                case 7: 
                    result += "seventh" ; 
                    break;
                case 8: 
                    result += "eight" ; 
                    break; 
               case 9: 
                    result += "ninth" ; 
                    break;
                case 10: 
                    result += "tenth" ; 
                    break;
                case 11: 
                    result += "eleventh" ; 
                    break;
                case 12: 
                    result += "twelvth" ; 
                    break;
            }
            result += " day of Christmas my true love gave to me: ";
            
            switch(day) {
                case 1: 
                    result += "a Patridge in a pear tree";
                    break;
                case 2:
                    result += "Two turtle doves";
                    break;
                case 3:
                    result += "Three french hens";
                    break;
                case 4:
                    result += "Four calling birds";
                    break;
                case 5:
                    result += "Five golden rings";
                    break;
                case 6:
                    result += "Six geese-a-laying";
                    break;
                case 7:
                    result += "Seven swans-a-swimming";
                    break;
                case 8:
                    result += "Eight maids-a-milking";
                    break;
                case 9:
                    result += "NIne ladies dancing";
                    break;
                case 10:
                    result += "Ten drummers drumming";
                    break;
                case 11:
                    result += "Eleven pipers piping";
                    break;
                case 12: 
                    result += "Twelve Lords-a-leaping";
                    break;
            }
            
            System.out.printf("%s\n", result);
        }
    }
    
}
