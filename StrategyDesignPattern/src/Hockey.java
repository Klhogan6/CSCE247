/**
 * The purpose of this class is that it is the main driver in creating
 * the hockey players.
 * 
 * @author Kevin Hogan
 *
 */
public class Hockey {
	
	/**
	 * Empty Constructor
	 */
	public Hockey() {}
	
	/**
	 * This method creates three different hockey players.
	 */
	public void play() {
		Player[] players = new Player[3];
		players[0] = new Forward("John Tavares");
		players[1] = new Defenceman("Morgan Rielly");
		players[2] = new Goalie("Frederik Andersen");
		
		System.out.println("***** Players *****");
		displayPlayers(players);
		
		System.out.println("\n***** Offencive Plays *****");
		displayPlays(players);
		
		turnover(players);
		
		System.out.println("\n***** Defencive Plays *****");
		displayPlays(players);
		
	}
	
	/**
	 * This method displays the three different players and
	 * their positions.
	 * 
	 * @param players is the parameter being displayed.
	 */
	private void displayPlayers(Player[] players) {
		for(Player player : players) {
			System.out.println(player);
		}
	}
	
	/**
	 * This method displays the three different players and
	 * thier offence and defence behaviors.
	 * 
	 * @param players is the parameter being displayed.
	 */
	private void displayPlays(Player[] players) {
		for(Player player : players) {
			System.out.println(player.name + " " + player.play());
		}
	}
	
	/**
	 * This method creates an instance of a turnover.
	 * 
	 * @param players is the paramter that contains the players.
	 */
	private void turnover(Player[] players) {
		for(Player player : players) {
			player.turnover();
		}
	}
	
	/**
	 * This method creates a new instance hockey which runs the
	 * program.
	 * @param args
	 */
	public static void main(String[] args) {
		Hockey hockey = new Hockey();
		hockey.play();
	}

}
