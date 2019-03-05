package _04_singleton._07_testability_issues_solution;

import java.util.List;

public class ConfigurableRecordFinder {

    private Database database; // <-- dependency injection

    public ConfigurableRecordFinder(Database database) {
        this.database = database;
    }

    public int getTotalPopulation(List<String> names) {
        int result = 0;
        for (String name : names) {
            result += database.getPopulation(name); // <-- use ur injected DB!
        }
        return result;
    }
}
