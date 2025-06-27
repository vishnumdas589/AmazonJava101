package DebugRecursion;

public class DigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(DigSum(15));

	}
	public static int DigSum(int n) {
		if(n < 10) {
			return n;
		}
		return (DigSum(n/10)) +DigSum(n%10);
		
		
	}

}
