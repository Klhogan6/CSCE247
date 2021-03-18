/**
 * The xBox State of the main Game Console.
 * @author Kevin Hogan
 *
 */
public class XBoxState implements State {
	private GameConsole gameConsole;
	private String[] xBoxGames = {"Forza Horizon 4", "Ori and the Blind Forest", "Gears 5",
								  "Red Dead Redemption 2", "Fortnite"};
	
	/**
	 * xBox State of the Game Console.
	 * @param gameConsole is the main game console.
	 */
	public XBoxState(GameConsole gameConsole) {
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
		System.out.println("Starting Nintendo");
		gameConsole.setState(gameConsole.getNintendoState());
	}
	
	/**
	 * Pressing the xBobx button.
	 */
	@Override
	public void pressXBoxButton() {
		System.out.println("You already viewing xBox");
		gameConsole.setState(gameConsole.getXBoxState());
	}
	
	/**
	 * Pressing the game button.
	 */
	@Override
	public void pressGameButton() {
		System.out.println("You have the following games:");
		for(String xBoxGames : xBoxGames) {
			System.out.println(xBoxGames);
		}
		System.out.print("\n");
	}
}
