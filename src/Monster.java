public class Monster implements Personnage {
	private String name;
	private int lifeNumber;
	private int xp;
	private String role;
	
	Monster(String name, int lifeNumber, int xp, String role){
		this.name = name;
		this.lifeNumber = lifeNumber; 
		this.xp = xp; 
		this.role = role;
	}

	@Override
	public int kick() {
		return (int) (Math.random() * ( 15 - 5 ));
	}

	@Override
	public void escape() {
	 lifeNumber = 0;
	}	
}
