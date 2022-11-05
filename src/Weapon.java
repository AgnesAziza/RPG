
public abstract class Weapon {
	private String name; 
	private int price; 
	private int damages;
	
	Weapon(String name, int price, int damages) {
		this.name = name; 
		this.price = price; 
		this.damages = damages;
	}
	public int damagesWeapon() {
		return damages;
	}
	public int priceWeapon() {
		return price;
	}
	public abstract void AsciiArtWeeapon();
	
	@Override
	public String toString() {
		return name + " price: " + price + " damages: "+ damages;
	}
}
