package pactisceProblem;

public class fibFIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibBin(8));	}
	public static double fibBin(int n) {
		double x = (1+Math.sqrt(5))/2;
		double y = (1-Math.sqrt(5))/2;
		double ans = (1/Math.sqrt(5))*(Math.pow(x,n)-Math.pow(y,n));
		return ans;
	}

}
