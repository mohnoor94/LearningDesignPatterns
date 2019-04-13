package _08_decorator._03_static_decorator_composotion;

public class Circle implements Shape {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void resize(double factor) {
        factor *= factor;
    }

    @Override
    public String info() {
        return "A circle of radius " + radius;
    }
}
