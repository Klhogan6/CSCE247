
/**
 * The purpose of this class is to create player that is a goalie.
 * 
 * @author Kevin Hogan
 *
 */
public class Goalie extends Player {
  /**
   * This methods pulls the name from the Player class and 
   * sets the defence and offence behavior to the block goal behavior.
   * 
   * @param name is a parameter from the Player class which the Goalie
   * class uses.
   */
  public Goalie(String name) {
	  super(name);
	  defenceBehavior = new BlockGoalBehavior();
	  offenceBehavior = new BlockGoalBehavior();
  }

  /**
   * Displays the name of the player and the defence behavior.
   */
  public void setDefenceBehavior() {
	  System.out.println(name + " " + defenceBehavior);
  }
  
  /**
   * Displays the name of the player and the offence behavior.
   */
  public void setOffenceBehavior() {
	  System.out.println(name + " " + offenceBehavior);
  }

  /**
   * Displays the name of the player and the player's position.
   */
  public String toString() {
	  return name + " plays the position: Goalie";
  }
}


