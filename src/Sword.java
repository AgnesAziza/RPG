
public class Sword extends Weapon {
	Sword() {
		super("Sword", 34, 9);
	}

	@Override
	public void AsciiArtWeeapon() {
		System.out.println("      /| ________________\n"
				+ "O|===|* >________________>\n"
				+ "      \\|");
	}

}
