package _01_solid_design_principles.liskov_subsitution;

public class Demo {

    public static void main(String[] args) {
        useIt(new Rectangle(10, 20));
        useIt(new Square(5)); // violation of LSP
        System.out.println("-----");

        // possible solution:
        // don't use a separate class for square
        // but add a method isSquare to Rectangle class to determine if a certain rectangle is also is a square

        // another solution:
        // use a factory design pattern

        useIt(ShapeFactory.newRectangle(10,20));
        useIt(ShapeFactory.newSquare(5));
    }

    private static void useIt(Rectangle rectangle){
        int width = rectangle.getWidth();
        rectangle.setHeight(10);

        System.out.println("Expected area of " + (width * 10) + ", got " + rectangle.getArea());
    }
}
