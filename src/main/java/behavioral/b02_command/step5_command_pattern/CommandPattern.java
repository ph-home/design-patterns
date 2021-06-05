package behavioral.b02_command.step5_command_pattern;

import behavioral.b02_command.step2_request_class.Stock;
import behavioral.b02_command.step3_concrete_classes.BuyStock;
import behavioral.b02_command.step3_concrete_classes.SellStock;
import behavioral.b02_command.step4_command_invoker_class.Broker;

public class CommandPattern {
	public static void main(String[] args) {
		Stock abcStock = new Stock();

		BuyStock buyStockOrder = new BuyStock(abcStock);
		SellStock sellStockOrder = new SellStock(abcStock);

		Broker broker = new Broker();
		broker.takeOrder(buyStockOrder);
		broker.takeOrder(sellStockOrder);

		broker.placeOrders();
	}
}
