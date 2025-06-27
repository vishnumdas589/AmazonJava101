package DebugRecursion;

public class BinarySearchRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,5,6,9,45,76,78,98};
		System.out.println(binarySearch(arr, 0, arr.length, 78));

	}
	public static int binarySearch(int [] arr, int l, int r,int target ) {
		if(l > r) {
			return -1;
		}
		int m  = l+ (r-l+1)/2;
		if(arr[m] == target) {
			return m;
		}
		if(arr[m] < target) {
			return binarySearch(arr, m+1, r, target);
		}else {
			return binarySearch(arr, l, m-1, target);
		}
	}

}
