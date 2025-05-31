package day02;

public class PracticeProgrammes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseNumFor();
		checkAlpha();
		
	}
	public static void primeNumCheck() {
		// TODO Auto-generated method stub
		int num = 16;
		boolean isPrime = true ;
		if(num <=1 ) {
			isPrime = false;
		}else {
			for (int i = 2 ; i <= Math.sqrt(num); i++) {
				if (num %2 ==0) {
					isPrime = false;
				}
			}
		}
		System.out.println(num + " is a prime is " + isPrime);
		
	}
	public static void fibi() {
		// TODO Auto-generated method stub
		int n =10;
		int first = 1; 
		int sec = 2;
		System.out.print("Fibinnoci Series : " +first + " " + sec);
		for (int  i = 2 ; i <= n; i++) {
			int next  = first +sec;
			System.out.print( " "+next);
			first  = sec;
			sec = next;
		}
		
	}
	public static void factorialCal() {
		// TODO Auto-generated method stub
		int n = 5;
		long fac = 1;
		for (int i = 1 ; i <= n; i++){
			fac *= i;
		}
		System.out.println("factorial of "+ n + "is "+ fac);
	}
//	public static void binToDeci() {
//		// TODO Auto-generated method stub
//		int bin = 110110111;
//		int deci;
//		for (int i =0 ; i <= 0; i++) {
//			bin%10 
//		}
//	}
	public static void reverseNumWhile() {
		int n = 1234;
		int rev =0;
		while(n >0) {
			int rem = n%10;
			rev= rev*10 +rem;
			n = n/10;
		}
		System.out.println("asn is "+ rev);
	}
	
	public static void reverseNumFor() {
		int n = 1234;
		int rev =0;

		for (;n != 0;n /=10) {
			int rem = n%10;
			rev= rev*10 +rem;

		}
		System.out.println("asn is "+ rev);

	}
	public static void checkAlpha() {
		char ans = '5';
		if ((ans >= 'a' && ans <= 'z') ||(ans >= 'A' && ans <= 'Z')) {
			System.out.println(ans + " it is alpa");
		}else {
			System.out.println(ans + " not alpha");
		}
		
	}
//	public static void binToDeci() {}
//	public static void binToDeci() {}
//	

}
