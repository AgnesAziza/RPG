import java.util.ArrayList;
import java.util.Scanner;

public class WeaponShop implements Interraction {
	private ArrayList<Weapon> weapons;
	private static boolean weaponBoolean = false;
	
	WeaponShop() {
		this.weapons = new ArrayList<Weapon>();
		weapons.add(new Stick()); 
		weapons.add(new Mushroom());
		weapons.add(new Sword());
	}
	
	public String toString() {
		return weapons.toString();
	}

	@Override
	public void playZone(Player player, Interface interfaceWeapon) {
		if (weaponBoolean == false) {
			interfaceWeapon.weaponShopInterraction(weapons, player, this);
		}
	}
	public void changeValue(Weapon weaponChoice, Player player) {
		if (player.getMoney() > weaponChoice.priceWeapon() ) {
			player.addToInventory(weaponChoice);
		} 
	}
	public void changeBoolean() {
		weaponBoolean = true;
	}
}
