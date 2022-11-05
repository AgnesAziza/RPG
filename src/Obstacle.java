
public class Obstacle {
	private int damages;
	
	Obstacle(int damages) {
		this.damages = damages;
	}
	
	public int damages() {
		return damages;
		
	}
	@Override
	public String toString() {
		return "you loose " + damages;
	}
}
