package timeComplexcitySorting;

public class BInarySearchFirstOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,2,2,2,3,3,4,4,5};
		System.out.println(FirstOcc(arr, 2));

	}
	public static int FirstOcc(int [] arr, int target) {
		int l = 0 ; 
		int r = arr.length-1;
		int ans = -1;
		while(l<=r) {
			int mid = l+ (r-l)/2;
			if(arr[mid] == target) {
				ans = mid;
				r = mid-1;
			}
			if(arr[mid]< target) {
				l = mid +1;
			}else {
				r =mid-1;
			}
		}
		return ans;
	}

}
