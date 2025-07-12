package pactisceProblem;

import java.util.Stack;

public class pani {
	public static String str = "madam";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(paliUsingTwoPointer(str));
		System.out.println(paliUsingStack(str));
		System.out.println(paliUsingRec(str));
		

	}
	public static boolean paliUsingTwoPointer(String str) {
		char [] arr = str.toCharArray() ;
		int N = arr.length;
		int l = 0;
		int r = N-1;
		while (l < r) {
			if(arr[l] == arr[r]) {
				l++;
				r--;
			}else {
				return false;
			}
		}
		return true;
		
	}
	public static boolean paliUsingStack(String str) {
		char [] arr = str.toCharArray() ;
		int N = arr.length;
		Stack <Character> stack = new Stack ();
		int i =0;
		while ( i <N/2) {
			stack.push(arr[i++]);	
		}
		if(N%2 != 0) {
			i++;
		}
		while ( !stack.isEmpty()) {
			if(arr[i++] == stack.pop()) {
				
			}
			else {
				return false;
			}
		} 
		
		
		return true;
		
	}
	public static boolean paliUsingRec(String str) {
		int N = str.length();
		if(N == 1) {
			return str;
		}
		boolean ans = (N %2 ==0)? (paliUsingRec(str.substring(0,N/2+1)) ==paliUsingRec(str.substring(N/2+1,N-1))):(paliUsingRec(str.substring(0,N/2+1)) ==paliUsingRec(str.substring(N/2+2,N-1)));
		
		return ans;
		
	}
	 
	

}
