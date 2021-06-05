package behavioral.b07_observer.step3_concrete_observer_classes;

import behavioral.b07_observer.step1_subject_class.Subject;
import behavioral.b07_observer.step2_observer_class.Observer;

import java.util.logging.Logger;

public class BinaryObserver extends Observer {
	private static final Logger LOGGER = Logger.getGlobal();

	public BinaryObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		LOGGER.fine(() -> "Binary String: " + Integer.toBinaryString(subject.getState()));
	}
}
