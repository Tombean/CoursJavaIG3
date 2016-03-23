package audio;

public class DVDPlayer implements Player {

	@Override
	public void play() {
		System.out.println("Trala la la la ! ");

	}

	@Override
	public void stop() {
		System.out.println("Chuuuuuuuuut ! ");

	}

	@Override
	public void pause() {
		System.out.println("Et je coupe le son !!! ");

	}

	@Override
	public void reverse() {
		System.out.println("! al al al alarT ");

	}

}
