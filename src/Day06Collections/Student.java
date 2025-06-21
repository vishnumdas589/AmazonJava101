package Day06Collections;

public class Student {
	int age ;
	String name;
	public Student(String name , int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " (" + age + ")" ;
	}
	

}
