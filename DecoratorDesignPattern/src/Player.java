/**
 * Creates a player.
 * @author Kevin Hogan
 *
 */
public abstract class Player {
	protected String name;
	protected int intellect;
	protected int defense;
	protected int attack;
	protected String weapon;
	protected String armor;
	
	/**
	 * Displays the players name, weapon, and armor.
	 */
	public String toString() {
		return name + "\nCarries a " + weapon + ", and wears a " + armor;
	}
	
	/**
	 * Displays the amount of power the player has.
	 * @return Returns the power of the player.
	 */
	public double getPower() {
		return attack * 3 + defense + intellect / 2;
	}

}
