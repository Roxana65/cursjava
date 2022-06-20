package Homework0;

import java.util.Scanner;

public class VarstaUtilizator {

	int varsta;
	
	public void askTheUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Care este varsta dumneavoastra? :");
		varsta = scan.nextInt();
		scan.close();
	}
	
	public void minorSauAdult() {
		
		if(varsta < 18) {
			System.out.println("Esti minor");
		}else if(varsta >= 18 && varsta <=65) {
			System.out.println("Esti adult");
		}else if(varsta > 65) {
			System.out.println("Esti batran");
		}else {
			System.out.println("Va rugam precizati varsta in cifre");
		}
	}
	}
