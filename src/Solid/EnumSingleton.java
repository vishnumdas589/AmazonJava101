package Solid;

public enum EnumSingleton {
	INSTANCE;
	private EnumSingleton() {
		System.out.println("created enum singleton instance");
	}
	
	public static void main(String[] args) {
		EnumSingleton singleton1 = EnumSingleton.INSTANCE;
		singleton1.printInstance();
		EnumSingleton singleton2 = EnumSingleton.INSTANCE;
		singleton2.printInstance();
		System.out.println("same instance?" + (singleton1 == singleton2));
		
	}
	public void printInstance(){
		System.out.println("hello from singleton");
	}


}
