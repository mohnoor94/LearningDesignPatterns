package _11_proxy._01_protiction_proxy;

public class Car implements Drivable {
    private Driver driver;

    public Car(Driver driver) {
        this.driver = driver;
    }

    @Override
    public void drive() {
        System.out.println("Car being driven");
    }

    public Driver getDriver() {
        return driver;
    }
}
