import java.util.Scanner;

public class MapRPG {
	private Player player;
	private Interraction[][] interraction;
	private static int playerPositionX;
	private static int playerPositionY;
	
	MapRPG(Player player) {
		this.player = player;
		this.interraction = new Interraction[5][5]; 
		MapRPG.playerPositionX = 4;
		MapRPG.playerPositionY = 0; 
		for (int i=0; i<5; i++) {
			for(int y=0; y<5; y++) {
				int zoneRandomePlay =  (int) (Math.random()*(3-1)+1);
				if (zoneRandomePlay == 1) {
					interraction[i][y] = new WeaponShop();
				}
				else if(zoneRandomePlay == 2) {
					interraction[i][y] = new ZoneInterraction();
				}
				else {
					int obstacleChoiceRandom = (int) (Math.random()*(3-1)+1);
					if (obstacleChoiceRandom == 1) {
						interraction[i][y] = new Pineapple();
					}
					else if (obstacleChoiceRandom == 2) {
						interraction[i][y] = new Hole(); 
					}
					else {interraction[i][y] = new Cactus();
					}
				}
			}
		}
}
	
	public void choiceMap() {
	}
	
	static void goStraight() {
		playerPositionX -=1;
	}
	public static void goLeft()  {
		playerPositionY -=1;
	}
	public static void goRight() {
		playerPositionY +=1;
	}
	public static void goDown() {
		playerPositionX +=1;
	}
	public boolean endOfNot() {
		if (playerPositionX == 0 && playerPositionY == 4 || player.dieOrNotPlayer() == false) {
			return true;
		} else {
			return false;
		}
	}
	public Interraction getZone() {
		return interraction[playerPositionX][playerPositionY];
	}
	static int playerPositionX() {
		return playerPositionX;
	}
	static int playerPositionY() {
		return playerPositionY;
	}
}
	