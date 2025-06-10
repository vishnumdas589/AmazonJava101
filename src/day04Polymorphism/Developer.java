package day04Polymorphism;

public class Developer extends Employee{
	public Developer(String name, double salary) {
		super(name, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	double calulateBonus() {
		// TODO Auto-generated method stub
		double bonus = super.calulateBonus()+500;
		System.out.println("dev bonus % " + bonus ); 
		return bonus;
	}

}
