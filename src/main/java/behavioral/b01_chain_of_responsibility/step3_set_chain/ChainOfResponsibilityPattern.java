package behavioral.b01_chain_of_responsibility.step3_set_chain;

import behavioral.b01_chain_of_responsibility.step1_abstract_class.AbstractLogger;
import behavioral.b01_chain_of_responsibility.step2_concrete_classes.ConsoleLogger;
import behavioral.b01_chain_of_responsibility.step2_concrete_classes.ErrorLogger;
import behavioral.b01_chain_of_responsibility.step2_concrete_classes.FileLogger;

public class ChainOfResponsibilityPattern {

	private static AbstractLogger getChainOfLoggers() {
		// declare loggers
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.INFO);
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.DEBUG);

		// set chain
		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);

		// return top level of chain
		return errorLogger;
	}

	public static void main(String[] args) {
		AbstractLogger loggerChain = getChainOfLoggers();

		loggerChain.logMessage(AbstractLogger.DEBUG, "debug message");
		loggerChain.logMessage(AbstractLogger.INFO, "info message");
		loggerChain.logMessage(AbstractLogger.ERROR, "error message");
	}
}
