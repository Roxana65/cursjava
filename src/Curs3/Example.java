package Curs3;

import java.util.Scanner;

public class Example {

	/*
	 * un program care ask user un nr
	 * inmulteste acel nr cu 10 si print
	 * 
	 *  face asta pana userul introduce 0
	 * 
	 * 
	 */
	public static void main(String[] args) {

		int number;
		Scanner scan = new Scanner(System.in);
		
		do {
		System.out.println("enter a number :");	
		number = scan.nextInt();
		System.out.println(number*10);
		}while(number !=0);
		
		
	}

}
