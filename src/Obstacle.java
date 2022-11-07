
public class Obstacle implements Interraction{
	private int damages;
	
	Obstacle(int damages) {
		this.damages = damages;
	}
	
	@Override
	public String toString() {
		return "you loose " + damages;
	}

	@Override
	public void playZone(Player player) {
		player.damagesPlayer(damages);
	}
}
