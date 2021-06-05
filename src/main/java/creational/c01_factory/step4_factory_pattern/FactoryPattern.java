package creational.c01_factory.step4_factory_pattern;

import creational.c01_factory.step1_interface.Shape;
import creational.c01_factory.step3_factory.ShapeFactory;

public class FactoryPattern {

	public static void main(String[] args) {
		invoque(Shape.CIRCLE);
		invoque(Shape.RECTANGLE);
		invoque(Shape.SQUARE);
	}

	private static void invoque(int shapeType) {
		// get shape factory
		ShapeFactory shapeFactory = new ShapeFactory();

		// get an object of shapeType
		Shape shape = shapeFactory.getShape(shapeType);

		// call method on object
		shape.draw();
	}
}
