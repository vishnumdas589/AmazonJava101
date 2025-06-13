package day05Exceptions;

public class AgeValidator {
	public static void validateAge(int age) throws InvalidAgeException {
		if(age < 0 ||age>120 ) {
			throw new InvalidAgeException("age must be between 0 and 120 from validateAge method");
		}
	}
	public static void outerMethod() throws InvalidAgeException{
		validateAge(-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			outerMethod();
		}catch(InvalidAgeException e){
			System.out.println(e.getMessage());
		}

	}

}
