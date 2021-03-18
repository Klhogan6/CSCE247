/**
 * Gives the player a armor upgrade.
 * @author Kevin Hogan
 *
 */
public class ArmorUpgrade extends PlayerDecorator {
	private Player player;
	
	/**
	 * Gets the name of the player.
	 * @param player. The player's name.
	 */
	public ArmorUpgrade(Player player) {
		this.player = player;
	}
	
	/**
	 * Adds that the player has upgraded armor.
	 */
	public String toString() {
		return player.toString() + "\nUpgraded armor";
	}
	
	/**
	 * Adds additional power to the player.
	 */
	public double getPower() {
		return player.getPower() + 3;
	}

}
