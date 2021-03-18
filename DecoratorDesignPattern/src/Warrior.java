/**
 * Creates a warrior player.
 * @author Kevin Hogan
 *
 */
public class Warrior extends Player {
	
	/**
	 * Gets the name, intellect, attack, defense, weapon, and armor for the warrior.
	 * @param name. The name of the player.
	 */
	public Warrior(String name) {
		this.name = name;
		this.intellect = 2;
		this.attack = 8;
		this.defense = 5;
		this.weapon = "Sword";
		this.armor = "Breast Plate";
	}
	
	/**
	 * Adds that this player is a warrior.
	 */
	public String toString() {
		return "Warrior: " + super.toString();
	}

}
