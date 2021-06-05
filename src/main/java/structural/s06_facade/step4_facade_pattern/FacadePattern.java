package structural.s06_facade.step4_facade_pattern;

import structural.s06_facade.step3_facade_class.ShapeMaker;

public class FacadePattern {

	public static void main(String[] args) {
		ShapeMaker shapeMaker = new ShapeMaker();

		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}
}
