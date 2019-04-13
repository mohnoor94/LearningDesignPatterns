package _08_decorator._02_dynamic_decorator_composotion;

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
