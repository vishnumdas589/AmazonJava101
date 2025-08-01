package designPattern.Decorator;

public class TestDecorator {
	public static void main(String[] args) {
		Coffee cofee = new WhippedCreamDecorator(new SugarDecorator(new MilkDecorator(new SimpleCoffe())));
		System.out.println("cofee :" + cofee.description() + " Cost : " + cofee.price()+ " $");
	}
}
