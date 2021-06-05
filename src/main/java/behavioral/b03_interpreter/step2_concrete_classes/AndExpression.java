package behavioral.b03_interpreter.step2_concrete_classes;

import behavioral.b03_interpreter.step1_expression_interface.Expression;

/**
 * AND expression implementation
 * 
 * @author Pedro
 *
 */
public class AndExpression implements Expression {
	private Expression expr1;
	private Expression expr2;

	public AndExpression(Expression expr1, Expression expr2) {
		this.expr1 = expr1;
		this.expr2 = expr2;
	}

	@Override
	public boolean interpret(String context) {
		return expr1.interpret(context) && expr2.interpret(context);
	}
}
