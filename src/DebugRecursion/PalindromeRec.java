package DebugRecursion;

public class PalindromeRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "water";
		String b = "malayalam";
		String c = "maddam";
		System.out.println(isPalin(a));
		System.out.println(isPalin(b));
		System.out.println(isPalin(c));

	}
	public static boolean isPalin(String str) {
		if(str.length() <= 1 ) {
			return true;
		}
		if(str.charAt(0) != str.charAt(str.length()-1)){
			return false;
		}
		return isPalin(str.substring(1,str.length()-1));
		
	}

}
