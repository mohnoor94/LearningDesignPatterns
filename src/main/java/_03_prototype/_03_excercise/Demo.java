package _03_prototype._03_excercise;

public class Demo {

    public static void main(String[] args) {
        Line line1 = new Line(new Point(0, 0), new Point(10, 5));

        Line line2 = line1.deepCopy();
        line2.setEnd(new Point(5, 10));

        System.out.println(line1);
        System.out.println(line2);
    }
}
