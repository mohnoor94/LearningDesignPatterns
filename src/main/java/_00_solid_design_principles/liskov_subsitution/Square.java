package _00_solid_design_principles.liskov_subsitution;

public class Square extends Rectangle {

    public Square() {
    }

    public Square(int side) {
        super(side, side);
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }
}
