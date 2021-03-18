
import java.util.ArrayList;

/**
 * This is a ToDo list
 * @author Kevin Hogan
 *
 */
public class ToDo {
	private String title;
	private String description;
	private double price;
	private String contact;
	private ArrayList<String> supplies;
	
	/**
	 * Creates a ToDo list using the following parameters:
	 * @param title is the name of the ToDo.
	 * @param description is the description of the ToDo.
	 * @param price is the price of the ToDo.
	 * @param contact is the business contact for the ToDo.
	 * @param supplies is what is required for the ToDo.
	 */
	public ToDo(String title, String description, double price, String contact, ArrayList<String> supplies) {
		this.title = title;
		this.description = description;
		this.price = price;
		this.contact = contact;
		this.supplies = supplies;
	}
	
	/**
	 * Gets the price for the job of the ToDo.
	 * @return Returns the price.
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * Prints out the ToDo list.
	 * @return Returns the ToDo list.
	 */
	public String toString() {
		String supplyList = "";
		for(String supplies : supplies) {
			supplyList += "- " + supplies + "\n";
		}
		return "\n***** " + title + " *****" + "\n" + description + "\nBusiness Contact: " + contact + "\nSupply List:\n" + supplyList + "Price: $" + price + "\n";
	}

}
