package day05practiseProb;

public class Rectangle {
	private double width;
	private double height;
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	public double getArea() {
		return this.width * this.height;
		
	}
	public double getPerimeter() {
		return 2*(this.width + this.height);
	}
	public boolean isSquare() {
		boolean flag = false;
		if(this.width == this.height) {
			flag = true;
		}
		return flag;

	}
		

}
