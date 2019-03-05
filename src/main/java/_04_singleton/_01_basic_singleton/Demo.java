package _04_singleton._01_basic_singleton;

import _util.file.Store;

import java.io.IOException;

public class Demo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        BasicSingleton singleton1 = BasicSingleton.getINSTANCE();
        System.out.println(singleton1.getValue());
        singleton1.setValue(10);
        System.out.println(singleton1.getValue());
        System.out.println("-----");

        // A problem with this basic design:
        // We can get more than one instance of this singleton! via:
        // - Reflection
        // - Serialization

        // Example of serialization issue:

        String fileName = "singleton.bin";
        Store.save(singleton1, fileName);

        singleton1.setValue(20);

        BasicSingleton singleton2 = Store.read(BasicSingleton.class, fileName);

        // There will be 2 instances of the singleton before we solve the problem
        // by implementing the 'readResolve' method inside our singleton object.
        // Now there will be only once

        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.getValue());
        System.out.println(singleton2.getValue());
    }

}
