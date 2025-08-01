package designPattern.Facade;

public class TestFacade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DVDPlayer dvd = new DVDPlayer();
		Lights lights = new Lights();
		Projector projector = new Projector();
		SoundSystem sound = new SoundSystem();
		HomeTheatreSystem homeTheatre = new HomeTheatreSystem(lights, projector, sound, dvd);
		homeTheatre.playMovie("The Matrix");
		 System.out.println("ENJOY THE MOVIE ");
		homeTheatre.endMovie();

	}

}
