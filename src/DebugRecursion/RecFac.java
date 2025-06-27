package DebugRecursion;

public class RecFac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fib(4));
	}
	public static int fib(int a) {
		if(a <= 1) {
			return 1;
		}
		return a * fib(a-1);
	}

}
