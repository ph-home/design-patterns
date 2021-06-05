package structural.s07_flyweight.step3_factory_of_concrete_classes;

import structural.s07_flyweight.step1_interface.Shape;
import structural.s07_flyweight.step2_concrete_classes.Circle;

import java.util.HashMap;

public class ShapeFactory {
    private static final HashMap<String, Circle> circleMap = new HashMap<>();

    private ShapeFactory() {
    }

    public static Shape getCircle(String color) {
        return circleMap.computeIfAbsent(color, k -> {
            System.out.println("Created circle " + k);
            return new Circle(k);
        });
    }
}
