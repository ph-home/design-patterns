package creational.c02_abstract_factory.step6_abstract_factory_pattern;

import creational.c02_abstract_factory.step1_interface.Shape;
import creational.c02_abstract_factory.step3_abstract_class.AbstractFactory;
import creational.c02_abstract_factory.step5_factory_producer.FactoryProducer;

public class AbstractFactoryPattern {

	public static void main(String[] args) {
		invoque(true, AbstractFactory.RECTANGLE);
		invoque(true, AbstractFactory.SQUARE);
		invoque(false, AbstractFactory.RECTANGLE);
		invoque(false, AbstractFactory.SQUARE);
	}

	private static void invoque(boolean factoryType, int shapeType) {
		// get shape factory
		AbstractFactory shapeFactory = FactoryProducer.getFactory(factoryType);

		// get an object of shapeType
		Shape shape = shapeFactory.getShape(shapeType);

		// call method on object
		shape.draw();
	}
}
