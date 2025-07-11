package pactisceProblem;

import java.math.BigInteger;
import java.util.HashMap;


public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorialUsingIteration(4));
		System.out.println(factorialUsingRec(4));
		System.out.println(factorialUsingRecDP(4));
		System.out.println(factorialUsingIterationBigInt(4));
		

	}
	public static int factorialUsingIteration(int n) {
		
		if(n == 0 || n == 1) {
			return n;
		}
		int ans =1;
		for (int i = 1 ; i <= n;i++ ) {
			 ans= ans*i; 
		}
		return ans;
	}
	public static BigInteger factorialUsingIterationBigInt(int n) {
		
		if(n == 0 || n == 1) {
			return java.math.BigInteger.ONE;
		}
		BigInteger ans =BigInteger.ONE;
		for (int i = 1 ; i <= n;i++ ) {
			ans= ans.multiply(BigInteger.valueOf(i));
		}
		return ans;
	}
	public static int factorialUsingRec(int n) {
		if(n <0) {
			throw new IndexOutOfBoundsException();
		}
		if(n == 0 || n == 1) {
			return n;
		}
		return factorialUsingIteration(n-1)*n;
		
	}
	public static int factorialUsingRecDP(int n) {
		HashMap<Integer,Integer> map = new HashMap();
		if(n <0) {
			throw new IndexOutOfBoundsException();
		}
		if(n == 0 || n == 1) {
			return n;
		}
		if(map.containsKey(n)) {
			return map.get(n);
		}
		int nNew= factorialUsingIteration(n-1)*n;
		map.put(n,nNew );
		return nNew;
		
	}

}
