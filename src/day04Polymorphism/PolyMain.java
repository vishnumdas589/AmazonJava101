package day04Polymorphism;

public class PolyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Shape s = new Circle(5D);
//		double area =s.area();
//		System.out.println(area);
//		
//		System.out.println("");
//		
//		Payment payment = new BankTransferPayment();
//		payment.pay(100D);
//		payment = new PayPalPayment();
//		payment.pay(110D);
//		payment = new CreditCardPayment();
//		payment.pay(130D);
//		
//		System.out.println("");
//
//		Animal [] animals = new Animal[4];
//		animals[0]= new Animal();
//		animals[1]= new Dog();
//		animals[2]= new Cat();
//		animals[3]= new Lion();
//		
//		for (Animal a : animals) {
//			a.makeSound();
//		}
		Employee e = new Employee("ram" ,500);
		Employee d = new Developer("vishnu" ,500);
		Employee m = new Manager("avi" ,500);
		
		e.calulateBonus();
		m.calulateBonus();
		d.calulateBonus();
	}

}
