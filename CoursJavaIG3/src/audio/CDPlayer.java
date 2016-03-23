package audio;

public class CDPlayer implements Player {

	@Override
	public void play() {
		System.out.println("Now playing !");
	}

	@Override
	public void stop() {
		System.out.println("Now stopped !");
	}

	@Override
	public void pause() {
		System.out.println("Now paused !");
	}

	@Override
	public void reverse() {
	}

}
