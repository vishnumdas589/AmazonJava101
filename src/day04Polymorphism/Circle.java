package day04Polymorphism;

public class Circle extends Shape {
	double radius;
	Circle(double r ){
		this.radius = r;
	}
	@Override
	double area() {
		System.out.println("Circle");
		return Math.PI*radius* radius;
	}

}
