package behavioral.b10_strategy.step2_concrete_classes;

import behavioral.b10_strategy.step1_strategy_interface.Strategy;

public class OperationMultiply implements Strategy {

	@Override
	public int doOperation(int num1, int num2) {
		return num1 * num2;
	}
}
