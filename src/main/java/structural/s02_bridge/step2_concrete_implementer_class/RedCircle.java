package structural.s02_bridge.step2_concrete_implementer_class;

import structural.s02_bridge.step1_implementer_interface.DrawAPI;

public class RedCircle implements DrawAPI {
	private static final String COLOR = "red";

	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.printf((DrawAPI.DRAW) + "%n", COLOR, radius, x, y);
	}
}
