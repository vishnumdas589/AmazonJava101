package Solid;

public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EagerSingleton singletonInstance1 = EagerSingleton.getInstance();
		singletonInstance1.printInstance();
		EagerSingleton singletonInstance2 = EagerSingleton.getInstance();
		singletonInstance2.printInstance();

	}

}
