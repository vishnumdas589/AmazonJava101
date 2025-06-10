package day04Polymorphism;

public class Employee {
	String name;
	double salary;
	public Employee(String name, double salary) {
		// TODO Auto-generated constructor stub
		this.name =name;
		this.salary =salary;
		
	}
	double calulateBonus() {
		double bonus = salary * 0.1;
		System.out.println("emp bonus % " + bonus); 
		return bonus;
	}

}
