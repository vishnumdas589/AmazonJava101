package designPattern.Facade;

public class SoundSystem {
	public void off() {
		System.out.println("SoundSystem turn off");
	}
	public void setVolume(int level ) {
		System.out.println("playing sound at level " + level );
	}
	public void on() {
		System.out.println("turn on SoundSystem");
	}

}
