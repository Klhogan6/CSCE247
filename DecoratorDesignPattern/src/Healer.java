/**
 * Creates a healer player.
 * @author Kevin Hogan
 *
 */
public class Healer extends Player {
	
	/**
	 * Gets the name, intellect, attack, defense, weapon, and armor for the healer.
	 * @param name. The name of the healer.
	 */
	public Healer(String name) {
		this.name = name;
		this.intellect = 8;
		this.attack = 2;
		this.defense = 3;
		this.weapon = "Staf";
		this.armor = "Robe";
	}
	
	/**
	 * Adds that this player is a healer.
	 */
	public String toString() {
		return "Healer: " + super.toString();
	}

}
