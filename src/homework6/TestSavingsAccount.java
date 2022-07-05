package homework6;

import java.util.Scanner;

public class TestSavingsAccount {

	public static void main(String[] args) throws InsufficientFundsException {

		Customer customer = new Customer("Mia", "Cluj", "yahoo");
		SavingsAccount account = new SavingsAccount(12345, 1500, customer);
		
		System.out.println("Hi " + customer.getName() + "!");
		System.out.println("Please enter the amount to widraw: ");

		Scanner scan = new Scanner(System.in);
		int amount = scan.nextInt();
		
		try {
			account.withdraw(amount);
			System.out.println("Please pick your money!");

			System.out.println("Your new balance is: " + account.getBalance());

		}catch(InsufficientFundsException e) {
			System.out.println("Insuficient funds for transaction");
		}finally {
			System.out.println("Thank you for using our ATM");
	}
	}
	}


