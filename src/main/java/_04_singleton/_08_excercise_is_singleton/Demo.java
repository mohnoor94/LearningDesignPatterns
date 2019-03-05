package _04_singleton._08_excercise_is_singleton;

import java.util.Random;

public class Demo {

    public static void main(String[] args) {

        System.out.println(SingletonTester.isSingleton(() -> false));
        System.out.println(SingletonTester.isSingleton(() -> "hello"));
        System.out.println(SingletonTester.isSingleton(() -> new String("hello")));
        System.out.println(SingletonTester.isSingleton(() -> new Random(5)));
    }
}
