package day02;
import java.util.HashMap;
import java.util.Map;


public class FrquencyAndWordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String txt = "Hello World! this is a simple text for analysis.";
		String [] txtArray = txt.split("\\S+");
		int wordCount = txtArray.length;
		HashMap<Character,Integer> map = new HashMap();
		for (char ch : txt.toCharArray()) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
		}
		for (HashMap<Character,Integer> entry : map.entrySet()) {
			String key = entry.getKey();
			
			
			
		}
		
		

	}

}
