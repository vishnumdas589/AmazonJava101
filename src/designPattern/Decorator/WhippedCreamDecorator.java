package designPattern.Decorator;

public class WhippedCreamDecorator extends CoffeeDecorator {
	public WhippedCreamDecorator(Coffee coffee) {
		super(coffee);
		// TODO Auto-generated constructor stub
	}
	public String description() {
		return super.decoratorCoffee.description()+ ", WhippedCream";
	}
	public double price() {
		return super.decoratorCoffee.price()+ 5.3;
	}

}
