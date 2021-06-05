package behavioral.b02_command.step3_concrete_classes;

import behavioral.b02_command.step1_interface.Order;
import behavioral.b02_command.step2_request_class.Stock;

public class SellStock implements Order {
	private Stock abcStock;

	public SellStock(Stock abcStock) {
		this.abcStock = abcStock;
	}

	public void execute() {
		abcStock.sell();
	}
}
