package day02;

public class DeciToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  bin = 0;
		int deci = 5;
		int i = 1;
		
		while(deci > 0) {
			int rem = deci % 2;
			deci = deci /2;
			bin += rem*i;
			i*=10;
		}
		System.out.println("binary is "+ bin);

	}

}
