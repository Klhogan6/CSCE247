import java.util.ArrayList;

/**
 * Creates the Cook.
 * @author Kevin Hogan
 *
 */
public class Cook implements Subject {
	private ArrayList<Observer> observers;
	private String name = "";
	private String location;
	private String description;
	
	/**
	 * Gathers the name of the cook and creates a new list of observers.
	 * @param name of the cook.
	 */
	public Cook(String name) {
		this.name = name;
		this.observers = new ArrayList<Observer>();
	}
	
	/**
	 * Registers the observers.
	 */
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	
	/**
	 * Removes the observers.
	 */
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}
	
	/**
	 * Notifies the observers with the location and description.
	 */
	public void notifyObservers(String location, String description) {
		for(Observer observer : observers) {
			observer.update(location, description);
		}
	}
	
	/**
	 * Enters the different sightings of the cook.
	 * @param location of the cook.
	 * @param description of what the cook is doing.
	 */
	public void enterSighting(String location, String description) {
		this.location = location;
		this.description = description;
		notifyObservers(location, description);
	}
	
	/**
	 * Returns the name of the cook.
	 * @return
	 */
	public String getName() {
		return this.name;
	}
}
