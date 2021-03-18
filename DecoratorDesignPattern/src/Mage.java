/**
 * Creats a mage player.
 * @author Kevin Hogan
 *
 */
public class Mage extends Player {
	
	/**
	 * Gets the name, intellect, attack, defense, weapon, and armor for the mage.
	 * @param name. The name of the mage.
	 */
	public Mage(String name) {
		this.name = name;
		this.intellect = 7;
		this.attack = 3;
		this.defense = 4;
		this.weapon = "Staf";
		this.armor = "Robe";
	}
	
	/**
	 * Adds that this player is a mage.
	 */
	public String toString() {
		return "Mage: " + super.toString();
	}

}
