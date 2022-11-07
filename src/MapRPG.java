import java.util.Scanner;

public class MapRPG {
	private Player player;
	private Interraction[][] interraction;
	private int playerPositionX;
	private int playerPositionY;
	
	
	MapRPG(Player player) {
		this.player = player;
		this.interraction = new Interraction[5][5];
		this.playerPositionX = 0;
		this.playerPositionY = 0; 
		for (int i=0; i<5; i++) {
			for(int y=0; y<5; y++) {
				int zoneRandomePlay = (int) (Math.random()*(3-1)+1);
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
		Scanner scanner= new Scanner(System.in);
		System.out.println("Te déplacer ==> Tout droit= tappes 1 / Droite = tappes 2 / En bas= tappes 3 / A gauche = tappes 4  ");
		int choiceMap = scanner.nextInt();
		while (choiceMap != 1 && choiceMap != 2 && choiceMap !=3 && choiceMap !=4) {
		System.out.println("Ton choix doit être 1 ou 2 ou 3 ou 4 ");
		choiceMap = scanner.nextInt();
		}
		if (choiceMap == 1) {
			goStraight();
		}
		if (choiceMap ==  2) {
			goRight();
		}
		if (choiceMap == 3) {
			goDown();
		}
		if(choiceMap == 4) {
			goLeft();
		}
	}
	
	public void goStraight() {
		playerPositionX -=1;
	}
	public void goLeft()  {
		playerPositionY -=1;
		
	}
	public void goRight() {
		playerPositionY +=1;
	}
	public void goDown() {
		playerPositionX +=1;
	}
	public boolean endOfNot() {
		if (playerPositionX == 24 && playerPositionY == 24) {
			return true;
		} else {
			return false;
		}
	}
	public Interraction getZone() {
		return interraction[playerPositionX][playerPositionY];
	}
}
	