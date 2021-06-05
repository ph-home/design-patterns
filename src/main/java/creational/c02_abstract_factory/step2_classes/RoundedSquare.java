package creational.c02_abstract_factory.step2_classes;

import creational.c02_abstract_factory.step1_interface.Shape;

public class RoundedSquare implements Shape {

	@Override
	public void draw() {
		System.out.println("RoundedSquare");
	}

}
