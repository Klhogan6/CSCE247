
/**
 * Creates an instance of buying stock.
 * @author Kevin Hogan
 *
 */
public class BuyStockCommand implements Command {
	private StockTrade stockTrade;
	private String stockName;
	private int shares;
	
	/**
	 * Uses the stock trade, the stock name, and the shares to buy a stock.
	 * @param stockTrade to buy a stock.
	 * @param stockName is the name of the stock.
	 * @param share is the quantity of stock that is bought.
	 */
	public BuyStockCommand(StockTrade stockTrade, String stockName, int share) {
		this.stockTrade = stockTrade;
		this.stockName = stockName;
		this.shares = share;
	}
	
	/**
	 * Executes the buy stock command to buy a stock.
	 */
	public void execute() {
		stockTrade.buy(stockName, shares);
	}

}
