package creational.c02_abstract_factory.step4_factory_classes;

import creational.c02_abstract_factory.step1_interface.Shape;
import creational.c02_abstract_factory.step2_classes.Rectangle;
import creational.c02_abstract_factory.step2_classes.Square;
import creational.c02_abstract_factory.step3_abstract_class.AbstractFactory;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(int shapeType) {
		return switch (shapeType) {
			case RECTANGLE -> new Rectangle();
			case SQUARE -> new Square();
			default -> null;
		};
	}
}
