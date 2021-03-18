/**
 * Creates a new bakery.
 * @author Kevin Hogan
 *
 */
public class Bakery {
	
	/**
	 * Ordering a new type of cake.
	 * @param type. The type of cake.
	 * @return Returns the new cake.
	 */
	public Cake orderCake(String type) {
		Cake cake = createCake(type);
		
		cake.createCake();
		
		return cake;
	}
	
	/**
	 * Creates the new type of cake.
	 * @param type. The type of cake.
	 * @return Returns the type of cake.
	 */
	private Cake createCake(String type) {
		Cake cake = null;
		
		if(type.equals("carrot cake")) {
			cake = new CarrotCake();
		} else if(type.equals("black forest cake")) {
			cake = new BlackForestCake();
		} else if(type.equals("birthday cake")) {
			cake = new BirthdayCake();
		} else {
			cake = new CarrotCake();
		}
		
		return cake;
	}

}
