import java.util.ArrayList;

/**
 * Builds the cake that is created.
 * @author Kevin Hogan
 *
 */
public abstract class Cake {
	protected String name;
	protected double price;
	protected int numLayers;
	protected ArrayList<String> decorations;
	protected Shape shape;
	protected String flavor;
	protected String icing;
	
	/**
	 * Makes a new ArrayList called decorations
	 */
	public Cake() {
		decorations = new ArrayList<String>();
	}
	
	/**
	 * Creates the cake using the number of layers, frosting, decorations, and price.
	 */
	public void createCake() {
		createLayers();
		frostCake();
		addDecorations();
		getPrice();
	}
	
	/**
	 * Prints out the number of layers the cake has. Also, prints out the shape and flavor of the cake.
	 */
	private void createLayers() {
		System.out.println("Creating a " + numLayers + " layered " + shape.toString().toLowerCase() + " " + flavor + " cake");
	}
	
	/**
	 * Prints out the type of icing the cake has.
	 */
	private void frostCake() {
		System.out.println("Frost cake with " + icing + " icing.");
	}
	
	/**
	 * Prints out the different decorations that are added to the cake.
	 */
	private void addDecorations() {
		
		String cakeDecoration = "";
		for(String decorations : decorations) {
			cakeDecoration += "Adding " + decorations + ".\n";
		}
		
		System.out.print(cakeDecoration);
	}
	
	/**
	 * Prints out the price of the cake.
	 * @return Returns the price of the cake.
	 */
	public double getPrice() {
		System.out.println("Price: $" + price);
		return 0.00;
	}

}
