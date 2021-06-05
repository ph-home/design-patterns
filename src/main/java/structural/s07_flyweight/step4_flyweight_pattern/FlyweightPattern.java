package structural.s07_flyweight.step4_flyweight_pattern;

import structural.s07_flyweight.step2_concrete_classes.Circle;
import structural.s07_flyweight.step3_factory_of_concrete_classes.ShapeFactory;

import java.util.Random;
import java.util.stream.IntStream;

public class FlyweightPattern {
	private static final String[] colors = { "red", "green", "blue", "white", "black" };
	private static final Random RANDOM = new Random();


	public static void main(String[] args) {
		IntStream.range(0, 20).mapToObj(i -> (Circle) ShapeFactory.getCircle(colors[getRandom() % colors.length])).forEach(circle -> {
			circle.setX(getRandom());
			circle.setY(getRandom());
			circle.setRadius(getRandom());
			circle.draw();
		});
	}

	private static int getRandom() {
		return RANDOM.nextInt(100);
	}
}
