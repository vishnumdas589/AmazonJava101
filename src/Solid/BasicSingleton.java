package Solid;

public class BasicSingleton {
	private static BasicSingleton instance;
	private BasicSingleton() {
		System.out.println("creating instance of singleton calss");
	}
	public static BasicSingleton getInstance() {
		if(instance == null) instance = new BasicSingleton();
		return instance;
	}
	public void printInstance(){
		System.out.println("hello from singleton");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicSingleton singletonInstance1 = BasicSingleton.getInstance();
		singletonInstance1.printInstance();
		BasicSingleton singletonInstance2 = BasicSingleton.getInstance();
		singletonInstance2.printInstance();
		

	}

}
