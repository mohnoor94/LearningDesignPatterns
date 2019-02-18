package _02_factories._02_factory._2_internal_factory;

public class Demo {

    public static void main(String[] args) {
        Point cartesianPoint = Point.Factory.newCartesianPoint(10, 5);
        Point polarPoint = Point.Factory.newPolarPoint(20, 30);

        System.out.println(cartesianPoint);
        System.out.println(polarPoint);

        // here, we do not have access to the Point's constructor
        // this way could be useful if we do have access to original class (Point)
    }
}
