package day05Exceptions;

public class BankDemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b1 = new BankAccount(1000);
		try {
			b1.withdraw(0);
		}catch(IllegalArgumentException | InsufficentFundException e) {
			System.out.println("Error : "+ e.getMessage());
		}
		try {
			b1.withdraw(10000);
		}catch(IllegalArgumentException | InsufficentFundException e) {
			System.out.println("Error : "+ e.getMessage());
		}
		try {
			b1.withdraw(500);
		}catch(IllegalArgumentException | InsufficentFundException e) {
			System.out.println("Error : "+ e.getMessage());
		}



	}

}
