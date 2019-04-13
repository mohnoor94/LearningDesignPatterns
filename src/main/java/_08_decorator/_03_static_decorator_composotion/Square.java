package _08_decorator._03_static_decorator_composotion;

public class Square implements Shape {
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    @Override
    public String info() {
        return "A square with a side of " + side;
    }
}
