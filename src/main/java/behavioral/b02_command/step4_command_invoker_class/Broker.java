package behavioral.b02_command.step4_command_invoker_class;

import java.util.ArrayList;
import java.util.List;

import behavioral.b02_command.step1_interface.Order;

public class Broker {
	private List<Order> orderList = new ArrayList<>();

	public void takeOrder(Order order) {
		orderList.add(order);
	}

	public void placeOrders() {
		for (Order order : orderList) {
			order.execute();
		}
		orderList.clear();
	}
}