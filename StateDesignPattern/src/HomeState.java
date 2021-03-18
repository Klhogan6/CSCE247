/**
 * Home State of the Game Console.
 * @author Kevin Hogan
 *
 */
public class HomeState implements State {
	private GameConsole gameConsole;
	
	/**
	 * The Home State.
	 * @param gameConsole is the main Game Console.
	 */
	public HomeState(GameConsole gameConsole) {
		this.gameConsole = gameConsole;
	}
	
	/**
	 * Pressing the home button.
	 */
	@Override
	public void pressHomeButton() {
		System.out.println("You are already on the home screen.");
		gameConsole.setState(gameConsole.getHomeState());
	}
	
	/**
	 * Pressing the Nintendo button.
	 */
	@Override
	public void pressNintendoButton() {
		System.out.println("Starting Nintendo...");
		gameConsole.setState(gameConsole.getNintendoState());
	}
	
	/**
	 * Pressing the xBox button.
	 */
	@Override
	public void pressXBoxButton() {
		System.out.println("Starting XBox...");
		gameConsole.setState(gameConsole.getXBoxState());
	}
	
	/**
	 * Pressing the game button.
	 */
	@Override
	public void pressGameButton() {
		System.out.println("You have to pick a gaming system to play.");
	}
}
