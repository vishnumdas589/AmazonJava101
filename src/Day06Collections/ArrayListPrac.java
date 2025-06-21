
package Day06Collections;
import java.util.ArrayList;


public class ArrayListPrac {
	public static void main(String[] args) {
		ArrayList<String> fruit = new ArrayList<>();
		fruit.add("Apple");
		fruit.add("Apple");
		fruit.add("mango");
		System.out.println(fruit);
		fruit.remove("Apple");
		fruit.set(1, "Orange");
		System.out.println(fruit);
		
	}
	

}
