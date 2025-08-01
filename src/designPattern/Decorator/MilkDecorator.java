package designPattern.Decorator;

public class MilkDecorator extends CoffeeDecorator{

	public MilkDecorator(Coffee coffee) {
		super(coffee);
		
		// TODO Auto-generated constructor stub
	}
	public String description() {
		return super.decoratorCoffee.description()+ ", milk";
	}
	public double price() {
		return super.decoratorCoffee.price()+ 3.0;
	}


}
