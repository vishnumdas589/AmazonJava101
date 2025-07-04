package timeComplexcitySorting;

public class CountSortALgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int [] arr = {4,4,4,6,8,8,2,2,2,2,1,1,1};
	for (int x :arr  ) {
		
		System.out.print(x + " ");
	}
	System.out.println();
	countSort(arr);
	for (int x :arr  ) {
		
		System.out.print(x + " ");
	}
	}
	public static void countSort( int [] arr) {
		int arrN= arr.length;
		int N = 0;
		for (int i= 0 ;i < arrN; i++) {
			if(arr[i]> N) {
				N = Math.max(arr[i], N);
			}
		}
		int [] count = new int [N+1];
		for (int i= 0; i < arrN; i++) {
			count[arr[i]]++;
			
		}
//		{0-0,1-3,2-3,3-0,4-3,6-1,8-2)
//		int [] ans = new int [arr.length];
		int k = 0;
		for (int i = 0 ; i < N+1;i++) {
			for (int j = 1;j <= count[i];j++ ) {
				arr[k++] = i;
				
			}
		}
		
	}

}
