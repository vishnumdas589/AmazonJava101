package day04Polymorphism;

public class BankTransferPayment implements Payment{
	@Override
	public void pay(double amount) {
		System.out.println("payed "+ amount+ " via Bank");
	}

}
