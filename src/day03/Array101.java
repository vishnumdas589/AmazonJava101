package day03;

public class Array101 {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		int [] arr = {1,2,3,4,5};
		int [] arr1 = new int [8];
		arr1[7] = 78; 
		System.out.println(arr[3]);
		System.out.println(arr1[7]);
		int n = arr1.length;
//		for(int i = 0 ; i <= n-1;i++) {
//			System.out.println(" element "+ i + " is "+ arr1[i]);
//		}
		boolean [] boolArray = new boolean[2];
		boolArray[1] =true;
		
		for(int i = 0 ; i <= 1;i++) {
			System.out.println(" element "+ i + " is "+ boolArray[i]);
		}

		

	}

}
