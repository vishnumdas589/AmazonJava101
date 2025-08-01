package designPattern.Builder;

public class User {
	private String firstName;
	private String lastName;
	private int age;
	private String mobileNo;
	private String address;
	public User(Builder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.address = builder.address;
		this.mobileNo = builder.mobileNo;
	}
	public void print() {
		System.out.println("full name : " + firstName+" "+ lastName+ ", age : " + age+", address : " + address+", mobile : " + mobileNo );
	}
	public static class Builder {
		private final String firstName;
		private final String lastName;
		private int age;
		private String mobileNo;
		private String address;
		public Builder(String firstName , String secondName) {
			this.firstName = firstName;
			this.lastName = secondName;
		}
		public Builder age(int age) {
			this.age = age;
			return this;
		}
		public Builder address(String address) {
			this.address =address;
			return this;
		}
		public Builder mobile(String mobileNo) {
			this.mobileNo = mobileNo;
			return this;
		}
		public User build() {
			if(this.validate()) {
				User user = new User(this);
				return user;
			}
			throw new IllegalStateException("age should be more than 18");
			
		}
		public boolean validate() {
			if(this.age < 18) {
				return false;
			}
			return true;
		}
	}


}
