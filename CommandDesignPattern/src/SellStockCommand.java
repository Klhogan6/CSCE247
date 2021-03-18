/**
 * Creates an instance of selling stock
 * @author Daniel Gregory
 *	
 */
public class SellStockCommand implements Command {
	private StockTrade stockTrade;
	private String stockName;
	private int shares;
	/**
	 * Initiates the following variables to sell a stock
	 * @param stockTrade to sell a stock
	 * @param stockName name of the stock
	 * @param shares quantity of shares being sold
	 */
	public SellStockCommand(StockTrade stockTrade, String stockName, int shares) {
		this.stockTrade = stockTrade;
		this.stockName = stockName;
		this.shares = shares;
	}
	/**
	 * Exectues the sell stock command to sell a stock
	 */
	public void execute() {
		stockTrade.sell(stockName, shares);
	}

}
