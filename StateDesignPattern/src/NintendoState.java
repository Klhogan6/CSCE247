/**
 * The Nintendo State of the main Game Console.
 * @author Kevin Hogan
 *
 */
public class NintendoState implements State {
	private GameConsole gameConsole;
	private String[] nintendoGames = {"Super Mario Odyssey", "Super Smash Bros. Ultimate", "Mario Kart 8",
	                             	  "Super Mario 64", "Super Mario Bros. 3"};
	
	/**
	 * Nintendo State of the Game Console.
	 * @param gameConsole is the main Game Console
	 */
	public NintendoState(GameConsole gameConsole) {
		this.gameConsole = gameConsole;
	}
	
	/**
	 * Pressing the home button.
	 */
	@Override
	public void pressHomeButton() {
		System.out.println("Display Home Screen.");
		gameConsole.setState(gameConsole.getHomeState());
	}
	
	/**
	 * Pressing the Nintendo button.
	 */
	@Override
	public void pressNintendoButton() {
		System.out.println("You are already viewing Nintendo.");
		gameConsole.setState(gameConsole.getNintendoState());
	}
	
	/**
	 * Pressing the xBox button.
	 */
	@Override
	public void pressXBoxButton() {
		System.out.println("Starting xBox...");
		gameConsole.setState(gameConsole.getXBoxState());
	}
	
	/**
	 * Pressing the game button.
	 */
	@Override
	public void pressGameButton() {
		System.out.println("You have the following games:");
		for(String nintendoGames : nintendoGames) {
			System.out.println(nintendoGames);
		}
		System.out.print("\n");
	}
}
