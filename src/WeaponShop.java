import java.util.ArrayList;
import java.util.Scanner;

public class WeaponShop {
	private ArrayList<Weapon> weapons;
	
	WeaponShop() {
		this.weapons = new ArrayList<Weapon>();
		weapons.add(new Stick()); // il appelle le constrcuteur et il va dedant recup les infos
		weapons.add(new Mushroom());
		weapons.add(new Sword());
	}
	
	public void buyWeapon(Player player) {
		Scanner scannerWhichWeapon= new Scanner(System.in);
		System.out.println("Choisis ton arme en rentrant le nombre associé : ");
		for (int i=0; i<weapons.size(); i++) {
			System.out.println(i + " " + "Weapon: " + weapons.get(i));
			weapons.get(i).AsciiArtWeeapon();
		}
		int choiceWeapon = scannerWhichWeapon.nextInt();
		while (choiceWeapon != 0 && choiceWeapon != 1 && choiceWeapon != 2 ) {
		System.out.println("Ton choix doit être 0 ou 1 ou 2 ");
		choiceWeapon = scannerWhichWeapon.nextInt();
		}
		if (player.getMoney() < weapons.get(choiceWeapon).priceWeapon()) {
			System.out.println("Not enough money !");
		} else {
			System.out.println("good choice");
			player.addToInventory(weapons.get(choiceWeapon));
			System.out.println(player.displayInventory());
		}
	}
	
	public String toString() {
		return weapons.toString();
	}
}
