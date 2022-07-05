package homework6;

public class SavingsAccount extends Account {

	public SavingsAccount(int accountNumber, double balance, Customer accountOwner) {
		super(accountNumber, balance, accountOwner);
	}
	
	
	public void withdraw (int amount) throws InsufficientFundsException {
		
		if(amount> balance) {
			throw new InsufficientFundsException("Insuficient funds for transaction");
			}else {
				balance= balance-amount;
				System.out.println("");
			}
	}
}
