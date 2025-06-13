package day04OOPS;

public class InheritanceBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Shape s1 = new Circle();
//		Shape s2 = new Shape();
//		s1.draw() ;
//		s2.draw();
		
//		Student s = new Student("vishnu", 44);
//		Person p = new Student("ram", 55);
//		s.display();
//		p.display();
//		
//		
//		Bank b1 = new PNB();
//		Bank b2 = new SBI();
//		int pnb = b1.rateOfInterest();
//		int sbi = b2.rateOfInterest();
//		System.out.println("PNI " + pnb + " & SBI "+ sbi );
		Parrot p = new Parrot();
		Animal a = new Parrot();
		Bird b = p;
		
		p.talk();
		
		
	
	}

}
