package behavioral.b07_observer.step1_subject_class;

import java.util.ArrayList;
import java.util.List;

import behavioral.b07_observer.step2_observer_class.Observer;

public class Subject {
	private List<Observer> observers = new ArrayList<>();
	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		notifyAllObservers();
	}

	public void attach(Observer observer) {
		observers.add(observer);
	}

	public void notifyAllObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
}