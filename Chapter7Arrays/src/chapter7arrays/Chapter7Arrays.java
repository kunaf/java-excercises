/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7arrays;

/**
 *
 * @author kuna
 */
public class Chapter7Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       char[][] turtle= new char[10][10];
       int j = 0, i = 0, steps = 4;
        for(j = 0;j<steps-1;j++) {
                turtle[i][j] = '*';
            }
        
        for(;i<steps-1;i++) {
                turtle[i][j] = '*';
            }
        System.out.println(j);
        System.out.println(i);
        for(;j>=0;j--) {
                turtle[i][j] = '*';
            }
        System.out.println(j);
        System.out.println(i);
    }
    
}
