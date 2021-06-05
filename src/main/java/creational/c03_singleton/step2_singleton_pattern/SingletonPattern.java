package creational.c03_singleton.step2_singleton_pattern;

import creational.c03_singleton.step1_singleton_class.Singleton;

public class SingletonPattern {

	public static void main(String[] args) {
		invoque();
		invoque();
		invoque();
		invoque();
	}

	private static void invoque() {
		// Get the only object available
		Singleton object = Singleton.INSTANCE;

		// show the message
		object.showMessage();
	}
}
