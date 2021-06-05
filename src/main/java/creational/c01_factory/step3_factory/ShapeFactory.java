package creational.c01_factory.step3_factory;

import creational.c01_factory.step1_interface.Shape;
import creational.c01_factory.step2_classes.Circle;
import creational.c01_factory.step2_classes.Rectangle;
import creational.c01_factory.step2_classes.Square;

public class ShapeFactory {

	// use getShape method to get object of type shape
	public Shape getShape(int shapeType) {
		return switch (shapeType) {
			case Shape.CIRCLE -> new Circle();
			case Shape.RECTANGLE -> new Rectangle();
			case Shape.SQUARE -> new Square();
			default -> null;
		};
	}
}
