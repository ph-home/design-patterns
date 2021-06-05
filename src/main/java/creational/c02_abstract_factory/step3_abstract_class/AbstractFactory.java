package creational.c02_abstract_factory.step3_abstract_class;

import creational.c02_abstract_factory.step1_interface.Shape;

public abstract class AbstractFactory {
	public static final int RECTANGLE = 1;
	public static final int SQUARE = 2;

	public abstract Shape getShape (int shapeType);
}
