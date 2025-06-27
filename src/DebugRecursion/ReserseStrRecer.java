package DebugRecursion;

public class ReserseStrRecer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello World";
		System.out.println(reverseString(str));
		
	}
	public static String reverseString(String str) {
		if(str.length() <=1) {
			return str;
		}
		return reverseString(str.substring(1)) + str.charAt(0);
	}
}
