package behavioral.b07_observer.step4_observer_pattern;

import behavioral.b07_observer.step1_subject_class.Subject;
import behavioral.b07_observer.step3_concrete_observer_classes.BinaryObserver;
import behavioral.b07_observer.step3_concrete_observer_classes.HexaObserver;
import behavioral.b07_observer.step3_concrete_observer_classes.OctalObserver;

public class ObserverPattern {
	public static void main(String[] args) {
		Subject subject = new Subject();

		new HexaObserver(subject);
		new OctalObserver(subject);
		new BinaryObserver(subject);

		System.out.println("First state change: 15");
		subject.setState(15);
		System.out.println("Second state change: 10");
		subject.setState(10);
	}
}
