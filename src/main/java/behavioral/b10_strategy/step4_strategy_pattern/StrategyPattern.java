package behavioral.b10_strategy.step4_strategy_pattern;

import behavioral.b10_strategy.step2_concrete_classes.OperationAdd;
import behavioral.b10_strategy.step2_concrete_classes.OperationMultiply;
import behavioral.b10_strategy.step2_concrete_classes.OperationSubtract;
import behavioral.b10_strategy.step3_context_class.Context;

public class StrategyPattern {
	public static void main(String[] args) {
		Context context = new Context(new OperationAdd());
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

		context = new Context(new OperationSubtract());
		System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

		context = new Context(new OperationMultiply());
		System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
	}
}
