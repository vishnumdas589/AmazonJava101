package day04OOPS;
import java.util.Stack;

public class ClassMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = stringReverse("vishnu");
		int [] values = {1,3,4,6};
		int maxValue = findMax(values);
		int factNum = 10;
		int factorialvalue = factorial(factNum); 
		System.out.println("name reversed is " + name);
		System.out.println("max value   is " + maxValue);
		System.out.println("facotial value of " + factNum+" is " +factorialvalue);

	}
	public static String stringReverse(String text) {
		StringBuilder reversedText = new StringBuilder();
		Stack<Character> stack = new Stack();
		for (char ch : text.toCharArray()) {
			stack.push(ch);
		}
		for (char ch : text.toCharArray()) {
			reversedText = reversedText.append(stack.pop().toString());
		}

		
		return reversedText.toString();
		
		
	}
	public static int findMax(int[] values) {
		int maxValue =0 ;
		for (int ele : values) {
			if(ele > maxValue) {
				maxValue = ele;			
			}
			
		}
		return maxValue;
		
	}
	public static int factorial(int value) {
		if ( value == 0 || value ==1) {
			return 1;
		}
		return value * factorial( value-1);
	}
	

}
