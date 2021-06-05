package creational.c02_abstract_factory.step5_factory_producer;

import creational.c02_abstract_factory.step3_abstract_class.AbstractFactory;
import creational.c02_abstract_factory.step4_factory_classes.RoundedShapeFactory;
import creational.c02_abstract_factory.step4_factory_classes.ShapeFactory;

public class FactoryProducer {
    private FactoryProducer() {
    }

    public static AbstractFactory getFactory(boolean rounded) {
        if (rounded) {
            return new RoundedShapeFactory();
        } else {
            return new ShapeFactory();
        }
    }

}
