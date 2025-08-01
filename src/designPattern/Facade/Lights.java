package designPattern.Facade;

public class Lights {
	public void dim(int level) {
		System.out.println("Lights dim to level" + level);
	}
		public void off() {
		System.out.println("turn off Lights");
	}
}
