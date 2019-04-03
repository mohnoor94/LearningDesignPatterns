package _07_composite._01_using_children;

public class Demo {

    public static void main(String[] args) {
        GraphicObject drawing = new GraphicObject();
        drawing.setName("My Drawing");

        drawing.addChild(new Square("Red"));
        drawing.addChild(new Circle("Blue"));


        GraphicObject group = new GraphicObject();
        group.addChild(new Square("Purple"));
        group.addChild(new Square("Yellow"));

        drawing.addChild(group); // <== the magic

        System.out.println(drawing);
    }
}
