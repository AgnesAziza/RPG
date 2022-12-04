import java.util.Scanner;

public class ZoneInterraction implements Interraction {
	private Monster monster;
	private boolean zoneBoolean = false;
	
	ZoneInterraction() {
		this.monster = new Monster();
	}
	
	@Override
	public void playZone(Player player, Interface interfaceWeapon) {
		if (zoneBoolean == false) {
			System.out.println("zone combat");
			player.chooseWeapon();
			int monsterChoice = (int) (Math.random()*(1 - 0) + 0);
			if (monsterChoice == 1) {
				monster.escape();
			}
			else {
				while (player.dieOrNotPlayer() == true && monster.dieOrNotMonster() == true) {
					player.damagesPlayer(monster.kick());
					monster.damagesMonster(player.kick());
				}
			}
			zoneBoolean = true;
		}
				
	} 

}
