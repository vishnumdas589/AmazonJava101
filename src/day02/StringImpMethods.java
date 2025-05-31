package day02;

public class StringImpMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "hello ";
		String b = "    World   ";
		String combined = a +" "+ b;
		System.out.println(combined);
		System.out.println(a.charAt(1));
		System.out.println(a.substring(0,4));
		System.out.println(b.trim());
		System.out.println(a.indexOf('l'));
		System.out.println(a.toUpperCase());
		System.out.println(a.equals("Hello "));
		System.out.println(a.equalsIgnoreCase("Hello "));
		System.out.println(a.replace('l','y'));
		
		
		
		
	
		

	}

}
