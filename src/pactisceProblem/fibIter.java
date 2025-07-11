package pactisceProblem;

public class fibIter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibIterative(8);
		
	}
	public static void fibIterative(int n) {
		int  n1 =0;
		int n2 = 1;
		for (int i =0; i < n;i++) { 
			System.out.print(n1 + " ");
			int n3 = n1+n2;
			n1= n2;
			n2 = n3;
		}
	}

}
