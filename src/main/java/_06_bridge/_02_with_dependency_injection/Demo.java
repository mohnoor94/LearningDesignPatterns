package _06_bridge._02_with_dependency_injection;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Demo {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new ShapeModule());
        Circle circle = injector.getInstance(Circle.class);
        circle.setRadius(3);
        circle.draw();
        circle.resize(2.5f);
        circle.draw();
    }
}
