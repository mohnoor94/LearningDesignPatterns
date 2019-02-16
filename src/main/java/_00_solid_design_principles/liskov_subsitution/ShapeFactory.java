package _00_solid_design_principles.liskov_subsitution;

public class ShapeFactory {

    public static Rectangle newRectangle(int height, int width){
        return new Rectangle(height, width);
    }

    public static Rectangle newSquare(int side){
        return new Rectangle(side, side);
    }
}