package audio;

public class Studio {

	public static void main(String[] args) {
		Player cdPlayer = new CDPlayer();
		Player tapePlayer = new TapePlayer();
		
		cdPlayer.play();
		((TapePlayer)tapePlayer).record();
		cdPlayer.pause();
		cdPlayer.play();
		cdPlayer.stop();
	}

}
