package _02_factories._03_abstract_factory;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class Demo {

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException,
            InstantiationException, IllegalAccessException, IOException {
        HotDrinkMachine machine = new HotDrinkMachine();
        HotDrink drink = machine.makeDrink();
        drink.consume();
    }
}
