package _02_factories._02_factory._2_internal_factory;

public class Point {

    private double x;
    private double y;

    private Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static class Factory {

        public static Point newCartesianPoint(double x, double y) {
            return new Point(x, y);
        }

        public static Point newPolarPoint(double rho, double theta) {
            return new Point(rho * Math.cos(theta), rho * Math.sin(theta));
        }
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
