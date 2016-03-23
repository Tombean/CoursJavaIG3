package audio;

public class TapePlayer implements Recorder {
	public void record(){
		System.out.println("Silence, on enregistre ! ");
	}

	@Override
	public void play() {		
	}

	@Override
	public void stop() {
	}

	@Override
	public void pause() {
	}

	@Override
	public void reverse() {
	}
	
}
