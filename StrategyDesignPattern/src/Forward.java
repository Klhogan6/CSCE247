import java.util.Random;

/**
 * The purpose of this class is to create a player that is a forward.
 * 
 * @author Kevin Hogan
 *
 */
public class Forward extends Player{
  /**
   * This method pulls the name from the Player class, then
   * randomly picks between two different behaviors for the
   * offence and defence behavior.
   * 
   * @param name is a parameter from the Player class which the
   * Forward class uses
   */
  public Forward(String name) {
	super(name);
	Random rOff = new Random();
	int rOffInt = rOff.nextInt(2);
	if(rOffInt == 0) {
		offenceBehavior = new PassBehavior();
	} else if(rOffInt == 1) {
		offenceBehavior = new ShootBehavior();
	}
	
	Random rDef = new Random();
	int rDefInt = rDef.nextInt(2);
	if(rDefInt == 0) {
		defenceBehavior = new ChasePuckBehavior();
	} else if(rDefInt == 1) {
		defenceBehavior = new BlockBehavior();
	}
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
	return name + " plays the position: Forward";
  }
}
