package homework2;

import java.util.Scanner;

public class LoginDoWhile {
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		scan.close();
		String username = "TesterUser";
		int password = 1234;

		int incercari = 0;
		do {
		
			System.out.println("Please insert your username :");
			String user = scan.next();
			
			System.out.println("Please insert your password :");
			int pass = scan.nextInt();
			if(user.equals(username)&&pass==password) {
				System.out.println("Login successful");
				break;
			}
			else if(incercari<2) {
				System.out.println("Login Error");
				incercari++;
			}else {
				System.out.println("Maximum attempts reached. User blocked");
				break;
			}
		}while(incercari<=3);
			}

}
