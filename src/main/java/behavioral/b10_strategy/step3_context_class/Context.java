package behavioral.b10_strategy.step3_context_class;

import behavioral.b10_strategy.step1_strategy_interface.Strategy;

public class Context {
	private Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	public int executeStrategy(int num1, int num2) {
		return strategy.doOperation(num1, num2);
	}
}
