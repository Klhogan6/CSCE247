/**
 * Shoe Product
 * @author Kevin Hogan
 *
 */
public class Shoe implements ShoeListing {
	private String brand;
	private String name;
	private double cost;
	private String description;
	
	/**
	 * A shoe product.
	 * @param brand of the shoe.
	 * @param name of the shoe.
	 * @param price of the shoe.
	 * @param description of the shoe.
	 */
	public Shoe(String brand, String name, double price, String description) {
		this.brand = brand;
		this.name = name;
		this.cost = price;
		this.description = description;
	}
	
	/**
	 * Information about the shoe.
	 * @return the information of the shoe product.
	 */
	public String toString() {
		return "Shoe: " + name + "\nBy: " + brand + "\nDetails: " + description + "\nCost: $" + cost; 
	}
}
