/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4;

public class TabularOutput {

    public static void main(String[] args) {
        System.out.println("N   10*N    100*N   1000*N");
        for(int i=1;i<=5;i++) {
        System.out.printf("%d   %d      %d      %d\n", i, i*10, 1*100, i*1000);  
            
        }
    }
    
}
