package day04Polymorphism;

public class Manager extends Employee {
	public Manager(String name, double salary) {
		super(name, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	
	double calulateBonus() {
		// TODO Auto-generated method stub
		double bonus = super.calulateBonus()+300;
		System.out.println("manager bonus % " + bonus); 
		return bonus;
	}

}
