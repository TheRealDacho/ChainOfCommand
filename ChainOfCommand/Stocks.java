public class Stocks {

	private String name = "Bitcoin";
	private int quantity = 2;
	private String name1 = "Gold";
	private int quantity1 = 5;
	
	public void Buy() {
		System.out.println("Stocks [ Name: "+name+", Quantity: "+quantity+" ] bought");
	}
	
	public void Sell() {
		System.out.println("Stocks [ Name: "+name+", Quantity: "+quantity+" ] sold");
	}
} 