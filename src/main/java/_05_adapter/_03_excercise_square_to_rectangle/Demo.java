package _05_adapter._03_excercise_square_to_rectangle;

public class Demo {

    public static void main(String[] args) {
        var rectangle = new SquareToRectangleAdapter(new Square(5));

        System.out.println(rectangle.getHeight());
        System.out.println(rectangle.getWidth());
    }
}