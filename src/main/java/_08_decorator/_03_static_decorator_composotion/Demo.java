package _08_decorator._03_static_decorator_composotion;


public class Demo {

    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println(circle.info());

        ColoredShape<Square> blueSquare = new ColoredShape<>(
                () -> new Square(6), "blue"
        );
        System.out.println(blueSquare.info());


        TransparentShape<ColoredShape<Circle>> transparentRedCircle = new TransparentShape<>(() ->
                new ColoredShape<>(() ->
                        new Circle(35), "red"
                ), 40
        );
        System.out.println(transparentRedCircle.info());
    }
}
