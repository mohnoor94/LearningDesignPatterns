package _01_solid_design_principles.single_responsibility;

import java.util.ArrayList;
import java.util.List;

public class Journal {

    private final List<String> entries = new ArrayList<>();
    private static int count = 0;

    public void addEntry(String text) {
        entries.add(++count + ": " + text);
    }

    public void removeEntry(int index) {
        entries.remove(index);
    }

    // --> make a class for the (save and load) concern!
    // public void save (String fileName) {...}
    // public void load (String fileName) {...}
    // public void load (URL url) {...}

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }
}
