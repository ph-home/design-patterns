package creational.c04_builder.step3_abstract_classes;

import creational.c04_builder.step1_interface.Item;
import creational.c04_builder.step1_interface.Packing;
import creational.c04_builder.step2_packing_classes.Wrapper;

public abstract class ColdDrink implements Item {
	@Override
	public Packing packing() {
		return new Wrapper(); 
	}
}
