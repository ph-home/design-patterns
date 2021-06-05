package behavioral.b01_chain_of_responsibility.step2_concrete_classes;

import behavioral.b01_chain_of_responsibility.step1_abstract_class.AbstractLogger;

public class ConsoleLogger extends AbstractLogger {
	private static final String MESSAGE_FORMAT = "ConsoleLogger: %s";

	public ConsoleLogger(int level) {
		this.level = level;
	}

	@Override
	protected void write(String message) {
		System.out.printf((MESSAGE_FORMAT) + "%n", message);
	}
}
