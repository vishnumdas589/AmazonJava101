package timeComplexcitySorting;

public class selectionSort_Onlogn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {64,34,25,12,22,11,90};
		for(int x : selectSort(arr)) {
			
			System.out.println(x);
		}
		

	}
	public static int [] selectSort(int [] A) {
		int N = A.length;
		for (int i = N-1; i >=1; i--) {
			int maxIdx = i;
			for(int j = 0 ; j < i; j++) {
				if(A[maxIdx] <A[j]) {
					maxIdx = j;
				}
			}
			int temp = A[i];
			A[i] = A[maxIdx];
			A[maxIdx] = temp;
			
		}
		return A;
	}

}
