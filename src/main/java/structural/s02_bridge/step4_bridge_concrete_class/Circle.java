package structural.s02_bridge.step4_bridge_concrete_class;

import structural.s02_bridge.step1_implementer_interface.DrawAPI;
import structural.s02_bridge.step3_bridge_abstract_class.Shape;

public class Circle extends Shape {
	private int x;
	private int y;
	private int radius;

	public Circle(int x, int y, int radius, DrawAPI drawAPI) {
		super(drawAPI);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public void draw() {
		drawAPI.drawCircle(radius, x, y);
	}
}
