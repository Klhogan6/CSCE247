import java.util.Random;

/**
 * The purpose of the class is to create a player that is a defenceman.
 * 
 * @author Kevin Hogan
 *
 */
public class Defenceman extends Player {
	/**
	 * This method pulls the name from the player class. For the offence
	 * behavior, it randomly chooses between the pass behavior and the slap
	 * shot behavior (picking the pass behavior 9 out of 10 times). For the
	 * defence behavior, it is randomly choosing between the chase puck
	 * behavior and the block behavior (50-50 chance).
	 * 
	 * @param name is a parameter from the Player class which the
	 * Defenceman class uses.
	 */
	public Defenceman(String name) {
		super(name);
		Random r = new Random();
		int rInt = r.nextInt(10);
		if(rInt == 0) {
			offenceBehavior = new PassBehavior();
		} else if(rInt == 1) {
			offenceBehavior = new PassBehavior();
		} else if(rInt == 2) {
			offenceBehavior = new PassBehavior();
		} else if(rInt == 3) {
			offenceBehavior = new PassBehavior();
		} else if(rInt == 4) {
			offenceBehavior = new PassBehavior();
		} else if(rInt == 5) {
			offenceBehavior = new PassBehavior();
		} else if(rInt == 6) {
			offenceBehavior = new PassBehavior();
		} else if(rInt == 7) {
			offenceBehavior = new PassBehavior();
		} else if(rInt == 8) {
			offenceBehavior = new PassBehavior();
		} else if(rInt == 9) {
			offenceBehavior = new SlapShotBehavior();
		}
		
		Random ranDef = new Random();
		int ranDefInt = ranDef.nextInt(2);
		if(ranDefInt == 0) {
			defenceBehavior = new ChasePuckBehavior();
		} else if(ranDefInt == 1) {
			defenceBehavior = new BlockBehavior();
		}
	}
	
	/**
	 * Displays the player's name and their defence behavior.
	 */
	public void setDefenceBehavior() {
      System.out.println(name + " " + defenceBehavior);
	}
	
	/**
	 * Displays the player's name and their offence behavior.
	 */
	public void setOffenceBehavior() {
	  System.out.println(name + " " + offenceBehavior);	
	}
	
	/**
	 * Displays the player's name and their position.
	 */
	public String toString() {
		return name + " plays the position: Defenceman";
	}

}
