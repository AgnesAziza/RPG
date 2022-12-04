
public class main {

	public static void main(String[] args) {
		Player player = new Player("Tornaturo", 400, 70);
		Interface interfaceGame = new Interface();
		MapRPG map = new MapRPG(player);
		interfaceGame.nameGamer(player, map);
		
			while (!map.endOfNot() ) {
				interfaceGame.refresh(player);
				map.getZone().playZone(player, interfaceGame);
			}
			interfaceGame.refresh(player);
			interfaceGame.DieOrNor(player.dieOrNotPlayer() == false ? "tu es mort" : "tu as gagné");		
	}

}
