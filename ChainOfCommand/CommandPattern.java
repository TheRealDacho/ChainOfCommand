public class CommandPattern {

	public static void main (String[] args) {
		Stocks bitcoinStocks = new Stocks();
		Stocks goldStocks = new Stocks();
		
		BuyStocks buyStocksOrder = new BuyStocks(bitcoinStocks);
		SellStocks sellStocksOrder = new SellStocks(bitcoinStocks);
		BuyStocks buyStocksOrder1 = new BuyStocks(goldStocks);
		SellStocks sellStocksOrder1 = new SellStocks(goldStocks);
		
		Broker broker = new Broker();
		broker.takeOrder(buyStocksOrder);
		broker.takeOrder(sellStocksOrder);
		broker.takeOrder(buyStocksOrder1);
		broker.takeOrder(sellStocksOrder1);
		
		broker.placeOrder();
	}
}