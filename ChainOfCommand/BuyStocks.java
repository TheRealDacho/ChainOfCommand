public class BuyStocks implements Order {
	
	private Stocks bitcoinStocks;
	
	public BuyStocks( Stocks bitcoinStocks) {
		this.bitcoinStocks = bitcoinStocks;
	}
	
private Stocks goldStocks;
	
	public void BuyStocks1( Stocks goldStocks) {
		this.goldStocks = goldStocks;
	}
	
	public void execute() {
		bitcoinStocks.Buy();
		goldStocks.Buy();
	}
}