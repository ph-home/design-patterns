package structural.s06_facade.step2_concrete_classes_for_interface;

import structural.s06_facade.step1_interface.Shape;

public class Square implements Shape {
	@Override
	public void draw() {
		System.out.println("Square");
	}
}
