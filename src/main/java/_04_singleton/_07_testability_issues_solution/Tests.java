package _04_singleton._07_testability_issues_solution;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class Tests {

    @Test
    public void singletonTotalPopulationTest() {
        DummyDatabase dummyDatabase = new DummyDatabase();
        ConfigurableRecordFinder finder = new ConfigurableRecordFinder(dummyDatabase);

        // We are not using the live DB now at all but a dummy database!
        // This is a unit test!
        Assert.assertEquals(4, finder.getTotalPopulation(List.of("alpha", "gamma")));
    }
}
