package structural.s05_decorator.step2_concrete_classes_for_interface;

import structural.s05_decorator.step1_interface.Shape;

public class Rectangle implements Shape {
	@Override
	public void draw() {
		System.out.println("Rectangle");
	}

	@Override
	public String name() {
		return "Rectangle";
	}
}
