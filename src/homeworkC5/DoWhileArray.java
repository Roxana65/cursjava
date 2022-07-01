package homeworkC5;

import java.util.Scanner;

public class DoWhileArray {

	public static void main(String[] args) {

		String [] months = {"ian", "feb", "martie", "apr", "mai", "iun", "iulie", "aug", "sept", "oct", "nov", "dec"};
		Scanner scan = new Scanner(System.in);
		
	
		int i=0;
		do {
			int num;
			System.out.println("Please insert a number : ");
			num = scan.nextInt();
			if(num >months.length) {
				System.out.println("Numar invalid. Incearca din nou : ");
				continue;
			}
			System.out.println(months[num-1]);
			break;
			}while(i<=months.length);
		
	
			
	}

}
