package _04_singleton._06_testability_issues;

import java.util.List;

public class SingletonRecordFinder {

    // Problematic method
    // In dependency inversion principle; you should depend on abstractions
    // here we depend on a concrete implementation of the DB!
    // Solution in ConfigurableRecordFinder class in package 07

    public int getTotalPopulation(List<String> names) {
        int result = 0;
        for (String name : names) {
            result += SingletonDatabase.getINSTANCE().getPopulation(name);
        }
        return result;
    }
}
