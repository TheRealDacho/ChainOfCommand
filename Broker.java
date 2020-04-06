package chainofresponsibility;
import java.util.ArrayList;
import java.util.List;

public class Broker {
	private List<Order> orderList = newArrayList<Order>();
	public void takeOrder(Order order) {
		orderList.add(order);
	}
	public void placeOrder() {
		
		for (Order order : orderList) {
			order.execute();
		}
		orderList.clear();
	}
}
