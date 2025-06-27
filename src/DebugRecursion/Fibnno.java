package DebugRecursion;

public class Fibnno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibino(5));
	}
	public static int fibino(int n) {
		if(n == 0 || n == 1) {
			return n;
		}
		return fibino(n-1)+fibino(n-2);
	}

}
