
public class Mushroom extends Weapon {
	Mushroom() {
		super("Mushroom", 32, 67);
	}

	@Override
	public void AsciiArtWeeapon() {
		System.out.println("  _,---._\n"
				+ ",' ,(O). `.\n"
				+ "'-(-o-o-)-'\n"
				+ "   \\(_)/\n"
				+ "    ) (\n"
				+ "    \"\"\"");
	}
}
