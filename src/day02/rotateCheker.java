package day02;

import java.util.HashMap;

public class rotateCheker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x= "abcd";
		String y = "cadb";
		boolean isRotated = true;
		
		
		String extented = x + x;
		if(x.length() == y.length()) {
			if(!extented.contains(y)) {
				isRotated =false;
			}
		}else {
			isRotated = false;
		}
		System.out.println("they rotated is " + isRotated );

	}

}
