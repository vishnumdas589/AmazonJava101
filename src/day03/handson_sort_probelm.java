package day03;

public class handson_sort_probelm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		negHalfSorted();

	}
	public static void negHalfSorted(){
		int[] arr = {-7, -4,-2,1,2,5,7,8,15};
		int n = arr.length;
		int [] result = new int[n];
		int idxf =0 ;
		int idxl = n-1;
		int resultCounter =n-1;
		
		while (idxf <= idxl) {
			
			int fsq = arr[idxf]*arr[idxf];
			int lsq = arr[idxl]*arr[idxl];
			if (idxf == idxl) {
				result[0] = fsq;
				break;
			}
			
			if(fsq == lsq) {
				result[resultCounter] = fsq;
				result[resultCounter-1] = fsq;
				resultCounter-=2;
				idxf++;
				idxl--;
			}else if(fsq > lsq) {
				result[resultCounter] = fsq;
				idxf++;
				resultCounter--;
			}else {
				result[resultCounter] = lsq;
				idxl--;
				resultCounter--;
				
			}
			
		}
		
		for (int i = 0 ; i<= n-1; i++) {
			System.out.println(result[i]);
			
		}
		
	}


}
