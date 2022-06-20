package Homework0;

import java.util.Scanner;

public class PunctajTest {

	int punctaj;
	
	public void aksTheUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please insert your scour :");
		punctaj = scan.nextInt();
		scan.close();
	
	}
	
	public void testScour() {
		
		if(punctaj >= 0 && punctaj <= 65) {
			System.out.println("Ai picat. Mai incearca");
		}else {
			System.out.println("Felicitari, Ai trecut");
		}
	}
}

