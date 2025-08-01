package Solid;

public class EagerSingleton {
	private static EagerSingleton instance = new EagerSingleton();
	private EagerSingleton() {
		System.out.println("created eager sinstance");
	}
	public static EagerSingleton getInstance() {
		return instance;
		
	}
	public void printInstance(){
		System.out.println("hello from singleton");
	}


}
