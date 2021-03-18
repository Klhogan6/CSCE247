/**
 * Display the message when action take place
 * @author qiweichen
 *
 */
public class StockTrade {
	/**
	 * This is the constructor
	 */
	public StockTrade() {
		
	}
	
	/**
	 * Printing out the message on buying stack
	 * @param stockName The name of stock
	 * @param numShares The amount share
	 */
	public void buy(String stockName, int numShares) {
		System.out.println("Buying " +numShares + " of " + stockName);
	}
	
	/**
	 * Printing out the message on selling stock
	 * @param stockName The name of stock
	 * @param numShares the amount share
	 */
	public void sell(String stockName, int numShares) {
		System.out.println("Selling " +numShares + " of " + stockName);
	}

}
