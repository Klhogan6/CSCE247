/**
 * Creates three methods that must be implemented in the Cook class.
 * @author Kevin Hogan
 *
 */
public interface Subject {
	/**
	 * Registers a new observer.
	 * @param observer is registered.
	 */
	public void registerObserver(Observer observer);
	
	/**
	 * Removes an observer.
	 * @param observer is removed.
	 */
	public void removeObserver(Observer observer);
	
	/**
	 * Notifies the observers.
	 * @param location of the Cook.
	 * @param description of what the Cook is doing.
	 */
	public void notifyObservers(String location, String description);

}
