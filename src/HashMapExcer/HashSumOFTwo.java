package HashMapExcer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class HashSumOFTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] list = {2,7,8,3,1};
		int [] ans  = sumOfTwo(list , 16);
		System.out.println(Arrays.toString(ans));

	}
	public static int [] sumOfTwo(int [] A, int target) {
		int N = A.length;
		HashMap<Integer, Integer> map = new HashMap();
		for ( int i = 0 ; i < N;i++) {
			int other  = target - A[i];
			if(map.containsKey(other)) {
				return new int [] {map.get(other),i};
			}
			map.put(A[i],i);
			
		}
		return new int [] {-1,-1};
	}

}
