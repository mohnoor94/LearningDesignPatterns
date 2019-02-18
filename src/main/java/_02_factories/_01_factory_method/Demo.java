package _02_factories._01_factory_method;

public class Demo {

    public static void main(String[] args) {

        BadPoint cartesianBadPoint = new BadPoint(5, 10, CoordinateSystem.CARTESIAN);
        BadPoint polarBadPoint = new BadPoint(50, 70, CoordinateSystem.POLAR);

        System.out.println(cartesianBadPoint);
        System.out.println(polarBadPoint);
        System.out.println("-----------");

        GoodPoint cartesianGoodPoint = GoodPoint.newCartesianPoint(5, 10);
        GoodPoint polarGoodPoint = GoodPoint.newPolarPoint(50, 70);

        System.out.println(cartesianGoodPoint);
        System.out.println(polarGoodPoint);
    }
}
