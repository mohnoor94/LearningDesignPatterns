package _02_factories._03_abstract_factory;

import org.javatuples.Pair;
import org.reflections.Reflections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HotDrinkMachine {

    // find all the factories that are able to prepare hot drinks - by reflection -
    private List<Pair<String, HotDrinkFactory>> namedFactories = new ArrayList<>();

    public HotDrinkMachine()
            throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // find all the inheritance/implementers of HotDrinkFactory interface and add them to my list

        Set<Class<? extends HotDrinkFactory>> types = new Reflections("").getSubTypesOf(HotDrinkFactory.class);

        for (Class<? extends HotDrinkFactory> type : types) {
            namedFactories.add(new Pair<>(
                    type.getSimpleName().replace("Factory", ""),
                    type.getDeclaredConstructor().newInstance()
            ));
        }
    }

    public HotDrink makeDrink() throws IOException {
        // tell the user what kinds of drinks we can make
        System.out.println("Available drinks:");

        for (int i = 0; i < namedFactories.size(); i++) {
            Pair<String, HotDrinkFactory> pair = namedFactories.get(i);
            System.out.println(i + ": " + pair.getValue0());
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        int option;
        int amount;

        while (true) {
            if ((input = reader.readLine()) != null
                    && (option = Integer.parseInt(input)) >= 0
                    && option < namedFactories.size()) {
                System.out.println("Specify amount: ");
                input = reader.readLine();
                if (input != null && (amount = Integer.parseInt(input)) > 0) {
                    return namedFactories.get(option).getValue1().prepare(amount);
                }
            }

            // in case of incorrect input
            System.out.println("Incorrect type, please try again");
        }
    }
}
