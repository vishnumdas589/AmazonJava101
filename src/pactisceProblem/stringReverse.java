package pactisceProblem;

import java.util.Stack;

public class stringReverse {
	public static String str = "Hello World";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(strRevUsingIter(str));
		System.out.println(strRevUsingTwoPointer(str));
		System.out.println(strRevUsingStrBulder(str));
		System.out.println(strRevUsingStack(str));
		

	}
	
	public static String strRevUsingIter( String str) {
		int N = str.toCharArray().length; 
		char [] charArr = new char [N];
		int counter= 0;
		for (int i = N-1; i>=0; i-- ) {
			charArr[counter++] = str.charAt(i);
		}
		return new String(charArr);
	}
	public static String strRevUsingStrBulder( String str) {
		int N = str.toCharArray().length; 
		StringBuilder builder = new StringBuilder(); 
		builder.append("");
		char [] charArr = str.toCharArray();
		int counter= 0;
		for (int i = 0; i < N; i++ ) {
			builder.insert(0,str.charAt(i));
		}
		return new String(builder);
	}
	public static String strRevUsingStack( String str) {
		int N = str.toCharArray().length; 
		StringBuilder builder = new StringBuilder(); 
		Stack<Character> stack = new Stack();
		char [] charArr = str.toCharArray();
		int counter= 0;
		for (int i = 0; i < N; i++ ) {
			stack.add(str.charAt(i));
		}
		while(!stack.isEmpty()) {
			char x = stack.pop();
			builder.append(x);
		}
		return new String(builder);
	}
	public static String strRevUsingTwoPointer( String str) {
		
		char [] charArr = str.toCharArray();
		int N = str.toCharArray().length; 
		int l = 0;
		int r = N-1;
		while(l < r) {
			char temp = charArr[l];
			charArr[l]= charArr[r];
			charArr[r] =temp;
			l++;
			r--;
		}
			
		return new String(charArr);
	}
//	public static String strRevUsingRec( String str) {
//		if(str.length() == 0) {
//			return;
//		}
//		return strRevUsingRec(str.substring(1)) + strRevUsingRec(str.charAt(0));
//		
//		
//	}
	
}
