package structural.s02_bridge.step5_bridge_pattern;

import structural.s02_bridge.step1_implementer_interface.DrawAPI;
import structural.s02_bridge.step2_concrete_implementer_class.GreenCircle;
import structural.s02_bridge.step2_concrete_implementer_class.RedCircle;
import structural.s02_bridge.step3_bridge_abstract_class.Shape;
import structural.s02_bridge.step4_bridge_concrete_class.Circle;

public class BridgePattern {
	public static void main(String[] args) {
		invoque(new RedCircle());
		invoque(new GreenCircle());
	}

	private static void invoque(DrawAPI drawAPI) {
		Shape shape = new Circle(100, 100, 10, drawAPI);
		shape.draw();
	}
}
