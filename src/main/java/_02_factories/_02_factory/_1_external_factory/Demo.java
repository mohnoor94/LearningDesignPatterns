package _02_factories._02_factory._1_external_factory;

public class Demo {

    public static void main(String[] args) {
        Point cartesianPoint = PointFactory.newCartesianPoint(10, 5);
        Point polarPoint = PointFactory.newPolarPoint(20, 30);

        System.out.println(cartesianPoint);
        System.out.println(polarPoint);

        // here, we still have access to the Point's constructor
        Point point = new Point(10, 5);

        System.out.println(point);

        // this way could be useful if we do not have access to original class (Point)
    }
}
