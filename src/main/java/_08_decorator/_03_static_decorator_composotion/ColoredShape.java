package _08_decorator._03_static_decorator_composotion;

import java.util.function.Supplier;

// OCP - Decorator
public class ColoredShape<T extends Shape> implements Shape {
    private Shape shape;
    private String color;

    public ColoredShape(Supplier<? extends T> shapeConstrictor, String color) {
        this.shape = shapeConstrictor.get(); // we cannot write shape = new T();
        this.color = color;
    }

    @Override
    public String info() {
        return shape.info() + " has the color " + color;
    }
}
