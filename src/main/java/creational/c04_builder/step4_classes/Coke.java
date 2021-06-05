package creational.c04_builder.step4_classes;

import creational.c04_builder.step3_abstract_classes.ColdDrink;

public class Coke extends ColdDrink {
	@Override
	public String name() {
		return "Coke";
	}

	@Override
	public float price() {
		return 30.2f;
	}
}
