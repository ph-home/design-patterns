package behavioral.b08_state.step2_concrete_classes;

import behavioral.b08_state.step1_interface.State;
import behavioral.b08_state.step3_context_class.Context;

public class StartState implements State {

	public void doAction(Context context) {
		System.out.println("Player is in start state");
		context.setState(this);
	}

	public String toString() {
		return "Start State";
	}
}