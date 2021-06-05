package behavioral.b06_memento.step2_originator_class;

import behavioral.b06_memento.step1_memento_class.Memento;

public class Originator {
	private String state;

	public void setState(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public Memento saveStateToMemento() {
		return new Memento(state);
	}

	public void getStateFromMemento(Memento memento) {
		state = memento.getState();
	}
}
