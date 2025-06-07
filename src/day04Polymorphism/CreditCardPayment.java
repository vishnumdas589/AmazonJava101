package day04Polymorphism;

public class CreditCardPayment implements Payment{
	@Override
	public void pay(double amount) {
		System.out.println("payed "+ amount+ " via creditcard");
	}

}
