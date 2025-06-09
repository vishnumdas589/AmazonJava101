package day04OOPS;

public class Student extends Person{
	int roll_no ;
	public Student(String name,int roll_no) {
		
		// TODO Auto-generated constructor stub
		super(name);
		this.roll_no = roll_no;
		
	}
	public void display() {
		super.display();
		System.out.println("roll number is "+ roll_no);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
