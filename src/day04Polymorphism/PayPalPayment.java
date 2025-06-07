package day04Polymorphism;

public class PayPalPayment implements Payment {
	@Override
	public void pay(double amount) {
		System.out.println("payed "+ amount+ " via paypal");
	}

}
