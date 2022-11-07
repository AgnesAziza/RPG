public class Monster implements Personnage {
	private int lifeNumber;
	
	Monster(){
		this.lifeNumber = 100; 
	}
	public boolean dieOrNotMonster() {
		if (lifeNumber > 0) {
			return true;
		} else {
			return false;
		}
	};
	public void damagesMonster(int damages) {
		lifeNumber = lifeNumber - damages;
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
