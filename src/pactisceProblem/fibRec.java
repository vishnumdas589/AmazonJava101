package pactisceProblem;
import java.util.*;

public class fibRec {
	public static HashMap <Integer,Integer>map = new HashMap();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =8;
//		int [] arr = new int [num+1];
		
//		for(int x : arr) {
//			x = -1;
//		}
		
		
		System.out.println(fibReursive(num, map));
//		for(Map., null) x : map.entrySet()) {
//			System.out.println(x);
//		}
		
		

	}
	public static int fibReursive(int n, HashMap map) {
		if( n <=1) {
			return n;
		}
		if(map.containsKey(n)) {
			return (int) map.get(n);
		}
		
		int n3 =fibReursive(n-2,map)+fibReursive(n-1, map);
		map.put(n,n3);
//		System.out.println(fibReursive(n-2));
		return n3;
		
	}

}
