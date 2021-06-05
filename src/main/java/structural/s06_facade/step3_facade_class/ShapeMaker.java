package structural.s06_facade.step3_facade_class;

import structural.s06_facade.step1_interface.Shape;
import structural.s06_facade.step2_concrete_classes_for_interface.Circle;
import structural.s06_facade.step2_concrete_classes_for_interface.Rectangle;
import structural.s06_facade.step2_concrete_classes_for_interface.Square;

public class ShapeMaker {
	private Shape circle;
	private Shape rectangle;
	private Shape square;

	public ShapeMaker() {
		circle = new Circle();
		rectangle = new Rectangle();
		square = new Square();
	}

	public void drawCircle() {
		circle.draw();
	}

	public void drawRectangle() {
		rectangle.draw();
	}

	public void drawSquare() {
		square.draw();
	}
}
