package _02_factories._01_factory_method;

public class GoodPoint {

    private double x;
    private double y;

    // hide constructor to force/guide the user to use factory methods
    private GoodPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static GoodPoint newCartesianPoint(double x, double y) {
        return new GoodPoint(x, y);
    }

    public static GoodPoint newPolarPoint(double rho, double theta) {
        return new GoodPoint(rho * Math.cos(theta), rho * Math.sin(theta));
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}