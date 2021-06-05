package structural.s05_decorator.step4_concrete_decorator_class;

import structural.s05_decorator.step1_interface.Shape;
import structural.s05_decorator.step3_abstract_decorator_class.ShapeDecorator;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    @Override
    public String name() {
        return "RedShapeDecorator";
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.printf("    %s Border color red%n", decoratedShape.name());
    }
}
