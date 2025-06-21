package Day06Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class SetsPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] colors = {"red", "blue", "green" , "black"};
		Set<String> set  = new HashSet<>(Arrays.asList(colors));
		System.out.println("Hashset:" + set  );
		Set<String> linkedset  = new LinkedHashSet<>(Arrays.asList(colors));
		System.out.println("LinkedHashSet:" + linkedset  );
		Set<String> treeset  = new TreeSet<>(Arrays.asList(colors));
		System.out.println("TreeSet:" + treeset  );
		
		long start = System.nanoTime();
		set.contains("Orange"); 
		long end  = System.nanoTime();
		System.out.println("set: "+ (end -start) + "ns");
		 start = System.nanoTime();
		 linkedset.contains("Orange"); 
		 end  = System.nanoTime();
		 System.out.println("set: "+ (end -start) + "ns");
		 start = System.nanoTime();
		 treeset.contains("Orange"); 
		 end  = System.nanoTime();
		 System.out.println("set: "+ (end -start) + "ns");
		 
				
		
		 String [] alpa = {"r", "b", "n" , "b"};
		 Set<String> aplhaset  = new HashSet<>(Arrays.asList(alpa));
		 Set<String> union  = new HashSet<>();
		 union.addAll(set);
			System.out.println("Hashset:" + union  );

		 union.addAll(aplhaset);
			System.out.println("Hashset:" + union  );
			
		System.out.println(union.containsAll(Set.of("r", "Red")));

		 
		 
		
		

	}


}


