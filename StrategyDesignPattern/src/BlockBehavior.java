import java.util.Random;

/**
 * The purpose of this class is to create a block behavior.
 * 
 * @author Kevin Hogan
 *
 */
public class BlockBehavior implements DefenceBehavior {
  /**
   * This method randomly chooses between three different
   * block behaviors and displays the one selected.
   */
  public String play() {
	  String[] blockArr = { "blocks player from passing",
			  				"blocks player from shooting",
			  				"checks player with puck" };
	  Random r = new Random();
	  int rNum = r.nextInt(blockArr.length);
	  return blockArr[rNum];
  }
}
