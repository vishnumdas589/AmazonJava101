package timeComplexcitySorting;

import java.util.Arrays;

public class mergesort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1= {64,34,25,12,22,11,90};
		int [] arr2= {34,31,25,342,38,32,67};
		mergesortalgo(arr1,0,arr1.length-1);
		
		 
//		int [] arrAns = mergeSort(arr1);
		for (int x :arr1  ) {
			
			System.out.print(x + " ");
		}

	}	
	public static void  mergesortalgo(int []arr ,int l, int r ) {
		if(l<r) {
				
		
			int mid = l+ (r-l)/2;
//			System.out.println(l);
//			System.out.println(r);
//			System.out.println(mid);
			
			mergesortalgo(arr,l, mid);
			mergesortalgo(arr, mid+1, r);
			merge(arr, l, r, mid);
		}
		
	}
	public static void merge(int [] arr, int l, int r , int mid) {
//		create 2 temp array 
//		there length
//		make a copy and then check which is bigger adnd add
		int n1 = mid-l+1;
		int n2 = r-mid;
		int []left =new int [n1]; 
		int []right =new int [n2]; 
		left = Arrays.copyOfRange(arr, l, mid+1);
		right = Arrays.copyOfRange(arr, mid+1, r+1);
		System.out.println(left.toString());
		System.out.println(right.toString());
		int i =0 ;
		int j =0 ;
		int k =0 ;
		
		
		while (i < n1 && j < n2) {
			if(left[i] <= right[j]) {
				arr[k++] = left[i++];
			}else {
				arr[k++] = right[j++];
			}	
		}
		
		while (i < n1) {
			arr[k++] = left[i++];
		}
		while (j < n2) {
			arr[k++] = right[j++];
		}
		
				
		
	}


}
