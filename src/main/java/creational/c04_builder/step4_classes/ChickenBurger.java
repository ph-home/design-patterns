package creational.c04_builder.step4_classes;

import creational.c04_builder.step3_abstract_classes.Burger;

public class ChickenBurger extends Burger {
	@Override
	public String name() {
		return "Chicken Burger";
	}

	@Override
	public float price() {
		return 50.2f;
	}
}
