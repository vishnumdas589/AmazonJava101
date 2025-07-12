package pactisceProblem;

import java.util.Arrays;

public class squareFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {-2,-1,0,1,2,3,4,5};
		System.out.println(Arrays.toString(squareFuncUsingTwoPointer(A)));
		System.out.println(Arrays.toString(squareFuncUsingMerging(A)));
		

	}
	public static int [] squareFuncUsingTwoPointer(int [] A) {
		int N   = A.length;
		int idx = N-1; 
		int left = 0;
		int right = N-1;
		int [] ans  = new int [N];
		
		while (left<right) {
			int l =  A[left]* A[left];
			int r = A[right]*  A[right];
			
			
			if(r>=l) {
				ans[idx--] = r;
				right--;
			}else {
				ans[idx--] = l;
				left++;
			}
		}
		return ans;
	}
	public static int [] squareFuncUsingMerging(int [] A) {
		
		int N   = A.length;
		int idx=0;
		while(A[idx]<0) {
			idx++;
		}
		int i = 0 ; 
		int j = idx;
		int k = 0;
		int [] ans  = new int [N];
		while(i < idx && j <N) {
			int l =  A[i]* A[i];
			int r =  A[j]* A[j];
			
			
			if(r<=l) {
				ans[k++] = r;
				j++;
				
			}else {
				ans[k++] = l;
				i++;
			}

		}
		while(i < idx) {
			int l =  A[i]* A[i];
			ans[k++] = l;
			i++;
		}
		while(j< N) {
			int r =  A[j]* A[j];
			ans[k++] = r;
			j++;
		}
		return ans;
	}

}
