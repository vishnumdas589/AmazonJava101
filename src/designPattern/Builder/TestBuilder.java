package designPattern.Builder;

public class TestBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user1 = new User.Builder("vishnu", "mdas").age(28).address("xyz").mobile("834743").build();
		user1.print();
		try{
		User user2 = new User.Builder("sdsa", "sad").age(12).address("xsyz").mobile("834743").build();
		}catch(IllegalStateException e) {
			System.out.println("Errror: " + e.getMessage());
		}
		
	}

}
