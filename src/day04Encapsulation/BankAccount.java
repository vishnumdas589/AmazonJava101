package day04Encapsulation;

public class BankAccount {
	  private int id ;
	  private String holderName;
	  private String passwd;
	  private double balance;
	  private static int idGerator = 1000;
	  public BankAccount(String name, String passwd) {
		 this.setId(idGerator++);
		 this.holderName = name;
		 this.passwd = passwd;
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		System.out.println(this.id);
		return this.id;
	}
	private void setId(int id) {
		if(id < 1000) {
			System.out.println("invalid id");
			
		}else {this.id = id;}
		
	}

	
	public String getHolderName() {
		
		return holderName;
	}
	
	public double getBalance(String inputPasswd) {
		if(authenticator(inputPasswd)) {
			System.out.println(this.balance);
			return balance;
		}
		System.out.println("invlaid pasword");
		return -1;
		
	}
	public boolean authenticator(String password) {
		if(this.passwd.equals(password)) {
			return true;
		}else {
			return false;
		}
	}
	public void deposit(double money) {
		if(money> 0) {
			this.balance+= money;
		}
	}
	public void withdraw(String inputPass, double amount) {
		  if(this.authenticator(inputPass) && amount <= this.balance) {
			  balance -= amount;
		  }else if(!this.authenticator(inputPass) ) {
			  
			  System.out.println("invalid password");
		  }
		  else {
			  System.out.println("insufficent fund");
		  }
		  

	}
	
		
}
	
	
	
	
	