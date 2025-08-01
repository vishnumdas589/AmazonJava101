package Solid;

public class ThreadSafeSingleton {
	private static ThreadSafeSingleton instance;
	private ThreadSafeSingleton() {
		System.out.println("Thread safe instance created");
	}
	public static synchronized ThreadSafeSingleton getInstance() {
		if(instance == null) return instance = new ThreadSafeSingleton();
		return instance;
	}
	public void printInstance(){
		System.out.println("hello from singleton");
	}

	

}
