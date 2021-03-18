/**
 * The Products
 * @author Kevin Hogan
 *
 */
public class Product implements ProductListing {
	private String title;
	private double price;
	private String description;
	
	/**
	 * Getting different products.
	 * @param title of the product.
	 * @param price of the product.
	 * @param description of the product.
	 */
	public Product(String title, double price, String description) {
		this.title = title;
		this.price = price;
		this.description = description;
	}
	
	/**
	 * Title of the product.
	 * @return title of the product.
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * Price of the product.
	 * @return price of the product.
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * Description of the product.
	 * @return description of the product.
	 */
	public String getDescription() {
		return description;
	}
}
