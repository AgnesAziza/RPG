import java.util.Scanner;

public class ZoneInterraction implements Interraction {
	private Monster monster;
	
	ZoneInterraction() {
		this.monster = new Monster();
	}
	

	@Override
	public void playZone(Player player) {
		player.chooseWeapon();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Veux-tu t'échapper ou te battre? 1: se battre ou 2: s'échapper ");
		int escapeOrFight = scanner.nextInt();
		while (escapeOrFight !=1 && escapeOrFight != 2 ) {
		System.out.println("Ton choix doit être 1 ou 2 ");	
		escapeOrFight = scanner.nextInt();
		}
		if (escapeOrFight == 2) {
			player.escape();
		}
		else {
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
			
		}
		
		
	}

}
