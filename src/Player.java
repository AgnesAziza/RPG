import java.util.ArrayList;

public class Player implements Personnage {
	private String name;
	private int lifeNumber;
	private int money;
	private int xp; 
	private int mana;
	private Weapon principalWeapon;
	private ArrayList<Weapon> inventoryWeapons;
	
	Player(String name, int lifeNumber, int money, int xp, int mana) {
		this.name = name;
		this.lifeNumber = lifeNumber;
		this.money = money;
		this.xp = xp; 
		this.mana = mana; 
		this.inventoryWeapons = new ArrayList<Weapon>();
	}
	
	@Override
	public int kick() {
		return principalWeapon.damagesWeapon();
	}
	@Override
	public void escape() {
		lifeNumber = lifeNumber - 5;
	} 
	public void chooseWeapon() {
		
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
