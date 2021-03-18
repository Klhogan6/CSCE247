
/**
 * This Player class will set up the player's name, figure out which behavior the player will get,
 * and also find out if there's been a turnover.
 * 
 * @author Kevin Hogan
 *
 */
public abstract class Player {
  protected String name;
  private boolean offense = true;
  DefenceBehavior defenceBehavior;
  OffenceBehavior offenceBehavior;
  
  /**
   * Sets this name of the different players.
   * @param name gets the name of the players.
   */
  public Player(String name) {
	  this.name = name;
  }
  
  /**
   * Displays the defence behavior of the player.
   */
  public abstract void setDefenceBehavior();
  
  /**
   * Displays the offence behavior of the player.
   */
  public abstract void setOffenceBehavior();
  
  /**
   * Checks to see if either defenceBehavior or offenceBehavior is null.
   * If the behaviors are not null, depending on if offense is set to true
   * or false, it will return the defence behavior or the offence
   * behavior of the player.
   * 
   * @return either returns the defence behavior or the offence behavior
   */
  public String play() {
	  if(defenceBehavior != null && offense == false)
		  return defenceBehavior.play();
	  if(offenceBehavior != null && offense == true)
		  return offenceBehavior.play();
      return "";
  }
  
  /**
   * Detects to see if there has been a turnover.
   */
  public void turnover() {
	  this.offense = !this.offense;
  }
}
