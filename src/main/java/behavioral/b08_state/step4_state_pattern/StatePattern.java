package behavioral.b08_state.step4_state_pattern;

import behavioral.b08_state.step2_concrete_classes.StartState;
import behavioral.b08_state.step2_concrete_classes.StopState;
import behavioral.b08_state.step3_context_class.Context;

public class StatePattern {
	public static void main(String[] args) {
		Context context = new Context();

		StartState startState = new StartState();
		startState.doAction(context);

		System.out.println(context.getState().toString());

		StopState stopState = new StopState();
		stopState.doAction(context);

		System.out.println(context.getState().toString());
	}
}