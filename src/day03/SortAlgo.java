package day03;

public class SortAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,6,2,7,8,1,5};
		int n = arr.length;
		for (int i = 0 ; i< n-1; i++) {
			for (int j = i+1; j <= n-1; j++ ) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i =0 ; i< n; i++) {
			System.out.println("at index "+ i + " value is " +arr[i]);
		}

	}

}
