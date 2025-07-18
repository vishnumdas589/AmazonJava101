package HashMapExcer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class AnagramSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] s = new String [] {"cat","tac","pam","fan","act","map"};
		ArrayList<ArrayList<String>> ans = getAnagram(s);
		System.out.println(ans.toString());

	}
	public static ArrayList<ArrayList<String>> getAnagram(String [] A){
		HashMap <String, ArrayList<String>> map = new HashMap();
		int N = A.length;
		for ( String x : A) {
			char [] c = x.toCharArray();
			Arrays.sort(c);
			String key = c.toString();
			if(!map.containsKey(key)) {
				map.put(key, new ArrayList() );
			}
			
			map.get(key).add(x);
		}
		return new ArrayList<>(map.values());
	}

}
