package behavioral.b07_observer.step3_concrete_observer_classes;

import behavioral.b07_observer.step1_subject_class.Subject;
import behavioral.b07_observer.step2_observer_class.Observer;

public class HexaObserver extends Observer {

	public HexaObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.printf("Hex String: %s%n", Integer.toHexString(subject.getState()));
	}
}
