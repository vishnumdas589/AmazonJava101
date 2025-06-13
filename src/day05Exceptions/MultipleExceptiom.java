package day05Exceptions;

public class MultipleExceptiom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("sada");
//		String input = "123a";
//		int num = Integer.parseInt(input);
//		int [] arr = new int [4];
//		arr[2] = num;
//		System.out.println(arr[2]);
		try {
			String input = "123";
			int num = Integer.parseInt(input);
			int [] arr = new int [4];
			arr[2] = num;
			for (int i : arr){
				System.out.println(i);
			}
			
		}
				catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
		}
		catch(NumberFormatException e){
			System.out.println(e.getMessage());
		}

		

	}

}
