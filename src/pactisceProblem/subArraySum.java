package pactisceProblem;

public class subArraySum {
	public static int [] arr = {1,1,1,1,1,1,1,1};
 	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 		System.out.println(subArrSumUsingSliding(arr,3));
 		int [] ans=subArrayWithGivenSum(arr,5);
 		System.out.println(ans[0]);
 		System.out.println(ans[1]);
		
	}
 	public static int subArrSumUsingSliding(int [] arr, int k) {
 		int N  = arr.length;
 		int maxSum  = 0; 
 		int sum =0 ;
 		for ( int i =0 ; i < k;i++ ) {
 			sum+= arr[i];
 		}
 		maxSum= sum;
 		
 		for (int i = k ; i<N;i++) {
 			sum+=arr[i]- arr[i-k];
 			
 			maxSum= Math.max(maxSum, sum);
 		}
 		return maxSum;
 	}
 	public static int [] subArrayWithGivenSum(int [] arr, int value) {
 		int N  = arr.length;
 		int idx1 =0;
 		int idx2 =0;
 		
 		int sum =0 ;
// 		
 		sum = arr[0];
 		while(idx1<= idx2 && idx2 <=N-1) {
 			
 			if(sum == value ) {
 				return new int [] {idx1,idx2};
 			}else if(sum < value) {
 				sum+= arr[++idx2];
 				
 			}else if(sum > value) {
 				sum-=arr[idx1++];
 				
 			}
 			
 		}
 		return new int [] {-1,-1};
 	}
 	public static int subArrStrctlyIncr(int [] A) {
 		int N  = arr.length;
 		int count  = 0; 
 		int sum =0 ;
 		int first = A[0];
 		for ( int i =1 ; i <N;i++ ) {
 			if(first > A[i] ) {
 				continue;
 			}
 			
 		}
 		maxSum= sum;
 		
 		for (int i = k ; i<N;i++) {
 			sum+=arr[i]- arr[i-k];
 			
 			maxSum= Math.max(maxSum, sum);
 		}
 		return maxSum;
 	}

 	

}
