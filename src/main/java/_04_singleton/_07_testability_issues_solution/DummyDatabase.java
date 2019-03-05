package _04_singleton._07_testability_issues_solution;

import java.util.HashMap;
import java.util.Map;

public class DummyDatabase implements Database {

    private Map<String, Integer> data = new HashMap<>();


    public DummyDatabase() {
        data.put("alpha", 1);
        data.put("beta", 2);
        data.put("gamma", 3);
    }

    @Override
    public int getPopulation(String name) {
        return data.get(name);
    }
}
