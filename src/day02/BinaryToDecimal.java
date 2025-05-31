package day02;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long bin = 110110111L;
		int deci =0;
		int power =0;
		while (bin != 0) {
			long rem = bin%10;
			deci +=rem*Math.pow(2, power);
			bin /= 10;
			++power;
		}
		System.out.println(deci);


	}

}
