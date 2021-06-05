package creational.c04_builder.step2_packing_classes;

import creational.c04_builder.step1_interface.Packing;

public class Bottle implements Packing {

	@Override
	public String pack() {
		return "Bottle"; 
	}

}
