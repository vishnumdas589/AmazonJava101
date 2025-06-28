package timeComplexcitySorting;

public class mergesort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1= {64,34,25,12,22,11,90};
		int [] arr2= {34,31,25,342,38,32,67};
		 
//		int [] arrAns = mergeSort(arr1);
		for (int x : mergesortalgo(arr1,0,arr1.length-1) ) {
			
			System.out.print(x + " ");
		}

	}	
	public static int [] mergesortalgo(int []arr ,int l, int r ) {
		if(arr.length > 1) {
			return arr;	
		}
			int mid = l+ (r-l)/2;
			System.out.println(l);
			System.out.println(r);
			System.out.println(mid);
			
			int []left =  mergesortalgo(arr,l, mid);
			int []right = mergesortalgo(arr, mid+1, r);
			return merge(arr, left, right );
		
	}
	public static int [] merge(int [] arr, int [] l, int [] r ) {
		int i =0;
		int j = 0;
		int k = 0;
		
		while (i < l.length && j <r.length) {
			if(l[i]<r[j]) {
				arr[k++] = l[i++];
			}else {
				arr[k++] =r[j++];
			}
		}
		while (i < l.length) {
			arr[k++] = l[i++];
		}
		while (i < l.length && j <r.length) {
			arr[k++] =r[j++];
		}
		return arr;
		
	}


}
