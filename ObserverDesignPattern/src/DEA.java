import java.util.ArrayList;

/**
 * Creates an instance of the DEA observing the cook.
 * @author Kevin Hogan
 *
 */
public class DEA implements Observer {
	private Subject cook;
	private ArrayList<String> locations;
	private String notes = "";
	
	/**
	 * Observers an instance of the cook and creates a new list of locations.
	 * @param cook is registered by the observer.
	 */
	public DEA(Subject cook) {
		this.cook = cook;
		this.locations = new ArrayList<String>();
		cook.registerObserver(this);
	}
	
	/**
	 * Sends location and description updates to the DEA.
	 */
	public void update(String location, String description) {
		locations.add(location);
		this.notes = notes + "\n" + description;
	}
	
	/**
	 * Displays every location where the cook has been and notes about what the cook was doing.
	 */
	public String getLog() {
		String log = "Locations:\n";
		for(String location : locations) {
			log += location + "\n";
		}
		log += "\nNotes:" + notes;
		return log;
	}
}
