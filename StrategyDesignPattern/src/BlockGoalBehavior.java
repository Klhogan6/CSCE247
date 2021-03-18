import java.util.Random;

/**
 * The purpose of this class is to create a block goal behavior.
 * 
 * @author Kevin Hogan
 *
 */
public class BlockGoalBehavior implements DefenceBehavior, OffenceBehavior {
  /**
   * This method randomly chooses between four different goal block behaviors
   * and displays the one selected.
   */
  public String play() {
	  String[] goalBlockArr = { "hand blocks the puck",
			  					"catches the puck",
			  					"blocks puck with knee pads",
			  					"blocks puck with stick" };
	  Random r = new Random();
	  int rNum = r.nextInt(goalBlockArr.length);
	  return goalBlockArr[rNum];
  }
}
