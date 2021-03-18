/**
 * The Main Game Console
 * @author Kevin Hogan
 *
 */
public class GameConsole {
	private State homeState;
	private State nintendoState;
	private State xBoxState;
	private State state;
	
	/**
	 * Creating new states for the Game Console.
	 */
	public GameConsole() {
		homeState = new HomeState(this);
		nintendoState = new NintendoState(this);
		xBoxState = new XBoxState(this);
		state = homeState;
		
		System.out.println("Starting up the Game Console\n");
	}
	
	/**
	 * Setting the state.
	 * @param state of the Game Console.
	 */
	public void setState(State state) {
		this.state = state;
	}
	
	/**
	 * Getting the home state of the Game Console.
	 * @return homeState of the Game Console.
	 */
	public State getHomeState() {
		return homeState;
	}
	
	/**
	 * Getting the Nintendo state of the Game Console.
	 * @return nintendoState of the Game Console.
	 */
	public State getNintendoState() {
		return nintendoState;
	}
	
	/**
	 * Getting the xBox state of the Game Console.
	 * @return xBoxState of the Game Console.
	 */
	public State getXBoxState() {
		return xBoxState;
	}
	
	/**
	 * Pressing the home button.
	 */
	public void pressHomeButton() {
		state.pressHomeButton();
	}
	
	/**
	 * Pressing the Nintendo button.
	 */
	public void pressNintendoButton() {
		state.pressNintendoButton();
	}
	
	/**
	 * Pressing the xBox button.
	 */
	public void pressXBoxButton() {
		state.pressXBoxButton();
	}
	
	/**
	 * Pressing the game button.
	 */
	public void pressGameButton() {
		state.pressGameButton();
	}
}
