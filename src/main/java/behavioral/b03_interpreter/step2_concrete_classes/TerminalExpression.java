package behavioral.b03_interpreter.step2_concrete_classes;

import behavioral.b03_interpreter.step1_expression_interface.Expression;

public class TerminalExpression implements Expression {
	private String data;

	public TerminalExpression(String data) {
		this.data = data;
	}

	@Override
	public boolean interpret(String context) {
		return context.contains(data);
	}
}
