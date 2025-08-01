package designPattern.Decorator;

public class SimpleCoffe implements Coffee{

	@Override
	public String description() {
		return "Plain Coffee";
		
	}

	@Override
	public double price() {
		// TODO Auto-generated method stub
		return 2.0;
	}

}
