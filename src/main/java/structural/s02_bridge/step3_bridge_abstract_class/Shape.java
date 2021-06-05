package structural.s02_bridge.step3_bridge_abstract_class;

import structural.s02_bridge.step1_implementer_interface.DrawAPI;

public abstract class Shape {
	protected DrawAPI drawAPI;

	protected Shape(DrawAPI drawAPI) {
		this.drawAPI = drawAPI;
	}

	public abstract void draw();
}
