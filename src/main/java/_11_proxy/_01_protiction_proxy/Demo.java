package _11_proxy._01_protiction_proxy;

public class Demo {

    public static void main(String[] args) {
        Driver noor = new Driver("Noor", 25);
        Driver alix = new Driver("Alix", 15);

        new Car(noor).drive();
        new CarProxy(noor).drive();

        System.out.println("=====");

        new Car(alix).drive();
        new CarProxy(alix).drive();
    }
}
