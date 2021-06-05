package behavioral.b03_interpreter.step3_interpreter_pattern;

import behavioral.b03_interpreter.step1_expression_interface.Expression;
import behavioral.b03_interpreter.step2_concrete_classes.AndExpression;
import behavioral.b03_interpreter.step2_concrete_classes.OrExpression;
import behavioral.b03_interpreter.step2_concrete_classes.TerminalExpression;

public class InterpreterPattern {
	// Rule: Robert and John are male
	public static Expression getMaleExpression() {
		Expression robert = new TerminalExpression("Robert");
		Expression john = new TerminalExpression("John");
		return new OrExpression(robert, john);
	}

	// Rule: Julie is a married women
	public static Expression getMarriedWomanExpression() {
		Expression julie = new TerminalExpression("Julie");
		Expression married = new TerminalExpression("Married");
		return new AndExpression(julie, married);
	}

	public static void main(String[] args) {
		Expression isMale = getMaleExpression();
		Expression isMarriedWoman = getMarriedWomanExpression();

		System.out.println("John is male? " + isMale.interpret("John"));
		System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));
	}
}
