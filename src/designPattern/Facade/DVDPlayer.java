package designPattern.Facade;

public class DVDPlayer {
public void off() {
	System.out.println("dvd trun off");
}
public void playMovie(String name ) {
	System.out.println("playing movie " + name );
}
public void on() {
	System.out.println("turn on DVD");
}
}
