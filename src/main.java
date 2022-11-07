
public class main {

	public static void main(String[] args) {
		Player player = new Player("Tornatura", 60, 70);
		MapRPG map = new MapRPG(player);
		while (!map.endOfNot() ) {
			map.getZone().playZone(player);
			if (!map.endOfNot()) {
				map.choiceMap();
			}
			
		}
	}

}
