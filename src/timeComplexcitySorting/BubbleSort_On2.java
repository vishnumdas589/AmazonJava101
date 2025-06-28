package timeComplexcitySorting;

public class BubbleSort_On2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {64,34,25,12,22,11,90};
		String str = "helloworld";
		for(int x : BubbleSortDesc(arr)) {
			
			System.out.println(x);
		}
//		String ans = BubbleSort(str);
//		for(int i = 0 ; i < str.length();i++) {
//			
//			System.out.println(newStr.charAt(i));
//		}
//		System.out.println(str);
//		System.out.println(ans);
	}

	public static int [] BubbleSort(int [] A) {
		int N  = A.length;
		for(int i = 0 ; i < N-1;i++) {
			for ( int j = 0; j<N-i-1; j++) {
				if(A[j] > A[j+1]) {
					int temp = A[j];
					A[j] = A[j+1];
					A[j+1] = temp;					
				}
			}
		}
		return A; 
		
		
	}
	public static int [] BubbleSortDesc(int [] A) {
		int N  = A.length;
		for(int i = 0 ; i < N-1;i++) {
			for ( int j = 0; j<N-i-1; j++) {
				if(A[j] < A[j+1]) {
					int temp = A[j];
					A[j] = A[j+1];
					A[j+1] = temp;					
				}
			}
		}
		return A; 
		
		
	}
	public static String  BubbleSort(String A) {
		char [] arr = A.toCharArray(); 
		int N  = arr.length;
		for(int i = 0 ; i < N-1;i++) {
			for ( int j = 0; j<N-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					char temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;					
				}
			}
		}
		return new String(arr);
		
		
	}
}
