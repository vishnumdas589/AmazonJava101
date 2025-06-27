package DebugRecursion;

public class PowerCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(powerCal(2,-2));
	}
	public static double powerCal(double b, int e) {
		if(e == 0) {
			return 1;
		}
//		double ans = 
		if(e>=0) {
			return b* powerCal(b,e-1);
		}else {
			return 1/(b*powerCal(b,(-e)-1));
		}
				
		
	}

}
