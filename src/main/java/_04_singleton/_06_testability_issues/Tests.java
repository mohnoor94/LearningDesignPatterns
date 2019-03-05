package _04_singleton._06_testability_issues;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class Tests {

    @Test
    public void singletonTotalPopulationTest() {
        SingletonRecordFinder finder = new SingletonRecordFinder();

        // The problem: I have to use the data from the live database
        // which:
        // - may change!
        // - make this an integration test, not a unit test for our code
        // - may not be reachable all the times
        // - add extra cost
        // - ...
        // and I have to know the contents of the DB

        List<String> names = List.of("Seoul", "Mexico City");
        int totalPopulation = finder.getTotalPopulation(names);

        Assert.assertEquals(17500000 + 17400000, totalPopulation);
    }
}
