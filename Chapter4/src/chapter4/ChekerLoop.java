/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4;

/**
 *
 * @author kuna
 */
public class ChekerLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int row = 1;
        
        while ( row <= 8 ) {
            int column = 1;
            
            if ( row % 2 == 0 )
                System.out.print( " " );
            
            while ( column <= 8 ) {
                System.out.print( "* " );
                column++;
            }
            System.out.println();
            row++;
        }
    
    }
}
    
