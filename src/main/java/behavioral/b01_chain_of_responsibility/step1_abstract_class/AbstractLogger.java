package behavioral.b01_chain_of_responsibility.step1_abstract_class;

import java.util.logging.Logger;

/**
 * Abstract logger class.
 * 
 * @author Pedro
 *
 */
public abstract class AbstractLogger {
	protected static final Logger LOGGER = Logger.getAnonymousLogger();

	public static final int DEBUG = 1;
	public static final int INFO = 2;
	public static final int ERROR = 3;

	protected int level;

	protected AbstractLogger nextLogger;

	public void setNextLogger(AbstractLogger nextLogger) {
		this.nextLogger = nextLogger;
	}

	public void logMessage(int level, String message) {
		// check if level if eligible
		if (this.level <= level) {
			write(message);
		}

		// chain request
		if (nextLogger != null) {
			nextLogger.logMessage(level, message);
		}
	}

	/**
	 * Abstract message writer
	 * 
	 * @param message to write
	 */
	protected abstract void write(String message);
}
