package structural.s05_decorator.step3_abstract_decorator_class;

import structural.s05_decorator.step1_interface.Shape;

public abstract class ShapeDecorator implements Shape {
	protected Shape decoratedShape;

	protected ShapeDecorator(Shape decoratedShape) {
		this.decoratedShape = decoratedShape;
	}

	@Override
	public void draw() {
		decoratedShape.draw();
	}
}
