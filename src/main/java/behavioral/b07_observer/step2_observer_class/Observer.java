package behavioral.b07_observer.step2_observer_class;

import behavioral.b07_observer.step1_subject_class.Subject;

public abstract class Observer {
	protected Subject subject;
	public abstract void update();
}