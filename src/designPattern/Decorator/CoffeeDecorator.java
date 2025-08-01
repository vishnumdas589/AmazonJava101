package designPattern.Decorator;

public abstract class CoffeeDecorator implements Coffee {
	protected Coffee decoratorCoffee;
	
	public CoffeeDecorator(Coffee coffee) {
		this.decoratorCoffee = coffee;
	}
	
	public String description() {
		return this.decoratorCoffee.description();
	}
	public double price() {
		return this.decoratorCoffee.price();
	}
	

}
