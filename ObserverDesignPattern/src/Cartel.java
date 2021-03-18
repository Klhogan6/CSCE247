import java.util.ArrayList;

/**
 * Creates the Cartel.
 * @author Kevin Hogan
 *
 */
public class Cartel implements Observer {
	private Subject cook;
	private ArrayList<Sighting> sightings;
	
	/**
	 * Registers the cook to the observers and creates a new list of sightings.
	 * @param cook is registered with the observers.
	 */
	public Cartel(Subject cook) {
		this.cook = cook;
		this.sightings = new ArrayList<Sighting>();
		cook.registerObserver(this);
	}
	
	/**
	 * Updates the location and the description of the cook.
	 */
	public void update(String location, String description) {
		sightings.add(new Sighting(location, description));
		getLog();
	}
	
	/**
	 * Displays every sighting of the cook and what the cook was doing.
	 */
	public String getLog() {
		String log = "";
		for (Sighting sighting : sightings) {
			log += sighting.getLocation() + " (" + sighting.getDetails() + ")\n";
		}
		return log;
	}
	
}
