
public class Stick extends Weapon {
	Stick() {
		super("Stick", 50, 12);
	}

	@Override
	public void AsciiArtWeeapon() {
		System.out.println(" ___________________    . , ; .\n"
				+ "(___________________|~~~~~X.;' .\n"
				+ "                      ' `\" ' `");
	}

}
