package timeComplexcitySorting;

import java.util.Arrays;

public class MergeSortAlgo_Onlogn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr1= {64,34,25,12,22,11,90};
		int [] arr2= {34,31,25,342,38,32,67};
		 
//		int [] arrAns = mergeSort(arr1);
		for (int x : mergeSort(arr2) ) {
			
			System.out.print(x + " ");
		}


	}
	public static int []  mergeSort(int [] arr) {
		if(arr.length <= 1) {
			return arr;
		}
		int mid = arr.length/2;
		int [] l = Arrays.copyOfRange(arr, 0, mid);
		int [] r = Arrays.copyOfRange(arr, mid, arr.length);
		mergeSort(l);
		mergeSort(r);
		return merge(arr,l,r);
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
