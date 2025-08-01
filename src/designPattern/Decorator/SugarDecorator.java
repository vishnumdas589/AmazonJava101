package designPattern.Decorator;

public class SugarDecorator extends CoffeeDecorator {
	public SugarDecorator(Coffee coffee) {
		super(coffee);
		// TODO Auto-generated constructor stub
	}
	public String description() {
		return super.decoratorCoffee.description()+ ", sugar";
	}
	public double price() {
		return super.decoratorCoffee.price()+ 1.0;
	}

	
}
