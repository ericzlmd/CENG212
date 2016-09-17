/**
	A bank account has a blance that can be changed by
	deposits and withdrawals
	@author Kenn Baker
	@version June 11, 2014
*/
public class BankAccount
{
	private double balance;								// Why is this private?
	/**													// These are the javadoc requirements
		Constructs a bank account with a given balance.
		@param initialBalance Set the initial balance
	*/
	public BankAccount(double initialBalance)		// This is a constructor, no return type
	{
		balance = initialBalance;
	}
	/**
		Deposits money into the bank account.
		@param amount the amount to deposit
	*/
	public void deposit(double amount)					// deposit method
	{													// input param; no return type
		double newBalance = balance + amount;
		balance = newBalance;
	}
	/**
		Withdraws money from the bank account.
		@param amount the amount to withdraw
	*/
	public void withdraw(double amount)					// withdraw method
	{													// input param; no return type
		double newBalance = balance - amount;
		balance = newBalance;
	}
	/**
		Gets the current balance of the bank account.
		@return the current balance
	*/
	public double getBalance()							// getter method
	{													// no input param; have return type
		return balance;		// How to correct for negative balance?
	}												// require return statement for return
	/**
		A quick test of functionality!
		@param args not used
	*/
	public static void main(String[] args)				// the main method
	{
		BankAccount myAccount = new BankAccount(100.00); // create actual object of class!
		myAccount.deposit(1500.00);							// call necessary methods
		myAccount.withdraw(500.00);
		System.out.println(myAccount.getBalance());
		System.out.println("Expected: 1100.00");			// Prove my initial test
	}
}  