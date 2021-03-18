/**
 * Decorates the player based on what their upgrade and power is.
 * @author Kevin Hogan
 *
 */
public abstract class PlayerDecorator extends Player {
	
	/**]
	 * Displays which upgrade the player got.
	 */
	public abstract String toString();
	
	/**
	 * Displays how much extra power the player got.
	 */
	public abstract double getPower();

}
