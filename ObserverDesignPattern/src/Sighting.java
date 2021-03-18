/**
 * Gathers different sighting information about the Cook
 * @author Kevin Hogan
 *
 */
public class Sighting {
	private String location = "";
	private String details = "";
	
	/**
	 * Sets the location of the cook and details of the cook.
	 * @param location of where the cook is.
	 * @param details of what the cook is doing.
	 */
	public Sighting(String location, String details) {
		this.location = location;
		this.details = details;
	}
	
	/**
	 * Returns the location of the cook.
	 * @return
	 */
	public String getLocation() {
		return location;
	}
	
	/**
	 * Returns the details about what the cook is doing.
	 * @return
	 */
	public String getDetails() {
		return details;
	}
	
}
