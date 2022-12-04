import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class DeplacementKeyXY implements KeyListener  {
	
	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("a" + e.getKeyCode());
		if (e.getKeyCode() == 38) {
		}
		if (e.getKeyCode() == 40) {
		}
		if (e.getKeyCode() == 39) {
		}
		if (e.getKeyCode() == 37) {
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("b " + e.getKeyCode());
		if (e.getKeyCode() == 38) {
				if (MapRPG.playerPositionX() == 0) {
					MapRPG.goDown();
				}
			
			MapRPG.goStraight();
			System.out.println(MapRPG.playerPositionY());
			System.out.println(MapRPG.playerPositionX());
			
		}
		if (e.getKeyCode() == 40) {
			
				if (MapRPG.playerPositionX() == 4) {
					MapRPG.goStraight();
				}
			MapRPG.goDown();
			System.out.println(MapRPG.playerPositionY());
			System.out.println(MapRPG.playerPositionX());
		}
		if (e.getKeyCode() == 39) {
			
				if (MapRPG.playerPositionY() == 4) {
				MapRPG.goLeft();
			}
			MapRPG.goRight();
			System.out.println(MapRPG.playerPositionX());
			System.out.println(MapRPG.playerPositionY());
			
		}
		if (e.getKeyCode() == 37) {
			
				if (MapRPG.playerPositionY() == 0) {
					MapRPG.goRight();
				}
			MapRPG.goLeft();
			System.out.println(MapRPG.playerPositionX());
			System.out.println(MapRPG.playerPositionY());
		
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("c" + e.getKeyCode());
		if (e.getKeyCode() == 38) {
		}
		if (e.getKeyCode() == 40) {
		}
		if (e.getKeyCode() == 39) {
		}
		if (e.getKeyCode() == 37) {
		}
		
	}
	
}
