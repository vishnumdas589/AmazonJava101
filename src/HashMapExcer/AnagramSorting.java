package HashMapExcer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class AnagramSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] s = {"cat","tac","pam","fan","act","map"};
		getAnagram(s);
	}
	public static void getAnagram(String [] A){
		HashMap <String, ArrayList<String>> map = new HashMap();
		int N = A.length;
		for ( String x : A) {
			
			char [] c = x.toCharArray();
			Arrays.sort(c);
			String key = new String(Arrays.toString(c));
			
			
			if(!map.containsKey(key)) {
				map.put(key, new ArrayList<String>() );
			}
			map.get(key).add(x);
		}
		System.out.println(map.values());
	}

}
