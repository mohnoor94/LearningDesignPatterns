package _02_factories._01_factory_method;

enum CoordinateSystem {
    CARTESIAN,
    POLAR
}

public class BadPoint {

    private double x;
    private double y;


    /**
     * @param a  is x if cartesian or rho if polar
     * @param b  is y if cartesian or theta if polar
     * @param cs is coordinate system
     */
    public BadPoint(double a, double b, CoordinateSystem cs) {
        switch (cs) {
            case CARTESIAN:
                x = a;
                y = b;
                break;
            case POLAR:
                x = a * Math.cos(b);
                y = a * Math.sin(b);
                break;
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
