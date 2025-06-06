package day03;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr  = {00,11,22,33,44,55,66,77,88,99};
		int n = arr.length;
		int l = 0;
		int h = n-1;
		int value = 00;
		while (h >= l) {
			int mid = l + (h-l)/2;
			if (value == arr[mid]) {
				System.out.println("we found " + value);
				break;
			}else if(value >= arr[mid]) {
				l = mid+1;
			}else {
				h = mid-1;
			}
		}

	}
}
