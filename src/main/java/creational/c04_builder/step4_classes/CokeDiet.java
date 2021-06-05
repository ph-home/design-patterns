package creational.c04_builder.step4_classes;

import creational.c04_builder.step3_abstract_classes.ColdDrink;

public class CokeDiet extends ColdDrink {
	@Override
	public String name() {
		return "Coke Diet";
	}

	@Override
	public float price() {
		return 30.2f;
	}
}
