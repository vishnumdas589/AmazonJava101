package day05Exceptions;

public class BankAccount {
	private double balance;
	public BankAccount(double amount) {
		// TODO Auto-generated constructor stub
		this.balance = amount;
	}
	public void withdraw(double amount) throws IllegalArgumentException, InsufficentFundException {
		if(amount <= 0) {
			throw new IllegalArgumentException(" amount should be greater than zero");
		}else if(amount > this.balance) {
			throw new InsufficentFundException("insufficent fund try lesser amount");
		}
		balance -= amount;
		System.out.println("cuurent balance is "+ this.balance);
	}

}
