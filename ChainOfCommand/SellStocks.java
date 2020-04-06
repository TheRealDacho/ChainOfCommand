public class SellStocks implements Order{
	private Stocks bitcoinStocks;
	private Stocks goldStocks;
	
	public SellStocks(Stocks bitcoinStocks) {
		this.bitcoinStocks= bitcoinStocks;
	}
	
	public void SellStocks1(Stocks goldStocks) {
		this.goldStocks= goldStocks;
	}
	
	
	public void execute() {
		bitcoinStocks.Sell();
		goldStocks.Sell();
	}
}