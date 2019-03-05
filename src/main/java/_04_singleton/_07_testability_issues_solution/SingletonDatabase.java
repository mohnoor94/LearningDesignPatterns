package _04_singleton._07_testability_issues_solution;

import com.google.common.collect.Iterables;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class SingletonDatabase implements Database {

    private static final SingletonDatabase INSTANCE = new SingletonDatabase();
    private Map<String, Integer> capitals = new HashMap<>();

    private SingletonDatabase() {
        System.out.println("Initializing database...");

        try {
            List<String> lines = Files.readAllLines(
                    Paths.get(Objects.requireNonNull(getClass().getClassLoader().getResource("capitals.txt")).toURI()));

            Iterables.partition(lines, 2)
                    .forEach(kv -> capitals.put(
                            kv.get(0).trim(),
                            Integer.parseInt(kv.get(1))
                    ));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }

    public static SingletonDatabase getINSTANCE() {
        return INSTANCE;
    }

    @Override
    public int getPopulation(String name) {
        return capitals.get(name);
    }
}
