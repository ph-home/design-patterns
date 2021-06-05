package behavioral.b06_memento.step1_memento_class;

public class Memento {
	private final String state;

	public Memento(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}
}
