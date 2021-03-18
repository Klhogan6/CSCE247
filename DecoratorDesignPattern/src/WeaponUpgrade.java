/**
 * Gives the player a weapon upgrade.
 * @author Kevin Hogan
 *
 */
public class WeaponUpgrade extends PlayerDecorator {
	private Player player;
	
	/**
	 * Gets the name of the player.
	 * @param player. The player's name.
	 */
	public WeaponUpgrade(Player player) {
		this.player = player;
	}
	
	/**
	 * Adds that the player has a upgraded weapon.
	 */
	public String toString() {
		return player.toString() + "\nUpgraded weapon";
	}
	
	/**
	 * Adds additional power to the player.
	 */
	public double getPower() {
		return player.getPower() + 5;
	}

}
