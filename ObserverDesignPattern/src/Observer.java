/**
 * Creates two methods that must be implemented in the classes DEA and Cartel
 * @author Kevin Hogan
 *
 */
public interface Observer {
	/**
	 * Gathers an update on the cook.
	 * @param location of the cook.
	 * @param description of what the cook is doing.
	 */
	public void update(String location, String description);
	
	/**
	 * Gets every location that the cook has been.
	 * @return
	 */
	public String getLog();
	
}
