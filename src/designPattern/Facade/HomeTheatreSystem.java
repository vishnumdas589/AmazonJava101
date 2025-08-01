package designPattern.Facade;

public class HomeTheatreSystem {
	Lights lights;
	Projector projector;
	SoundSystem soundSystem;
	DVDPlayer dvdPlayer;
	public HomeTheatreSystem(Lights lights,Projector projector,SoundSystem soundSystem,DVDPlayer dvdPlayer) {
		this.lights = lights;
		this.projector = projector;
		this.dvdPlayer = dvdPlayer;
		this.soundSystem = soundSystem;
	}
	public void playMovie(String name) {
		
		lights.dim(0);
		projector.on();
		projector.wideScreenMode();
		soundSystem.on();
		soundSystem.setVolume(7);
		dvdPlayer.on();
		dvdPlayer.playMovie(name);
	}
	public void endMovie() {
		lights.off();
		projector.off();
		soundSystem.off();
		dvdPlayer.off();
	}

}
