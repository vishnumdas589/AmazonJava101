package pactisceProblem;

import java.util.Arrays;
import java.util.HashSet;

public class findDuplicates {
	public static int [] A = {1,1,6,3,4,7,4,2,6,7,5,8,9};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		DupUsingArrays(A);
		DupUsingSet(A);
		DupUsingSort(A);
		DupUsingFreq(A);

	}
	public static void DupUsingArrays(int [ ]A) {
		int N = A.length;
		for ( int i = 0;i < N; i++ ) {
			for (int j =i+1 ; j < N; j++) {
				if(A[i] ==  A[j]) {
					System.out.print(A[i]);
					break;
				}
			}
		}
		System.out.println();
		
	}
	public static void DupUsingSet(int [ ] A ) {
		
		HashSet <Integer> seen = new HashSet();
		HashSet <Integer> dup = new HashSet();
		for (int x : A) {
			if(seen.contains(x)){
				if(dup.contains(x)) {
					continue;
				}
				dup.add(x);
			}else {
				seen.add(x);
			}	
		}
		for (int x: dup) {
			System.out.print(x);
		}
		System.out.println();
	}
	public static void DupUsingHashset(int [] A ) {
		
		
	}
	public static void DupUsingSort(int [] A ) {
		Arrays.sort(A);
		int N = A.length;
		for (int i = 1; i < N; i++) {
			if (A[i] == A[i-1] ) {
				System.out.print(A[i]);
				while(i < N && A[i] == A[i-1]) {
					i++;
				}
			}
			 
		}
		System.out.println();
		
		
		
	}
	public static void DupUsingFreq(int [] A) {
		int max = Integer.MIN_VALUE;
		for ( int x : A) {
			max = Math.max(max,x);
		}
		int [] freq = new int [max+1];
		for (int x: A) {
			freq[x]++;
		}
		for(int i =0; i < max+1; i++) {
			if(freq[i] > 1 ) {
				System.out.print(i);
			}
		}
		System.out.println();
	}

}
