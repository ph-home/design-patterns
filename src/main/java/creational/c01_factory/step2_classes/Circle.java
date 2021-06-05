package creational.c01_factory.step2_classes;

import creational.c01_factory.step1_interface.Shape;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Circle");
	}

}
