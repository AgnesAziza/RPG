import java.util.ArrayList;
import java.util.Collections;

public class Player implements Personnage {
	private String name;
	private int lifeNumber;
	private int money;
	private Weapon principalWeapon;
	private ArrayList<Weapon> inventoryWeapons;
	
	Player(String name, int lifeNumber, int money) {
		this.name = name;
		this.lifeNumber = lifeNumber;
		this.money = money;
		this.inventoryWeapons = new ArrayList<Weapon>();
		inventoryWeapons.add(new Sword());
	}
	
	@Override
	public int kick() {
		return principalWeapon.damagesWeapon();
	}
	@Override
	public void escape() {
		lifeNumber = lifeNumber - 5;
	} 
	public void damagesPlayer(int damages) {
		lifeNumber = lifeNumber - damages;
	}
	public boolean dieOrNotPlayer() {
		if (lifeNumber > 0) {
			return true;
		} else {
			return false;
		}
	};
	public void chooseWeapon() {
		if (inventoryWeapons.size() != 0) {
			Collections.shuffle(inventoryWeapons);
			principalWeapon = inventoryWeapons.get(0);
		}
	}
	public int getMoney() {
		return money;
	}
	public void addToInventory(Weapon chooseWeaponShop ) {
		inventoryWeapons.add(chooseWeaponShop);
	}
	public String displayInventory() {
		return inventoryWeapons.toString();
	}
}
