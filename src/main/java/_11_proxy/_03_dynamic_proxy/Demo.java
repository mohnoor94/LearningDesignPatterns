package _11_proxy._03_dynamic_proxy;

import _11_proxy._01_protiction_proxy.Car;
import _11_proxy._01_protiction_proxy.Drivable;
import _11_proxy._01_protiction_proxy.Driver;

public class Demo {

    public static void main(String[] args) {
        example1();
        System.out.println("=====");
        example2();
    }

    private static void example1() {
        Person person = new Person();
        Human loggedPerson = Utils.withLogging(person, Human.class);

        loggedPerson.talk();
        loggedPerson.walk();
        loggedPerson.walk();

        System.out.println(loggedPerson);
    }

    private static void example2() {
        Car car = new Car(new Driver("Noor", 25));
        Drivable loggedCar = Utils.withLogging(car, Drivable.class);

        loggedCar.drive();
        loggedCar.drive();
        loggedCar.drive();

        System.out.println(loggedCar);
    }
}
