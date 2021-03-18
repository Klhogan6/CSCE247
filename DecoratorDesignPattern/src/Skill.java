/**
 * Gives the player a skill upgrade.
 * @author Kevin Hogan
 *
 */
public class Skill extends PlayerDecorator {
	private Player player;
	
	/**
	 * Gets the name of the player.
	 * @param player. The name of the player.
	 */
	public Skill(Player player) {
		this.player = player;
	}
	
	/**
	 * Adds that the player has a gained a skill.
	 */
	public String toString() {
		return player.toString() + "\nGained a skill";
	}
	
	/**
	 * Adds additional power to the player.
	 */
	public double getPower() {
		return player.getPower() + 2;
	}


}
