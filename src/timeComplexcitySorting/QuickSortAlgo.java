package timeComplexcitySorting;
public class QuickSortAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {64,34,25,12,22};
		quickSort(arr,0,arr.length-1);
		for(int x : arr) {
			
			System.out.println(x);
		}

	}
	public static void quickSort(int [] arr, int l, int r) {
		if(l<r) {
			int pivort = partition(arr,l,r);
			quickSort(arr,l,pivort-1);
			quickSort(arr,pivort+1,r);
			
		}
		
	}
	public static int partition(int [] arr, int l, int r) {
		int i =l;
		int j = r;
		
		int pivort  = arr[l];
	
		while(i<j) {
			
			while (arr[i] <= pivort && i < r) {
				i++;
			}
			
			
			while (arr[j] > pivort && j > l ) {
				
				j--;
				
			}
			if(i < j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] =temp;	
			}
	
			
		}
		int temp2 = arr[l];
		arr[l] = arr[j];
		arr[j] =temp2;	

		
		
		return j;
	}

}
