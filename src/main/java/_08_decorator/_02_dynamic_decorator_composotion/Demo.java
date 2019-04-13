package _08_decorator._02_dynamic_decorator_composotion;

public class Demo {

    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println(circle.info());

        ColoredShape blueSquare = new ColoredShape(
                new Square(6), "blue"
        );
        System.out.println(blueSquare.info());

        TransparentShape transparentRedCircle = new TransparentShape(
                new ColoredShape(
                        new Circle(35), "red"
                ), 40
        );
        System.out.println(transparentRedCircle.info());

        // transparentRedCircle.resize(5); // we cannot do that, transparentRedCircle is a Shape but not a Circle
    }
}
