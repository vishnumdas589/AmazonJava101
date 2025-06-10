package day04Encapsulation;

public class EncapsulationmMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b1 = new BankAccount("vishnu", "vishnu1234");
		BankAccount b2 = new BankAccount("vishnu", "vishnu123");
		b2.getId();
		b2.getBalance("vishnu123");
		b2.deposit(10000);
		b2.getBalance("vishnu123");
		b2.withdraw("vishnu1234", 4000);
		b2.getBalance("vishnu123");
		b2.withdraw("vishnu123", 40000);
		b2.getBalance("vishnu123");
		
		b2.withdraw("vishnu123", 4000);
		b2.getBalance("vishnu123");
		

	}
	

}
