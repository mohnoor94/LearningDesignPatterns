package _08_decorator._03_static_decorator_composotion;

import java.util.function.Supplier;

// OCP - Decorator
public class TransparentShape<T extends Shape> implements Shape {
    private Shape shape;
    private int transparency;

    public TransparentShape(Supplier<? extends T> shapeConstrictor, int transparency) {
        this.shape = shapeConstrictor.get(); // we cannot write shape = new T();
        this.transparency = transparency;
    }

    @Override
    public String info() {
        return shape.info() + " has " + transparency + "% transparency";
    }
}
