package _11_proxy._03_dynamic_proxy;

public class Person implements Human {
    @Override
    public void talk() {
        System.out.println("I'm talking...");
    }

    @Override
    public void walk() {
        System.out.println("I'm walking...");
    }
}
