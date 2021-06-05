package creational.c04_builder.step4_classes;

import creational.c04_builder.step3_abstract_classes.Burger;

public class VegBurger extends Burger {
	@Override
	public String name() {
		return "Veg Burger";
	}

	@Override
	public float price() {
		return 25.0f;
	}
}
