package HashMapExcer;

import java.util.HashMap;

public class LongestSubString {

	public static void main(String[] args) {
		String s = "abcabcdeaa";
		System.out.println(checkLongestStr(s));
		
	}
	public static int checkLongestStr(String A) {
		int start = 0;
		int max = 0 ;
		HashMap <Character,Integer>map = new HashMap();
//		int idx= 0;
		for (int idx = 0 ; idx< A.length(); idx++) {
			char c = A.charAt(idx);
//			if(!map.containsKey(c)) {
//				max = Math.max((end- start)+1, max);
////				map.put(c, idx);
//			}
			if(map.containsKey(c)) {
				start = Math.max(map.get(c)+1,start);
								
			}
			max = Math.max(idx- start+1, max);
			map.put(c, idx);
			
			

			
		}
		return max;
		
	}
	

}