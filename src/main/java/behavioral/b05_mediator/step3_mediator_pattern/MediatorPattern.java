package behavioral.b05_mediator.step3_mediator_pattern;

import behavioral.b05_mediator.step2_user_class.User;

public class MediatorPattern {
	public static void main(String[] args) {
		User robert = new User("Robert");
		User john = new User("John");

		robert.sendMessage("Hi! John!");
		john.sendMessage("Hello! Robert!");
	}
}
