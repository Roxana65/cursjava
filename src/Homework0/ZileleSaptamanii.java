package Homework0;

import java.util.Scanner;

public class ZileleSaptamanii {
	
	String ziuasaptamanii;
	
	public void askTheUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduceti numarul :");
		ziuasaptamanii = scan.next();
		scan.close();
	}
	
	public void numarPentruZi() {
		
		switch(ziuasaptamanii) {
		
		case "1" : 
			System.out.println("Ziua saptamanii este Luni");
			break;
		case "2" :
			System.out.println("Ziua saptamanii este Marti");
			break;
		case "3" :
			System.out.println("Ziua saptamanii este Miercuri");
			break;
		case "4" :
			System.out.println("Ziua saptamanii este Joi");
			break;
		case "5" :
			System.out.println("Ziua saptamanii este Vineri");
			break;
		case "6" :
			System.out.println("Ziua saptamanii este Sambata");
			break;
		case "7" :
			System.out.println("Ziua saptamanii este Duminica");
			break;
		default :
			System.out.println("Te rugam sa introduci un numar intre 1 si 7");		
		}	
	}
}
