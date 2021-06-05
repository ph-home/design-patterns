package behavioral.b08_state.step3_context_class;

import behavioral.b08_state.step1_interface.State;

public class Context {
	private State state;

	public Context() {
		state = null;
	}

	public void setState(State state) {
		this.state = state;
	}

	public State getState() {
		return state;
	}
}
