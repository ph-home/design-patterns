package creational.c03_singleton.step1_singleton_class;

public enum Singleton {
	INSTANCE;

	int counter;

	public int getValue() {
		return counter;
	}

	public void showMessage() {
		System.out.printf("Hello from #%d%n", (this.counter++));
	}
}
