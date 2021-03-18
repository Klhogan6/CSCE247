/**
 * Interface for the list of products.
 * @author Kevin Hogan
 *
 */
public interface ProductListing {
	
	/**
	 * Title of the product.
	 */
	public String getTitle();
	
	/**
	 * Price of the product.
	 */
	public double getPrice();
	
	/**
	 * Description of the product.
	 */
	public String getDescription();
}
