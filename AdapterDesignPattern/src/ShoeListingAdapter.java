/**
 * A product listing that is a shoe.
 * @author Kevin Hogan
 *
 */
public class ShoeListingAdapter implements ProductListing {
	private ShoeListing shoe;
	private String title;
	private String brand;
	private double price;
	private String description;
	
	/**
	 * A shoe listing.
	 * @param shoe product.
	 */
	public ShoeListingAdapter(ShoeListing shoe) {
		this.shoe = shoe;
		this.title = shoe.toString().substring(shoe.toString().indexOf("Shoe:") +5, shoe.toString().indexOf("By:") -1).trim();
		this.brand = shoe.toString().substring(shoe.toString().indexOf("By:") +3, shoe.toString().indexOf("Details:") -1).trim();
		this.price = Double.parseDouble(shoe.toString().substring(shoe.toString().indexOf('$') +1).trim());
		this.description = shoe.toString().substring(shoe.toString().indexOf("Details:") +8, shoe.toString().indexOf("Cost:") -1).trim();
	}
	
	/**
	 * Title of the shoe.
	 * @return title of the shoe.
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * Price of the shoe.
	 * @return price of the shoe.
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * Description of the shoe.
	 * @return brand and description of the shoe.
	 */
	public String getDescription() {
		return "Created by " + brand + ", " + description;
	}
}
