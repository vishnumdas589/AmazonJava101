package DebugRecursion;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 48;
		int b = 18;
		System.out.println(gcdCal(a,b));

	}
	public static int gcdCal(int a , int b) {
		if(b ==0) {
			return a;
		}
		return gcdCal(b, a%b);
	}

}
