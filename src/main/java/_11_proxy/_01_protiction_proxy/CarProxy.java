package _11_proxy._01_protiction_proxy;

// This could be inject this instead of a Car if you use DI container.
public class CarProxy extends Car {

    public CarProxy(Driver driver) {
        super(driver);
    }

    @Override
    public void drive() {
        if (getDriver().getAge() >= 18) super.drive();
        else System.out.println("Driver too young!!!");
    }
}
