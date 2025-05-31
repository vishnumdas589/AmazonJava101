package day02;

public class palindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "madadadam";
		int n = str.length();
		boolean isPaline= true;
		for (int i = 0 ; i < n/2;i++) {
			if(str.charAt(i) != str.charAt(n-1-i)) {
				isPaline = false;
				break;
			}
		}
		System.out.println(isPaline);

	}

}
