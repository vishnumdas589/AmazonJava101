package Day06Collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		LinkedList <String> linked = new LinkedList<>();
//		linked.add("berlin");
//		linked.add(0,"asia");
//		linked.add("russia");
//		linked.offer("last");
////		linked.pop();
//		System.out.println(linked);
//		
		int size  = 100000;
//		
		
		List <Integer> linked = new LinkedList<>();
		List <Integer> arr = new LinkedList<>();
		long start = System.currentTimeMillis();
		for (int  i = 0 ; i < size; i++) {
			linked.add(0,i);
		}
		long end = System.currentTimeMillis();
		System.out.println("adding operation time for in linked "+ (end -start ) + " ns");
		
		start = System.currentTimeMillis();
		for (int  i = 0 ; i < size; i++) {
			arr.add(0,i);
		}
		end = System.currentTimeMillis();
		System.out.println("adding operation time for in arr at a start "+ (end -start) + " ns");
		
		start = System.currentTimeMillis();
		for (int  i = 0 ; i < size; i++) {
			arr.get(i);
		}
		end = System.currentTimeMillis();
		System.out.println("random access operation time for in arr at a start "+ (end -start) + " ns");
		
		
		start = System.currentTimeMillis();
		for (int  i = 0 ; i < size; i++) {
			linked.get(i);
		}
		end = System.currentTimeMillis();
		System.out.println("random access operation time for in linked "+ (end -start ) + " ns");
		
		

	}

}
