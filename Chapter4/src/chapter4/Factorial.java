/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4;
import java.util.Scanner;

public class Factorial {
    Scanner input = new Scanner(System.in);

	private int facto;

	public Factorial(int facto){
            this.facto = facto;
	}

	public int getFacto() {
            return facto;
	}

	public int calcFacto(int number){
            int factorial = 1;

            while(number != 0) {
		factorial *= number;
		number--;
            }

            facto = factorial;
            return facto;
	}
    }


