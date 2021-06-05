package structural.s05_decorator.step5_decorator_pattern;

import structural.s05_decorator.step1_interface.Shape;
import structural.s05_decorator.step2_concrete_classes_for_interface.Circle;
import structural.s05_decorator.step2_concrete_classes_for_interface.Rectangle;
import structural.s05_decorator.step4_concrete_decorator_class.RedShapeDecorator;

public class DecoratorPattern {
	public static void main(String[] args) {
		invoke(new Circle());
		invoke(new Rectangle());
		invoke(new RedShapeDecorator(new Circle()));
		invoke(new RedShapeDecorator(new Rectangle()));
	}

	private static void invoke(Shape shape) {
		shape.draw();
	}
}
