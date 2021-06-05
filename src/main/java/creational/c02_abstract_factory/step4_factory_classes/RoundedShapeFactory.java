package creational.c02_abstract_factory.step4_factory_classes;

import creational.c02_abstract_factory.step1_interface.Shape;
import creational.c02_abstract_factory.step2_classes.RoundedRectangle;
import creational.c02_abstract_factory.step2_classes.RoundedSquare;
import creational.c02_abstract_factory.step3_abstract_class.AbstractFactory;

public class RoundedShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(int shapeType) {
		return switch (shapeType) {
			case RECTANGLE -> new RoundedRectangle();
			case SQUARE -> new RoundedSquare();
			default -> null;
		};
	}
}
