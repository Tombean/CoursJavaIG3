package audio;

public class Studio {

	public static void main(String[] args) {
		Player cdPlayer = new CDPlayer();
		Player tapePlayer = new TapePlayer();
		Player dvdPlayer = new DVDPlayer();
		
		cdPlayer.play();
		((TapePlayer)tapePlayer).record();
		dvdPlayer.play();
		cdPlayer.pause();
		cdPlayer.play();
		dvdPlayer.pause();
		cdPlayer.stop();
		dvdPlayer.play();
		dvdPlayer.stop();
	}

}
