package _04_singleton._08_excercise_is_singleton;

import java.util.function.Supplier;

public class SingletonTester {

    public static boolean isSingleton(Supplier<Object> func) {
        return func.get() == func.get();
    }
}