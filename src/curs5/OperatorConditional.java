package curs5;

import java.util.Scanner;

public class OperatorConditional {
	
	/*
	 * Citeste 2 numere de la tastatura si verif urm reguli:
	 * verif daca fiecare nr este pozitiv
	 * verif daca ambele nr sunt pozitive
	 * verif care dintre cele doua nr este cel mai mic
	 * 
	 */
	

	public static void main(String[] args) {

		int num1;
		int num2;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please insert first number : ");
		num1 = scan.nextInt();
		System.out.println("Please insert second number : ");
		num2 = scan.nextInt();
		
		//result= (conditie) ? expresie1 : expresie2
		//result = (num1>=0) ? "Num1 is pozitiv":"Num1 is negative"
		
		//verif daca fiecare nr e pozitiv
		//if(num1>=0) {
			//System.out.println("Num1 is pozitiv");
		//}else { 
			//System.out.println("Num1 is negative");
		//}
		//if(num2>=0) {
			//System.out.println("Num2 is pozitiv");
		//}else {
			//System.out.println("Num2 is negative");
			
		//}
		String result;
		result = (num1>=0) ? "Num1 is pozitiv" : "Num1 is negative";
		System.out.println(result);
		
		result = (num2>=0) ? "Num2 is pozitiv" : "Num2 is negative";
		System.out.println(result);
		
		//verif daca ambele sunt pozitive
		/* if(num1>=0 && num2>=0) {
			 System.out.println("Both are pozitive");
		 }else {
			 System.out.println("At least one is negative");
		 }*/
		
	
		result = (num1>=0 && num2>=0) ? "Both are pozitive": "At least one is negative";
		System.out.println(result);
		 
		 //verif care dintre ele e mai mare
		if(num1>num2) {
			System.out.println("Num2 is the smallest");
		}else if(num1== num2) {
			System.out.println("Numbers are equal");
		}else {
			System.out.println("Num1 is the smallest");
		}
		result = (num1 == num2)? "Numbers are equals": (num1>num2)?"Num2 is the smallest":"Num1 is the smallest";
		System.out.println(result);
	}

}
